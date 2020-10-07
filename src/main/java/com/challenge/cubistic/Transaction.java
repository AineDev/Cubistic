package com.challenge.cubtistic;

import java.math.BigDecimal;

public class Transaction {

    private BigDecimal amount;
    private String timestamp; // TODO: As String for simplicity, change this later

    public Transaction(String amount, String timestamp){
        this.amount = parseAsBigDecimal(amount);
        this.timestamp = parseAsTimestamp(timestamp);
    }

    private BigDecimal parseAsBigDecimal(String amount){
//        TODO: complete function
        return null;
    }

    private String parseAsTimestamp(String timestamp){
//        TODO: complete function
        return null;
    }

    public BigDecimal getAmount() {
        return amount;
    }
    public String getTimestamp() {
        return timestamp;
    }
}
