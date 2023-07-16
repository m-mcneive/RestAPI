package main.RestApi.controllers;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import main.RestApi.model.Entry;
import main.RestApi.services.EntryService;

@RestController
public class RestAPIController {

    @Autowired
    private EntryService entryService;

    @GetMapping("/api/entry/{id}")
    @ResponseBody
    public Entry getUser(@PathVariable int id) {
        return entryService.getEntry(id);
    }

    @PostMapping("/api/insert")
    private void insert(@RequestBody Entry ob) {
        entryService.add(ob);
    }

    @DeleteMapping("/api/delete/{id}")
    public void delete(@PathVariable int id) {
        entryService.delete(id);
    }
}
