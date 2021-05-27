package com.RestAssured.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostRequest {
	
	@Test
	public void postTest() {
		
		baseURI = "https://reqres.in/api";
	
	Map<String,Object> map = new HashMap<String,Object>();
	
/*  map.put("name","Byron");
	map.put("job","BA");
	System.out.println(map);	*/
	
	
	JSONObject request = new JSONObject();
	request.put("name","Byron");
	request.put("job", "BA");
	
	System.out.println(request.toJSONString());
	
	baseURI = "https://reqres.in/api";
	
	given().body(request.toJSONString()).when()
	.post("/users")
	.then().statusCode(201);
	
		 
	}

   


}

	
	
