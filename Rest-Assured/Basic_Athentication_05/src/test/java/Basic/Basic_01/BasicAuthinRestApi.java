package Basic.Basic_01;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class BasicAuthinRestApi {
	@Test
public void Basicauth() {
		//Way1
		RestAssured.baseURI="https://postman-echo.com/basic-auth";
		RequestSpecification requestspec=RestAssured.given();
		requestspec.auth().basic("postman", "password");
		Response response=requestspec.get();
		System.out.println(response.getBody().asPrettyString());
		JsonPath jsonpath=response.jsonPath();
		String auth=jsonpath.getString("authenticated");
		Assert.assertEquals(auth, "true");
	//Way2
	RestAssured.given().
	auth().basic("postman", "password").
	when().get("https://postman-echo.com/basic-auth")
	.then().statusCode(200)
	.body("authenticated",Matchers.equalTo(true));
	}
}

