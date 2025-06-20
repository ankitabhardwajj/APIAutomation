package com.thetestingacademy.ex_19062025.CRUD.testing;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test_get() {
        RestAssured
                .given().relaxedHTTPSValidation()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560037")
                .when()
                .log().all().get()
                .then()
                .log().all().statusCode(200);
    }
}
