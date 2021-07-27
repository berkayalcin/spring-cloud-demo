package com.example.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/")
public class RateController {
    @Value("${rate}")
    String rate;
    @Value("${lanecount}")
    String lanecount;

    @GetMapping("/rate")
    public String getRate() {
        return rate;
    }

    @GetMapping("/lane-count")
    public String getLanecount() {
        return lanecount;
    }
}
