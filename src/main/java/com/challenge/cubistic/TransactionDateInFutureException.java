package com.challenge.cubistic;

class TransactionDateInFutureException extends RuntimeException {
    TransactionDateInFutureException() {
        super("HTTP 422: transaction date is in the future");
    }
}
