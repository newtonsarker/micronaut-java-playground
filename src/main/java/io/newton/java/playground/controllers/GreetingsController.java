package io.newton.java.playground.controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

@Controller("/greetings")
public class GreetingsController {

    private static final Logger logger = LoggerFactory.getLogger(GreetingsController.class);

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<String, String> index() {
        var response = new HashMap<String, String>();
        response.put("param1", "hi");
        logger.info(response.toString());
        return response;
    }

}
