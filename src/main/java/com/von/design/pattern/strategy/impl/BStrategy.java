package com.von.design.pattern.strategy.impl;

import com.von.design.pattern.strategy.Strategy;
import com.von.design.pattern.strategy.StrategyModule;
import org.springframework.stereotype.Component;

@Component
@StrategyModule(name = "B-strategy")
public class BStrategy implements Strategy<String, String> {
    @Override
    public String execute(String s) {
        System.out.println("B-strategy!");
        return s;
    }
}
