package org.example.abstractes;

import org.example.interfaces.Person;
import org.example.interfaces.actions.SayStrategy;
import org.example.interfaces.enums.State;

public abstract class AbstractPerson implements Person {
    private final String name;
    private String location;
    private State stateNow;

    public AbstractPerson(String name, String location) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public State getStateNow() {
        return stateNow;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move(String location) {
        stateNow = State.MOVE;
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
    public abstract void setSayStrategy(SayStrategy sayStrategy);

    @Override
    public abstract void say(String text);

    @Override
    public abstract void show(Person person);
}
