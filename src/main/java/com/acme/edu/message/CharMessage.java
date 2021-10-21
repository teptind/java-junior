package com.acme.edu.message;

public class CharMessage implements Message {

    private static final String CHAR_PREFIX = "char: ";

    private char accumulator;

    public CharMessage(char ch) {
        this.accumulator = ch;
    }

    @Override
    public Message append(Message message) {
        return null;
    }

    @Override
    public String getBody() {
        return CHAR_PREFIX + accumulator;
    }

    @Override
    public boolean canAppend(Message message) {
        return false;
    }
}
