package Serialization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Serialization_Example {
	@Test
public void Serializationinrestassured() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		//Way1
		//Add the gson dependency
		//Create an user pojo  class and instance for that
		User user=new User(2,"Vijay");
		
		RequestSpecification reqspec=RestAssured.given();
		Response request= reqspec.basePath("/users").contentType(ContentType.JSON).body(user).post();
		System.out.println(request.asPrettyString());
		Response response=reqspec.get("/users/1");
		System.out.println(response.asPrettyString());
		//Way 2
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body(user)//Converts pojo to json
		.when()
		.post("/users").
		then().
		statusCode(201);
	
}
}
