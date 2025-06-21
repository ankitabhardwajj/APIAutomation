package com.thetestingacademy.ex_21062025.jsonPath;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class jsonPath01 {
    public static void main(String[] args) {
        String response = "{\n" +
                "      \"firstname\" : \"john\", \n" +
                "       \"lastname\" : \"doe\", \n" +
                "       \"age\" : \"26\", \n" +
                "       \"address\" : {\n" +
                "           \"streetAddress\" : \"naist street\", \n" +
                "           \"city\" : \"nara\", \n" +
                "           \"postalCode\" : \"630-0192\", \n" +
                " }, \n" +
                "  \"phoneNumbers\" :  [\n" +
                "    {\n" +
                "          \"type\" : \"iphone\", \n" +
                "           \"number\" : \"0123-4567-8888\", \n" +
                "     }, \n"  +
                "      {\n" +
                "        \"type\" : \"home\", \n" +
                "         \"number\" : \"0123-4567-8910\", \n" +
                "       }\n" +
                "    ]\n" +
                "}" ;

        JsonPath jsonPath = JsonPath.from(response);
        System.out.println(jsonPath.getString("firstname"));

        System.out.println(jsonPath.getString("phoneNumbers[1].type" ));

        Assert.assertEquals(jsonPath.getString("firstname"), "ankita");
        assertThat(jsonPath.getString("firstname")).isNotNull().isNotEmpty().isEqualTo("ankita");





    }
}
