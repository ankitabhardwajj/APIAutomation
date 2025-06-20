package com.thetestingacademy.ex_19062025.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;


public class NonBDDStyle {
    public static void main(String[] args) {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("/IN/560037");
        r.when().get();
        r.then().log().all().statusCode(200);
    }
}
