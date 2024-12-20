package org.example.models;

import org.example.abstractes.AbstractPerson;
import org.example.interfaces.Person;
import org.example.interfaces.actions.SayStrategy;

import java.util.ArrayList;

public class Model extends AbstractPerson {
    private SayStrategy sayStrategy;
    Person mother;
    Person father;
    ArrayList<Person> siblings = new ArrayList<>();
    Person partner;

    public Model(String name, String location, SayStrategy sayStrategy) {
        super(name, location);
        this.sayStrategy = sayStrategy;
    }

    @Override
    public void setMother(Person person) {
        mother = person;
    }

    @Override
    public void setFather(Person person) {
        father = person;
    }

    @Override
    public void setSiblings(Person... person) {
        if (person.length == 1)
            siblings.add(person[0]);
        else for (Person thisPerson : person) {
            siblings.add(thisPerson);
        }
    }

    @Override
    public void setPartner(Person person) {
        partner = person;
    }

    @Override
    public void setSayStrategy(SayStrategy sayStrategy) {
        this.sayStrategy = sayStrategy;
    }

    @Override
    public void say(String text) {
        this.sayStrategy.say(text);
    }


    @Override
    public void show(Person person) {
        System.out.print("Увидеть " + person);
    }
}
