package org.example.interfaces.enums;

public enum State {
    LIE("врать"),
    SHOW("показать"),
    SAY("сказать"),
    SEE("увидеть"),
    GO("пойти"),
    MOVE("переместиться");

    private final String action;

    State(String action) {
        this.action = action;
    }


    @Override
    public String toString() {
        return action;
    }
}
