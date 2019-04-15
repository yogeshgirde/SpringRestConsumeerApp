package com.app.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Test {
public static void main(String[] args) {
	String url="http://localhost:5252/SpringRestProviderApp/show";
	
	RestTemplate rest=new RestTemplate();
	ResponseEntity<String> resp=rest.getForEntity(url,String.class);
	System.out.println(resp.getBody());
	System.out.println(resp.getStatusCode().name());
	System.out.println(resp.getStatusCodeValue());
}
}
