package com.demo.feignInterface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.dto.AnotherCustomerDTO;

@FeignClient(name="anotherPartnerCompany", url="http://localhost:8081")
public interface AnotherPartnerClient {

	@RequestMapping(method = RequestMethod.GET, value = "/get-all-from-db")
	List<AnotherCustomerDTO> getAllCustomersFromDB();
	
}
