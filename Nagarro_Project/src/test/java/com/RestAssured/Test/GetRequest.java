package com.RestAssured.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetRequest {
	
	@Test
	public void testResponsecode()
	{
		Response resp = get("https://reqres.in/api/users?page=2");
		int code = resp.getStatusCode();
		
		System.out.println("status code is "+code);
		Assert.assertEquals(code, 200);
			
	}

	
    @Test
	public void test_2() {
	
		given().get("https://reqres.in/api/users?page=2").then()
		.body("data[3].first_name",equalTo("Byron"));
			 	
	
	}
	
	
}

