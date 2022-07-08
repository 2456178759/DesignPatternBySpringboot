package com.von.design.pattern.strategy.impl;

import com.von.design.pattern.strategy.Strategy;
import com.von.design.pattern.strategy.StrategyModule;
import org.springframework.stereotype.Component;

@Component
@StrategyModule(name = "A-strategy")
public class AStrategy implements Strategy<String, String> {
    @Override
    public String execute(String s) {
        System.out.println("A-strategy");
        return s;
    }
}
