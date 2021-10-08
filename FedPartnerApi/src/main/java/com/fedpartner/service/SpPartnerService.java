package com.fedpartner.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fedpartner.model.SpPartnerDetails;
import com.fedpartner.model.SpPartnerList;

@Service
public interface SpPartnerService {

	ResponseEntity<String> createSpPartner(SpPartnerDetails spPartner, HttpHeaders headers);

	ResponseEntity<String> createSpPartnerBulk(SpPartnerList spPartnerList, HttpHeaders reqheaders);

}
