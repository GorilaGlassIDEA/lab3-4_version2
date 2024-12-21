package org.example.interfaces.enums;

public enum State {
    LIE("врать"),
    SHOW("показать"),
    SAY("сказать"),
    SEE("увидеть"),
    GO("пойти"),
    MOVE("переместиться"),
    INTEREST("интересоваться");

    private final String action;

    State(String action) {
        this.action = action;
    }


    @Override
    public String toString() {
        return action;
    }
}
