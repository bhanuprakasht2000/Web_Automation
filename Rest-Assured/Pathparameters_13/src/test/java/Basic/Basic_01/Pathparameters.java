package Basic.Basic_01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Pathparameters {
	@Test
public void Pathparameterex() {
		//Way1
	RestAssured.baseURI="https://fakestoreapi.com";	
	RequestSpecification reqspec=RestAssured.given();
	reqspec.pathParam("id", "3");
	Response res=reqspec.get("/products/{id}");
	System.out.println(res.statusCode());
	System.out.println(res.getBody().asPrettyString());
		//Way2
		RestAssured
		.given()
		.pathParam("id", 10)
		.when().get("https://fakestoreapi.com/products/{id}")
		.then()
		.log()
		.all();

	
}
	
}

