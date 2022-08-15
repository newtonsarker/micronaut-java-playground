package io.newton.java.playground.controllers;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public class GreetingsControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void testGreetings() {
        // given
        var request = HttpRequest.GET("/greetings");

        // when
        var response = this.client.toBlocking().retrieve(request);

        // then
        assertNotNull(response);
        assertEquals("{\"param1\":\"hi\"}", response);
    }

}
