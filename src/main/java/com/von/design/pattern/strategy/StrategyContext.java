package com.von.design.pattern.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 15575
 */
public class StrategyContext {
    private static final Map<String, Strategy<?, ?>> STRATEGY_MAP = new ConcurrentHashMap<>();

    private StrategyContext() {}

    public static <T, R> R execute(String name, T t) {
        return (R) getStrategy(name).execute(t);
    }

    public static void setStrategy(String name, Strategy<?, ?> strategy) {
        STRATEGY_MAP.put(name, strategy);
    }

    public static <T, R> Strategy<T, R> getStrategy(String name) {
        return (Strategy<T, R>) STRATEGY_MAP.get(name);
    }

    public static boolean containsKey(String name) {
        return STRATEGY_MAP.containsKey(name);
    }

    public static boolean containsValue(Strategy<?, ?> strategy) {
        return STRATEGY_MAP.containsValue(strategy);
    }
}
