package Basic.Basic_01;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Rest1 {
public static void main(String[] args) {
	//Way 1
	RestAssured.baseURI="https://fakestoreapi.com/products";
	RequestSpecification requestspec=RestAssured.given();
	Response response=requestspec.get();
	System.out.println(response.prettyPrint());
//	way2
	RestAssured.baseURI="https://fakestoreapi.com/products";
	RequestSpecification reqspec=RestAssured.given();
	Response response1=reqspec.request(Method.GET);
	System.out.println(response1.prettyPrint());
	
	//way3
	RestAssured.given()
				.when()
				.get("https://fakestoreapi.com/products")
				.then()
				.log()
				.all();
}
}

