package com.RestAssured.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;


public class JsonSchemaValidator {
	 
	
	@Test
	public void postTest() {
		
		baseURI = "https://reqres.in/api";
		
		given().post("/users").then().
		assertThat().body(matchesJsonSchemaInClasspath("schema.json"));
		
				
	}

}
