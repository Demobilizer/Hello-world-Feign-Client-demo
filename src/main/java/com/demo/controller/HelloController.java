package com.demo.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.xml.sax.SAXException;

import com.demo.dto.AnotherCustomerDTO;
import com.demo.dto.CustomerDTO;
import com.demo.feignInterface.AnotherPartnerClient;
import com.demo.feignInterface.YourPartnerClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HelloController {

	@Autowired
	private YourPartnerClient yourPartnerClient;
	
	@Autowired
	private AnotherPartnerClient anotherPartnerClient;
	
	@GetMapping("/hello1")
	public List<CustomerDTO> getHello(@RequestParam("date") String date) throws JsonMappingException, JsonProcessingException {
		System.out.println("date to be passed as an argument: "+LocalDate.parse(date));
		String response = yourPartnerClient.getAllCustomers(LocalDate.parse(date));

		JSONObject xmlJSONObj = XML.toJSONObject(response);

	       JSONObject jsonResponse = (JSONObject) xmlJSONObj.get("query_response_get");
	       JSONObject serv_sinc_meta4_oracle_group = (JSONObject) jsonResponse.get("serv_sinc_meta4_oracle_group");
	       JSONArray periodoArray = (JSONArray) serv_sinc_meta4_oracle_group.get("periodo");
	       
	       List<CustomerDTO> customerDTOs = new ArrayList<>();
	       ObjectMapper objectMapper = new ObjectMapper();
	       
	       for (int i = 0; i < periodoArray.length(); i++) {
			
	    	   JSONObject employeeJson = (JSONObject) periodoArray.get(i);
	    	   CustomerDTO customerDTO = objectMapper.readValue(employeeJson.toString(), CustomerDTO.class);
	    	   customerDTOs.add(customerDTO);
		}
	       
	       System.out.println("customerDtos size: "+customerDTOs.size());
	        
			return customerDTOs;
	}
	
	@GetMapping("/hello")
	public List<AnotherCustomerDTO> getHello() {
		return anotherPartnerClient.getAllCustomersFromDB();
	}
	
	
	@GetMapping("/hello-rest-template")
	public List<CustomerDTO> getAllUsingRestTemplate(@RequestParam("date") String date) throws SAXException, IOException, ParserConfigurationException {
		
		RestTemplate restTemplate = new RestTemplate();
		String url  = "https://meta4.meta4globalhr.com/REST/personnel_administration/v1.00/gmpe_sco_employee_p_0827130311";
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("M4Rest-Organization", "GMGL");
		headers.add("Content-Type", "application/x-www-form-urlencoded");
		headers.add("Authorization", "Basic R01HTF9XU19HRU5FUklDOkNAbnYxQE1AcnowMjAyMA==");
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url).queryParam("effective_date", LocalDate.parse(date));
		
		ResponseEntity<String> response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, request, String.class);
		
		JSONObject xmlJSONObj = XML.toJSONObject(response.getBody().toString());

       JSONObject jsonResponse = (JSONObject) xmlJSONObj.get("query_response_get");
       JSONObject serv_sinc_meta4_oracle_group = (JSONObject) jsonResponse.get("serv_sinc_meta4_oracle_group");
       JSONArray periodoArray = (JSONArray) serv_sinc_meta4_oracle_group.get("periodo");
       
       System.out.println("periodoArray 1: "+periodoArray.getJSONObject(0));
       
       List<CustomerDTO> customerDTOs = new ArrayList<>();
       ObjectMapper objectMapper = new ObjectMapper();
       
       for (int i = 0; i < periodoArray.length(); i++) {
		
    	   JSONObject employeeJson = (JSONObject) periodoArray.get(i);
    	   CustomerDTO customerDTO = objectMapper.readValue(employeeJson.toString(), CustomerDTO.class);
    	   customerDTOs.add(customerDTO);
	}
       
       System.out.println("customerDtos size: "+customerDTOs.size());
        
		return customerDTOs;
	}
	
	
	
	
//	@GetMapping("/hello")
//	public String getcustomers() {
//		YourPartnerClient yourPartnerClient = Feign.builder()
//			    .encoder(new JacksonEncoder())
//			    .decoder(customDecoder())
//			    .target(Target<CustomerDTO>.EmptyTarget.create(YourPartnerClient.class));
//
//			Map<String, Object> headers = new HashMap<>();
//			headers.put("x-api-key", "x-api-value");
//
//			ResponseEntity<String> response = notificationClient.notify(new URI("https://stackoverflow.com/example"), headers, new NotificationBody());
//	}
	  
}
