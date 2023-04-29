package BlogApi;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class PostAutomationTest extends AbstractTest {

    @Test
    void loginValid() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("username", "active")
                .formParam("password", "c76a5e84e4")
                .when()
                .post(getBaseUrl() + "gateway/login")
                .then()
                .statusCode(200);

    }

    @Test
    void loginInvalid1() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("username", "")
                .formParam("password", "c76a5e84e4")
                .when()
                .post(getBaseUrl() + "gateway/login")
                .then()
                .statusCode(200);

    }

    @Test
    void loginInvalid2() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("username", "")
                .formParam("password", "c76a5e84e4")
                .when()
                .post(getBaseUrl() + "gateway/login")
                .then()
                .statusCode(401);

    }

    @Test
    void loginInvalid3() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("username", "ghj")
                .formParam("password", "c76a5e84e4")
                .when()
                .post(getBaseUrl() + "gateway/login")
                .then()
                .statusCode(200);

    }

    @Test
    void loginInvalid4() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("username", "ghj")
                .formParam("password", "c76a5e84e4")
                .when()
                .post(getBaseUrl() + "gateway/login")
                .then()
                .statusCode(401);

    }

    @Test
    void loginInvalid5() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("username", "")
                .formParam("password", "")
                .when()
                .post(getBaseUrl() + "gateway/login")
                .then()
                .statusCode(200);

    }

    @Test
    void loginInvalid6() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("username", "active")
                .formParam("password", "c76a5e8")
                .when()
                .post(getBaseUrl() + "gateway/login")
                .then()
                .statusCode(401);

    }

    @Test
    void loginInvalid7() {
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("username", "active")
                .formParam("password", "c76a5e8")
                .when()
                .post(getBaseUrl() + "gateway/login")
                .then()
                .statusCode(200);

    }


}











