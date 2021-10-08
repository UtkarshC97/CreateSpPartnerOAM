package com.fedpartner.serviceImpl;

import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.tomcat.util.codec.binary.Base64;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fedpartner.model.ApplicationError;
import com.fedpartner.model.SpPartnerDetails;
import com.fedpartner.model.SpPartnerList;
import com.fedpartner.service.SpPartnerService;

@Component
public class SpPartnerServiceImpl implements SpPartnerService {

	private static final int HttpEntity = 0;

	@Value("${Base_Url}")
	private String baseUrl;

	@Value("${Host_Url}")
	private String hostUrl;

	@Value("${usrname}")
	private String username;

	@Value("${password}")
	private String password;

	RestTemplate restTemplate;

	ObjectMapper mapper = new ObjectMapper();

	@Override
	public ResponseEntity<String> createSpPartner(SpPartnerDetails spPartnerDetails, HttpHeaders Reqheaders) {
		String bseUrl = baseUrl;
		String hstUrl = hostUrl;
		String usrnme = username;
		String psswrd = password;
		ResponseEntity<String> response = null;
		String partnerName = spPartnerDetails.getPartnerName();
		ApplicationError error = new ApplicationError();
		try {
			// Creating Url

			String apiUrl = hstUrl + bseUrl + "/trustedpartners/idp/:" + partnerName;

			// Creating_Headers
			HttpHeaders headers = new HttpHeaders();
			String auth = usrnme + ":" + psswrd;
			byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
			String authHeader = "Basic " + new String(encodedAuth);
			headers.set("Authorization", authHeader);
			headers.set("Content-Type", "application/json");

			// Creating Request Body
			String partnerDetails = mapper.writeValueAsString(spPartnerDetails.toString());
			// JSONObject jsonRequest = new JSONObject(partnerDetails);

			HttpEntity<String> entityRequest = new HttpEntity(partnerDetails, headers);
			response = restTemplate.exchange(apiUrl, HttpMethod.POST, entityRequest, String.class, Reqheaders);
			System.out.println("\nResponse =>" + response);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new ApplicationError("0", "Error ocured while Posting").toString(),
					HttpStatus.INTERNAL_SERVER_ERROR);

		}
		return new ResponseEntity<>(response.getBody(), HttpStatus.OK);

	}

	@Override
	public ResponseEntity<String> createSpPartnerBulk(SpPartnerList spPartnerList, HttpHeaders reqheaders) {

		SpPartnerDetails SpPartnerDetails = new SpPartnerDetails();
		ArrayList<SpPartnerDetails> spPartnerDetails = new ArrayList<>();
		SpPartnerList spPartnerLst = new SpPartnerList();

		String metadataB64;
		String partnerName;
		String nameIDFormat;
		String ssoProfile;
		String providerID;
		String ssoURL;
		String logoutRequestURL;
		String logoutResponseURL;
		boolean isEnabled;
		boolean isDefault;
		boolean adminManualCreation;
		String displaySigningCertDN;
		String displaySigningCertIssuerDN;
		String displaySigningCertStart;
		String displaySigningCertExpiration;
		String displayEncryptionCertDN;
		String displayEncryptionCertIssuerDN;
		String displayEncryptionCertStart;
		String displayEncryptionCertExpiration;

		return null;
	}

}
