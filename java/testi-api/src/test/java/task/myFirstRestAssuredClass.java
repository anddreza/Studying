package task;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class myFirstRestAssuredClass {


    @Test
    public void test1() {
        given()
        .when().
                get("http://zippopotam.us/us/90210").
        then().
                assertThat().
                //body("places[0].'place name'", equalTo("Beverly Hills"));
                statusCode(200);

    }
}
