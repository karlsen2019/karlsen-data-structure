package com.karlsen.data.structure.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import javax.annotation.Resource;

import com.google.common.collect.Lists;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * InversePolishServiceTest
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class InversePolishServiceTest {

    @Resource
    private InversePolishService inversePolishService;

    @Test
    public void eval() {
        String expresion1 = "12 * 4";
        String expresion2 = "4 * 12";
        String expresion3 = "8 * 4";
        assertTrue(inversePolishService.eval(expresion1).equals("48"));
        assertTrue(inversePolishService.eval(expresion2).equals("48"));
        assertTrue(inversePolishService.eval(expresion3).equals("32"));
    }

    @Test
    public void inversePolish() {
        List<String> list = Lists.newArrayList("4", "13", "5", "/", "+");
        String reslult = inversePolishService.inversePolish(list);
        log.info("后缀表达式结果为：{}", reslult);
        assertTrue("6".equals(reslult));
    }
}