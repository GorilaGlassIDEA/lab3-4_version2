package org.example.abstractes;

import org.example.interfaces.Person;
import org.example.interfaces.actions.SayStrategy;
import org.example.interfaces.enums.Gender;
import org.example.interfaces.enums.State;
import org.example.models.Model;
import org.example.models.Place;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPerson implements Person {
    private final String name;
    private Place location;
    private State stateNow;
    private final Gender gender;
    private String description;

    public AbstractPerson(String name, Place location, Gender gender) {
        this.location = location;
        this.gender = gender;
        this.name = name;
    }

    public AbstractPerson(String name, Place location, Gender gender, String description) {
        this(name, location, gender);
        this.description = description;

    }

    public AbstractPerson(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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


    public abstract List<Person> getSiblings();

    @Override
    public abstract Person getPartner();


    public abstract List<Person> getChildren();

    @Override
    public abstract void setOneChild(Person person);

    @Override
    public abstract void setOneSiblings(Person person);
}
