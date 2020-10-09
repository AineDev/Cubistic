package com.challenge.cubistic;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.ZonedDateTime;

@Data
@Entity
public class Transaction {
    private @Id @GeneratedValue Long id;
    private BigDecimal amount;
    private ZonedDateTime timestamp;

    public Transaction(String amount, String timestamp){
        this.amount = setScale(new BigDecimal(amount));
        this.timestamp = parseAsTimestamp(timestamp);
    }

    public BigDecimal setScale(BigDecimal amount){
        return amount.setScale(2, RoundingMode.HALF_UP);
    }

    public Transaction() {}

    private ZonedDateTime parseAsTimestamp(String timestamp){
        return ZonedDateTime.parse(timestamp);
    }

    public BigDecimal getAmount() {
        return amount;
    }
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
