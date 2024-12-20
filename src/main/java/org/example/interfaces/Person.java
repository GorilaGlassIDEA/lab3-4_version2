package org.example.interfaces;

import org.example.interfaces.actions.Movable;
import org.example.interfaces.actions.SayStrategy;
import org.example.interfaces.actions.Showable;
import org.example.interfaces.relatives.Relatives;

public interface Person extends Movable, Showable, Relatives {
    String getName();

    void setSayStrategy(SayStrategy sayStrategy);

    void say(String text);
}
