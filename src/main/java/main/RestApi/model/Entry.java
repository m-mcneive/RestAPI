package main.RestApi.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

public class Entry {
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private double price;

    // @Getter
    // @Setter
    // private LocalDate date;

    public Entry(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        // this.date = date;
    }
    
}
