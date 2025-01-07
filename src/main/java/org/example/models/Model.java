package org.example.models;

import org.example.abstractes.AbstractPerson;
import org.example.interfaces.Person;
import org.example.interfaces.actions.SaySimpleStrategy;
import org.example.interfaces.actions.SayStrategy;
import org.example.interfaces.enums.Gender;
import org.example.interfaces.enums.State;

import java.util.*;

public class Model extends AbstractPerson {
    private SayStrategy sayStrategy;
    private AbstractPerson mother;
    private AbstractPerson father;
    private final List<Person> siblings = new ArrayList<>();
    private final List<Person> children = new ArrayList<>();
    private AbstractPerson partner;

    public Model(String name, Place location, SayStrategy sayStrategy, Gender gender) {
        super(name, location, gender);
        setSayStrategy(sayStrategy);
    }

    public Model(String name, Place location, Gender gender) {
        super(name, location, gender);
        setSayStrategy(new SaySimpleStrategy());
    }


    @Override
    public void setMother(Person person) {
        if (mother == null) {
            mother = (AbstractPerson) person;
            mother.setChild(this);
        }
    }

    @Override
    public void setFather(Person person) {
        if (father == null) {
            father = (AbstractPerson) person;
            father.setOneChild(this);
        }
    }

    @Override
    public void setSiblings(Person... people) {

        for (Person person : people) {
            uniquePerson(siblings, person);
            person.setOneSiblings(this);
        }

    }

    @Override
    public void setOneSiblings(Person person) {
        uniquePerson(siblings, person);
    }

    @Override
    public void setPartner(Person person) {
        if (partner == null) {
            partner = (AbstractPerson) person;
            person.setPartner(this);
        }
    }


    @Override
    public void setChild(Person... people) {
        for (Person person : people) {
            uniquePerson(children, person);
            for (Person person2 : people) {
                if (!person.equals(person2)) {
                    person.setOneSiblings(person2);
                    person2.setOneSiblings(person);
                }
            }
            if (person.getFather() == null && getGender() == Gender.MAN)
                person.setFather(this);
            if (person.getMother() == null && getGender() == Gender.WOMAN)
                person.setMother(this);
        }
    }

    @Override
    public void setSayStrategy(SayStrategy sayStrategy) {
        this.sayStrategy = sayStrategy;
    }

    @Override
    public void say(String text) {
        setStateNow(State.SAY);
        System.out.print(getName() + " ");
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
        System.out.print(getName() + " интересоваться " + some);
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
    public List<Person> getChildren() {
        return children;
    }

    @Override
    public List<Person> getSiblings() {
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

    @Override
    public void setOneChild(Person person) {
        uniquePerson(siblings, person);
    }

    public void uniquePerson(List<Person> people, Person checkablePerson) {
        for (Person p : people) {
            if (p.equals(checkablePerson))
                return;
        }
        people.add(checkablePerson);
    }

}