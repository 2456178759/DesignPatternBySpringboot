package com.von.design.pattern.strategy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author 15575
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Scope("singleton")
@Component
@Inherited
public @interface StrategyModule {
    String name();
}
