package com.carlosc.crud.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.junit.Assert.*;

@SpringBootTest
public class SpringBootApplicationTests {

    public static final String API_ROOT = "http://localhost:8081/products";

    @Test
    public void whenGetAllProducts_thenOK() {
        final Response response = RestAssured.get(API_ROOT);
        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
    }
}
