package org.example.abstractes;

import org.example.interfaces.Person;

public abstract class AbstractPerson implements Person {
    private final String name;
    private String location;


    public AbstractPerson(String name, String location) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract void move();
}
