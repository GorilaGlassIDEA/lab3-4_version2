package org.example.abstractes;

import org.example.interfaces.Person;
import org.example.interfaces.actions.SayStrategy;
import org.example.interfaces.enums.Gender;
import org.example.interfaces.enums.State;
import org.example.models.Place;

import java.util.ArrayList;
import java.util.Locale;

public abstract class AbstractPerson implements Person {
    private final String name;
    private Place location;
    private State stateNow;
    private final Gender gender;

    public AbstractPerson(String name, Place location, Gender gender) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.location = location;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public Place getLocation() {
        return location;
    }

    public State getStateNow() {
        return stateNow;
    }

    public void setStateNow(State stateNow) {
        this.stateNow = stateNow;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move(Place location) {
        setLocation(location);
        setStateNow(State.MOVE);
        System.out.print("отправиться в " + location);
    }

    public void setLocation(Place location) {
        this.location = location;
    }

    @Override
    public abstract void setMother(Person person);

    @Override
    public abstract void setFather(Person person);

    @Override
    public abstract void setSiblings(Person... people);

    @Override
    public abstract void setPartner(Person person);

    @Override
    public abstract void setChild(Person... people);

    @Override
    public abstract void setSayStrategy(SayStrategy sayStrategy);

    @Override
    public abstract void say(String text);

    @Override
    public abstract void show(Person person);

    @Override
    public abstract void interested(String some);

    @Override
    public abstract void see(String some);

    @Override
    public abstract Person getMother();

    @Override
    public abstract Person getFather();

    @Override
    public abstract ArrayList<Person> getSiblings();

    @Override
    public abstract Person getPartner();

    @Override
    public abstract ArrayList<Person> getChildren();
}
