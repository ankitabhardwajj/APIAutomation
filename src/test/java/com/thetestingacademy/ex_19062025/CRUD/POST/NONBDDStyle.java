package com.thetestingacademy.ex_19062025.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NONBDDStyle {
    public static void main(String[] args) {
        // payload -> String , hashmap , Classes
        // Classes(95%) are mostly used


        String payload = "{ \n" +
                "                  \"username\" : \"admin\",\n" +
                "                  \"password\" : \"password123\"\n" +
                "           }";

        // given - RequestSpecification

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        //when - response
        Response response = r.when().post();

        // then - validatable response
        //validation
        ValidatableResponse validatableResponse= response.then();
        validatableResponse.statusCode(200);

    }
}
