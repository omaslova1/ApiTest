package BlogApi;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class MyPostsTest extends AbstractTest {

    @Test
    void sortPage() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("sort", "createdAt")
                .queryParam("order", "ASC")
                .queryParam("page", 1)
                .when()
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);
    }

    @Test
    void orderPage() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("sort", "createdAt")
                .queryParam("order", "DESC")
                .queryParam("page", 555000)
                .when()
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);
    }

    @Test
    void orderPage4() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("sort", "createdAt")
                .queryParam("order", "DESC")
                .queryParam("page", -1)
                .when()
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);
    }

    @Test
    void orderPage5() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("sort", "createdAt")
                .queryParam("order", "DESC")
                .queryParam("page", -100000)
                .when()
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);
    }

    @Test
    void pagePage() {
        given()
                .header("X-Auth-Token", getToken())
                .queryParam("sort", "createdAt")
                .queryParam("order", "DESC")
                .queryParam("page", -1)
                .when()
                .contentType(ContentType.JSON)
                .get(getBaseUrl() + "api/posts")
                .then()
                .statusCode(200);


    }

}
