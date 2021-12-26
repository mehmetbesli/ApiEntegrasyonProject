package com.hepsiburada;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WebServiceTest {

    WebServiceAutomation webServiceAutomation=new WebServiceAutomation();

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://generator.swagger.io";
    }

    @Test
    public void runGeneratorSwaggerApiTest() {
        webServiceAutomation.getListsData();
    }

}
