package com.von;

import com.von.design.pattern.strategy.StrategyContext;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class StrategyTest {

    @Test
    public void normalTest() {
        String s = "Hello";
        String result = StrategyContext.execute("A-strategy", s);
        assert s.equals(result) : "s和result必须相等";
    }
}
