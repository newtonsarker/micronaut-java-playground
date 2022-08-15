package io.newton.java.playground.controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.HashMap;

@Controller("/greetings")
public class GreetingsController {

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<String, String> index() {
        var response = new HashMap<String, String>();
        response.put("param1", "hi");
        return response;
    }

}
