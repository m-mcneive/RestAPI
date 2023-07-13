package main.RestApi.controllers;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import main.RestApi.model.Entry;

@RestController
public class RestAPIController {

    private Entry[] users = {new Entry(0, "Target", 23.03, LocalDate.of(2023, 07, 01)), 
    new Entry(1, "Amazon", 45.73, LocalDate.of(2023, 07, 9))};
    

    @GetMapping("/api/user/{id}")
    @ResponseBody
    public Entry getUser(@PathVariable int id) {
        return users[id];
    }

    @GetMapping("/api/hello")
    public String print() {
        return "Hello World!";
    }
}
