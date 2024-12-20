package org.example.interfaces.actions;

public class SayTruthStrategy implements SayStrategy {
    @Override
    public void say(String text) {
        System.out.println("Сказать правду: " + text);
    }
}
