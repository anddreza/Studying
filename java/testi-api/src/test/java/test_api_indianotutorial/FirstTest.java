package test_api_indianotutorial;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void test_1(){

        //RestAssured => get, post, delete, update...
        Response response =  RestAssured.get("https://catfact.ninja/");

        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("content-type"));

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);
    }
}
