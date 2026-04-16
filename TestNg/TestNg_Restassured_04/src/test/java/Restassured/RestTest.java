package Restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestTest {
  @Test
  public void f() {
	  Response r=  RestAssured.get(" https://jsondevtool.com/api/users");
	 int a= r.getStatusCode();
	 Assert.assertEquals(a, 200);
  }
}
