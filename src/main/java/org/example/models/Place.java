package org.example.models;

public record Place(String name) {
    @Override
    public String toString() {
        return name;
    }
}
