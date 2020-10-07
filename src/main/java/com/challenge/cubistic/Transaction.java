package com.challenge.cubistic;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Transaction {

    private BigDecimal amount;
    private String timestamp; // TODO: As String for simplicity, change this later

    public Transaction(String amount, String timestamp){
        this.amount = new BigDecimal(amount);
        this.timestamp = parseAsTimestamp(timestamp);
    }
    public Transaction(BigDecimal amount, String timestamp){
        this.amount = amount;
        this.timestamp = parseAsTimestamp(timestamp);
    }

    private String parseAsTimestamp(String timestamp){
        // TODO: turn into actual time
        return timestamp;
    }

    public BigDecimal getAmount() {
        return amount;
    }
    public String getTimestamp() {
        return timestamp;
    }
}
