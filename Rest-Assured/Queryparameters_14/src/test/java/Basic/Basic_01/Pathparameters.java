package Basic.Basic_01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Pathparameters {
	@Test
public void Quryparameters() {
		//Way1
	RestAssured.baseURI="https://www.google.com/search";	
	RequestSpecification reqspec=RestAssured.given();
	reqspec.queryParam("q", "rose");
	Response res=reqspec.get();
	System.out.println(res.statusCode());
	//System.out.println(res.getBody().asPrettyString());
		//Way2
		RestAssured
		.given()
		.queryParam("q", "school")
		.when().get("https://www.google.com/search")
		.then()
		.log()
		.all();
}
	
}

