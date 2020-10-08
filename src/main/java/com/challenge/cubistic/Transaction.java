package com.challenge.cubistic;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
@Entity
public class Transaction {
    private @Id @GeneratedValue Long id;
    private BigDecimal amount;
    private ZonedDateTime timestamp; // TODO: As String for simplicity, change this later

    public Transaction(String amount, String timestamp){
        this.amount = new BigDecimal(amount);
        this.timestamp = parseAsTimestamp(timestamp);
    }

    public Transaction(BigDecimal amount, String timestamp){
        this.amount = amount;
        this.timestamp = parseAsTimestamp(timestamp);
    }

    public Transaction() {}

    private ZonedDateTime parseAsTimestamp(String timestamp){
        ZonedDateTime time = ZonedDateTime.parse(timestamp);

        // TODO: turn into actual time
        return time;
    }

    public BigDecimal getAmount() {
        return amount;
    }
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
