package org.example.interfaces.actions;

public class SaySimpleStrategy implements SayStrategy{
    @Override
    public void say(String text) {
        System.out.println("Просто сказать");
    }
}
