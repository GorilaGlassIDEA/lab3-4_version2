package org.example.interfaces;

import org.example.interfaces.actions.*;
import org.example.interfaces.relatives.Relatives;

import java.util.ArrayList;

public interface Person extends Movable, Showable, Interestable, Seeble, Relatives {
    String getName();

    void setSayStrategy(SayStrategy sayStrategy);

    void say(String text);

    Person getMother();

    Person getFather();

    ArrayList<Person> getSiblings();

    Person getPartner();

    ArrayList<Person> getChildren();
}
