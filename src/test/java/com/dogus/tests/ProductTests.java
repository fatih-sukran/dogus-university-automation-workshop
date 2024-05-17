package com.dogus.tests;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class ProductTests {

    @Test
    public void testProduct_Category() {
        RestAssured
                .given()
                .get("https://dummyjson.com/products/category/smartphones")
                .then()
                .statusCode(200)
                .body("products.size()", Matchers.greaterThan(1))
                .body("products[0].category", Matchers.equalTo("smartphones"));
    }
}
