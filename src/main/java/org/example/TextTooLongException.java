package org.example;

class TextTooLongException extends Exception {
    public TextTooLongException(String text) {
        super(text);

    }
}