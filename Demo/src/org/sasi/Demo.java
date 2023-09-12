package org.sasi;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.hamcrest.Matchers.*;
import org.sasi.payload.PayLoad;

public class Demo {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String st = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(PayLoad.rawToJson()).when().post("/maps/api/place/add/json").then().extract().asString();
		
		System.out.println(st);
		
		

	}
}
