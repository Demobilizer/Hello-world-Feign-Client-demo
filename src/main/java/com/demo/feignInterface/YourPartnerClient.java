package com.demo.feignInterface;

import java.time.LocalDate;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="meta4globalhr", url="https://meta4.meta4globalhr.com")
public interface YourPartnerClient {

	@RequestMapping(method = RequestMethod.GET, 
			value = "/REST/personnel_administration/v1.00/gmpe_sco_employee_p_0827130311",
			headers = {"M4Rest-Organization=GMGL",
					"Content-Type=application/x-www-form-urlencoded",
					"Authorization=Basic R01HTF9XU19HRU5FUklDOkNAbnYxQE1AcnowMjAyMA=="})
		String getAllCustomers(@DateTimeFormat(pattern = "yyyy-MM-dd")
		@RequestParam("effective_date") LocalDate effective_date);
	
}


