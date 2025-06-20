package com.thetestingacademy.ex_19062025.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BDDStyle {
    public static void main(String[] args) {
        // payload -> String , hashmap , Classes
        // Classes(95%) are mostly used


        String payload = "{ \n" +
               "                  \"username\" : \"admin\",\n" +
               "                  \"password\" : \"password123\"\n" +
                "           }";

        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON).log()
                .all().body(payload).when()
                .post().then().log()
                .all().statusCode(200);

    }
}
