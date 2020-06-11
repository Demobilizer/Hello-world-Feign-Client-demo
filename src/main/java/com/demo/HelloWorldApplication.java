package com.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
//    @Bean
//    public RequestInterceptor requestInterceptor() {
//        return requestTemplate -> {
//            requestTemplate.header("M4Rest-Organization", "GMGL");
//            requestTemplate.header("Authorization", "Basic R01HTF9XU19HRU5FUklDOkNAbnYxQE1AcnowMjAyMA==");
//            requestTemplate.header("Content-Type", "application/x-www-form-urlencoded");
//        };
//    }
	
//	@Bean
//	public RestTemplate createRestTemplate() {
//	     RestTemplate restTemplate = new RestTemplate();
//	     MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//		converter.setSupportedMediaTypes(Arrays.asList( MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON));
//	     restTemplate.getMessageConverters().add(0, converter);
//	     return restTemplate;
//	}

}
