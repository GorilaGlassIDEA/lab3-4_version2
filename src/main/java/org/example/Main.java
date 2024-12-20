package org.example;

import org.example.interfaces.Person;
import org.example.interfaces.actions.SayLieStrategy;
import org.example.interfaces.actions.SayStrategy;
import org.example.models.Model;

public class Main {
    public static void main(String[] args) {
        Person model = new Model(
                "Dora",
                "Here",
                new SayLieStrategy()
        );
        model.say("ASDASD");
    }
}