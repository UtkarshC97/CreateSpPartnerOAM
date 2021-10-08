package com.fedpartner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fedpartner.model.SpPartnerDetails;
import com.fedpartner.model.SpPartnerList;
import com.fedpartner.service.SpPartnerService;

@RestController
public class SpPartnerController {

	@Autowired
	SpPartnerService spService;

	ObjectMapper mapper = new ObjectMapper();

	@RequestMapping(value = "/location", method = RequestMethod.GET, consumes = "application/json")
	@ResponseBody
	public String getFoosBySimplePath() {
		return "At Rest Comtroller";
	}

	@RequestMapping(value = "/createSpPartner", method = RequestMethod.POST, consumes = "application/json")
	public String createSpPartner(@RequestBody SpPartnerDetails spPartner, @RequestHeader HttpHeaders reqheaders) {

		ResponseEntity<String> response = spService.createSpPartner(spPartner, reqheaders);
		return response.getBody();

	}

	@RequestMapping(value = "/createSpPartnerBulk", method = RequestMethod.POST, consumes = "application/json")
	public String createSpPartnerBulk(@RequestBody SpPartnerList spPartnerList, @RequestHeader HttpHeaders reqheaders) {
		ResponseEntity<String> response = null;
System.out.println("RequestBody="+spPartnerList);
		response = spService.createSpPartnerBulk(spPartnerList, reqheaders);

		return response.getBody();

	}
}
