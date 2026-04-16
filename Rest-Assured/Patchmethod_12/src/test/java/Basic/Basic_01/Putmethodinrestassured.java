package Basic.Basic_01;

import org.json.JSONObject;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Putmethodinrestassured {
	@Test
public void putmethodexample() {
		//Json object is the type of org.json.JSONObject;
		JSONObject jsonobjectbody=new JSONObject();
		jsonobjectbody.put("title", "Updated Product Title");
		jsonobjectbody.put("price", 29956789.99);
		
		//Way1
		RestAssured.baseURI="https://fakestoreapi.com/products";
		RequestSpecification reqspec=RestAssured.given();
		reqspec.contentType(ContentType.JSON);
		reqspec.body(jsonobjectbody.toString());
		Response response=reqspec.patch("/20");
		System.out.println(response.getStatusCode());
		System.out.println(response.body().asPrettyString());
		//Way2
		RestAssured.given().contentType(ContentType.JSON).baseUri("https://fakestoreapi.com/products")
		.body(jsonobjectbody.toString())
		.when().patch("/20")
		.then().statusCode(200).log().all();
}
	
}

