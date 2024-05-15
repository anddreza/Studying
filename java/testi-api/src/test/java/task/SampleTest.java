package task;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SampleTest {
    @Test
    public void sampleLogin() {
        given().contentType("application/x-www-form-urlencoded; charset")
                .formParam("grant_type", "password")
                .formParam("username", "Tester User")
                .formParam("password", "Test123&&")
                .when().post("http://demo6116845.mockable.io/login")
.then().statusCode(200);
    }

    @Test
    public void pathParamTest() {
        given().pathParam("user", "user1")
                .when().get(" http://demo6116845.mockable.io/profile/{user}")
                .then().statusCode(200);
    }
}
