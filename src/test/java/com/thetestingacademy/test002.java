package com.thetestingacademy;

import io.restassured.RestAssured;

public class test002 {
    public static void main(String[] args) {
        System.out.println("rest assured test case");
        System.out.println("get request demo");

        //gherkins syntax
        // given() - URL ,headers, body or payload
        // when()- https methods - get, post, put, patch, delete
        // then()- verify the response - er == ar
        RestAssured
                .given()
                      .baseUri("https://restful-booker.herokuapp.com")
                      .basePath("/booking/1").log().all()
                .when()
                      .get()
                .then().log().all()
                      .statusCode(200);


    }
}
