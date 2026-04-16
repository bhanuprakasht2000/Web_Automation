package DeSerialization;

import org.testng.annotations.Test;

import Serialization.User;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Deserializationexample {
	@Test
	public void deserlizeinrestassured() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		RequestSpecification reqspec= RestAssured.given();
		Response response=reqspec.get("users/1");
		System.out.println(response.getStatusCode());
		User fetcheduser=response.as(User.class);//Converting the Json to java Pojo 
		System.out.println("The id of the fetched user "+fetcheduser.getId());
		System.out.println("The name of the fetched user "+fetcheduser.getName());
	}

}
