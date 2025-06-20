package com.thetestingacademy.ex_19062025.CRUD.GET;

import io.restassured.RestAssured;

public class BDDStyleGET {
    public static void main(String[] args) {
        //gherkin -> Given, When, Then -> Style ->

        // BDD framework = different - gherkin syntax -(given, when, then)
        // non BDD and still gherkin syntax (using classes)

        RestAssured
                .given()
                      .baseUri("https://api.zippopotam.us/")
                      .basePath("/IN/560037")
                .when()
                     .log().all().get()
                .then()
                     .log().all().statusCode(200);
    }
}
