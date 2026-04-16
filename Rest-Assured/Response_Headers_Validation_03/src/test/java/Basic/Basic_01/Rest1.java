package Basic.Basic_01;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest1 {
	@Test
	public void printAllheaders() {
		//Way1
				RestAssured.baseURI="https://fakestoreapi.com/products";
				RequestSpecification reqspec=RestAssured.given();
			Response res=reqspec.get();
			Headers headers=res.headers();
				for(Header h:headers) {
					System.out.println(h.getName()+"--->"+h.getValue());}
		//Way2
		RestAssured.given().when().get("https://fakestoreapi.com/products").then().log().headers();
	}
	@Test
	public void printspecificheader() {

		//Way1
					RestAssured.baseURI="https://fakestoreapi.com/products/1";
				RequestSpecification reqspec=RestAssured.given();
				Response response=reqspec.get();
					System.out.println("Printing the specific header details");
					System.out.println(response.getHeader("Content-Type"));
					System.out.println(response.getHeader("Connection"));			
		//Way2
		Response response12=RestAssured.given().when().get("https://fakestoreapi.com/products/1");
		System.out.println("Printing the specific header details");
		System.out.println(response.getHeader("Content-Type"));
		System.out.println(response.getHeader("Connection"));	
	}
	@Test
		public void validateSpecific_server() {
		//Way1
		RestAssured.baseURI="https://fakestoreapi.com/products/1";
		RequestSpecification reqspec=RestAssured.given();
		Response response=reqspec.get();
		String Content_type=response.getHeader("Content-Type");
		String Connection=response.getHeader("Connection");
		Assert.assertEquals(Content_type, "application/json; charset=utf-8");
			Assert.assertEquals(Connection, "keep-alive");
			//Way2
			RestAssured.given()
			.when()
			.get("https://fakestoreapi.com/products/1").
			then()
			.header("Connection","keep-alive")
			.header("Content-type","application/json; charset=utf-8");
		}
	}


