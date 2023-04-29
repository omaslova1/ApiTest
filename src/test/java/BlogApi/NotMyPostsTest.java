package BlogApi;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class NotMyPostsTest extends AbstractTest {

    @Test
    void ownerPage() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("owner", "notMe")
                .queryParam("sort", "createdAt")
                .queryParam("page", 1)
                .when()
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);
    }

    @Test
    void sortPage() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("sort", "createdAt")
                .queryParam("page, 1")
                .when()
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);

    }
    @Test
    void orderPage() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("owner", "notMe")
                .queryParam("order", "ASC")
                .queryParam("page", 1)
                .when()
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);
    }


    @Test
    void orderPage1() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("owner", "notMe")
                .queryParam("order", "ASC")
                .queryParam("page", 1)
                .when()
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);
    }
    @Test
    void orderPage2() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("owner", "notMe")
                .queryParam("order", "DESC")
                .queryParam("page", 100)
                .when()
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);
    }

    @Test
    void orderPage3() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("owner", "notMe")
                .queryParam("order", "ALL")
                .queryParam("page", 1)
                .when()
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);
    }














}

