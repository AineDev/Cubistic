package com.challenge.cubistic;

class TransactionsNotFoundException extends RuntimeException {
    TransactionsNotFoundException() {
        super("HTTP 404: Could not find any transactions");
    }
}
