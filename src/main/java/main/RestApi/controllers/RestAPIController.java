package main.RestApi.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
    

    @GetMapping("/hello")
    public String print() {
        return "Hello World!";
    }
}
