package main.RestApi.model;

import lombok.Getter;
import lombok.Setter;

public class User {
    
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
}
