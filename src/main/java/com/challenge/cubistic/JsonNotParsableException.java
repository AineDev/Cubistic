package com.challenge.cubistic;

public class JsonNotParsableException extends RuntimeException {
    JsonNotParsableException() {
        super("400 JSON is invalid");
    }
}