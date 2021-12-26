package com.hepsiburada;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;


import java.util.logging.Level;
import java.util.logging.Logger;

import static io.restassured.RestAssured.given;

public class WebServiceAutomation {

    protected Logger log = Logger.getLogger(this.getClass().getName());

    public void getListsData() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/api/swagger.json")
                .then()
                .extract().response();

        log.log(Level.INFO,response.asPrettyString());
        Assertions.assertEquals(200, response.statusCode());
        log.log(Level.INFO, "Status code: "+ response.statusCode());
    }

}
