package com.von.design.pattern.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.core.annotation.AnnotationUtils;

import java.util.List;

/**
 * @author 15575
 */
@Slf4j
@SpringBootConfiguration
public class StrategyConfiguration implements InitializingBean {
    @Autowired
    List<Strategy<?, ?>> strategies;

    @Override
    public void afterPropertiesSet() {
        for (Strategy<?, ?> strategy : strategies) {
            StrategyModule annotation = AnnotationUtils.findAnnotation(strategy.getClass(), StrategyModule.class);
            if (annotation == null) {
                log.error("策略配置错误[策略必须存在]");
                throw new RuntimeException("策略配置错误[策略必须存在]");
            }
            String name = annotation.name();
            if (StrategyContext.containsKey(name)) {
                log.error("策略配置错误[策略名不能重复]");
                throw new RuntimeException("策略配置错误[策略名不能重复]");
            }
            log.info("策略配置成功，策略名[{}]", name);
            StrategyContext.setStrategy(name, strategy);
        }
    }
}
