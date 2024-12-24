package org.example.interfaces.actions;

import org.example.interfaces.Person;

public class SayLieStrategy implements SayStrategy {
    @Override
    public void say(String text) {
        System.out.print("солгать и сказать: " + text);
    }
}
