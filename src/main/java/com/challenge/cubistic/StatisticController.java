package com.challenge.cubistic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisticController {

    @GetMapping("/statistics")
    public Statistic statistic() {
        return new Statistic();
    }
}