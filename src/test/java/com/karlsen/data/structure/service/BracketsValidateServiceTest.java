package com.karlsen.data.structure.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BracketsValidateServiceTest {
    @Resource
    private BracketsValidateService bracketsValidateService; 
    private String legitimateStr = "(k(jd(ah(s)k(j)())))";
    private String illegalStr = "(k(jd(ah(s)k(j)()))";

    @Test
    public void bracketsValidateTest(){
        assertTrue(bracketsValidateService.bracketsValidate(legitimateStr));        
        assertTrue(!bracketsValidateService.bracketsValidate(illegalStr));        
    }
}