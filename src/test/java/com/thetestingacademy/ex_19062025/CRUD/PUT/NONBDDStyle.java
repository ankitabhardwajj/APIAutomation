package com.thetestingacademy.ex_19062025.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

public class NONBDDStyle {
    @Test
     public void username(){
        String firstname = "James";
        String lastname = "Brown";

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/1");
        r.contentType(ContentType.JSON);
        r.cookie("firstname");

        Response response = r.when().put();
        ValidatableResponse V = response.then().log().all();
        V.statusCode(403);


    }
}
