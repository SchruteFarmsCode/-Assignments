package org.example;

class TextTooShortException extends Exception {
    public TextTooShortException(String text) {

        super(text);
    }
}
