package com.karlsen.data.structure.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * InversePolishServiceTest
 */
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
}