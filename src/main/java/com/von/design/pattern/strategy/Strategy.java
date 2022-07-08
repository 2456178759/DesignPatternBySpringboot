package com.von.design.pattern.strategy;

/**
 * @author 15575
 */
public interface Strategy <T, R> {
    /**
     * 策略执行方法
     * @param t 入参
     * @return 出参
     */
    R execute(T t);
}
