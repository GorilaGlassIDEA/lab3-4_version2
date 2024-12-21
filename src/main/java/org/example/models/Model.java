package org.example.models;

import org.example.abstractes.AbstractPerson;
import org.example.interfaces.Person;
import org.example.interfaces.actions.SaySimpleStrategy;
import org.example.interfaces.actions.SayStrategy;
import org.example.interfaces.enums.Gender;
import org.example.interfaces.enums.State;

import java.util.ArrayList;
import java.util.Objects;

public class Model extends AbstractPerson {
    private SayStrategy sayStrategy;
    private Person mother;
    private Person father;
    private ArrayList<Person> siblings = new ArrayList<>();
    private ArrayList<Person> children = new ArrayList<>();
    private Person partner;

    public Model(String name, String location, SayStrategy sayStrategy, Gender gender) {
        super(name, location, gender);
        setSayStrategy(sayStrategy);
    }

    public Model(String name, String location, Gender gender) {
        super(name, location, gender);
        setSayStrategy(new SaySimpleStrategy());
    }

    @Override
    public void setMother(Person person) {
        if (mother == null) {
            mother = person;
            mother.setChild(this);
        }
    }

    @Override
    public void setFather(Person person) {
        father = person;
        father.setChild(this);
    }

    @Override
    public void setSiblings(Person... people) {
        //TODO: дописать родственные связи
    }

    @Override
    public void setPartner(Person person) {
        if (this.getPartner() == null) {
            partner = person;
            person.setPartner(this);
        }
    }


    @Override
    public void setChild(Person... people) {
        //TODO: дописать родственные связи
    }

    @Override
    public void setSayStrategy(SayStrategy sayStrategy) {
        this.sayStrategy = sayStrategy;
    }

    @Override
    public void say(String text) {
        setStateNow(State.SAY);
        this.sayStrategy.say(text);
    }


    @Override
    public void show(Person person) {
        setStateNow(State.SHOW);
        System.out.print("Увидеть " + person);
    }

    @Override
    public void interested(String some) {
        setStateNow(State.INTEREST);
        System.out.print("Интересоваться " + some);
    }

    @Override
    public void see(String some) {
        setStateNow(State.SEE);
        System.out.print("увидеть " + some);
    }

    @Override
    public Person getPartner() {
        return partner;
    }

    @Override
    public ArrayList<Person> getChildren() {
        return children;
    }

    @Override
    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    @Override
    public Person getFather() {
        return father;
    }

    @Override
    public Person getMother() {
        return mother;
    }
}
