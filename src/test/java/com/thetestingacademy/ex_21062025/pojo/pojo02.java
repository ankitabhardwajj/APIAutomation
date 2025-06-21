package com.thetestingacademy.ex_21062025.pojo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;


public class pojo02{
RequestSpecification requestSpecification;
ValidatableResponse validatableResponse;
Response response;
String token;
String bookingid;

@Test
    public void test_post_with_hashmap () {


            Map<String, Object> jsonBodyUsingMap = new LinkedHashMap<>();
            jsonBodyUsingMap.put("firstname", "jim");
            jsonBodyUsingMap.put("lastname", "brown");
            jsonBodyUsingMap.put("totalprice", 111);
            jsonBodyUsingMap.put("depositpaid", true);

            Map<String, Object> bookingDatesMap = new LinkedHashMap<>();
            bookingDatesMap.put("checkin", "2018-01-01");
            bookingDatesMap.put("checkout", "2019-01-01");

            jsonBodyUsingMap.put("bookingdates", bookingDatesMap);
            jsonBodyUsingMap.put("additionalneeds", "BreakFast");

            System.out.println(jsonBodyUsingMap);


            requestSpecification = RestAssured.given();
            requestSpecification.baseUri("https://restful-booker.herokuapp.com");
            requestSpecification.basePath("/booking");
            requestSpecification.contentType(ContentType.JSON);
            requestSpecification.body(jsonBodyUsingMap).log().all();

            Response response = requestSpecification.when().post();

            validatableResponse = response.then().log().all();
            validatableResponse.statusCode(200);

            bookingid = response.jsonPath().getString("bookingid");
            System.out.println(bookingid);

        }
    }
