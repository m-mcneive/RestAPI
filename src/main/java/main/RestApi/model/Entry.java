package main.RestApi.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

public class Entry {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private double price;

    @Getter
    @Setter
    private LocalDate date;

    public Entry(String name, double price, LocalDate date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }
    
}
