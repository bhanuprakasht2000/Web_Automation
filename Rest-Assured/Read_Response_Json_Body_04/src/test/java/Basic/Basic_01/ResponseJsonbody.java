package Basic.Basic_01;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class ResponseJsonbody {
	@Test
public void Readjsonbody() {
	//Way 1
	RestAssured.baseURI="https://fakestoreapi.com/products/1";
	RequestSpecification requestspec=RestAssured.given();
	Response response=requestspec.get();
	String response_body=response.body().asString();
	System.out.println(response_body);
	//way2
	RestAssured.given()
				.when()
			.get("https://fakestoreapi.com/products/1")
			.then()
				.log()
			.body();
}
	@Test
	public void readjsonresponsestringvalidate() {
		//Way 1
		RestAssured.baseURI="https://fakestoreapi.com/products";
		RequestSpecification reqspec=RestAssured.given();
		Response response=reqspec.get();
		String responsebody=response.asString();
		Assert.assertTrue(responsebody.contains("men's clothing"));
		Assert.assertTrue(responsebody.contains("title"));
		//Way2
		String Responsebody1=RestAssured.given().when().get("https://fakestoreapi.com/products/1")
		.getBody().asString();
		Assert.assertTrue(Responsebody1.contains("image"));
		
	}
	@Test
	public void readjsonresponseandvalidate() {
		//Way1
		RestAssured.baseURI="https://fakestoreapi.com/products/1";
		RequestSpecification reqspec=RestAssured.given();
		Response response=reqspec.get();
		JsonPath jsonpath=response.jsonPath();
		String category=jsonpath.getString("category");
		String rate=jsonpath.getString("rating.rate");
		System.out.println("The category is : "+category);
		System.out.println("The rate is :"+rate);
		Assert.assertEquals(rate,"3.9");
		Assert.assertEquals(category,"men's clothing");
		//Way2
		//@@@@rating.rate and rating.count==>Json path notations==>id=1 as per the url
		//@@@@rate under the rating will be fetched by the rating.rate 
		//@@@@Matchers class is used for Accurate comparison
		RestAssured.given().when().get("https://fakestoreapi.com/products/1")
		.then().body("rating.count", Matchers.equalTo(120))
		.body("image",Matchers.equalTo("https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_t.png"));
		
	}
}

