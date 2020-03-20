package com.karlsen.data.structure.service.stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.karlsen.data.structure.stack.MinStack;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * MinStackTest
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MinStackTest {

    private MinStack minStack;

    @Before
    public void initStack() {
        minStack = new MinStack();
    }

    public void destroyStack() {
        minStack.clear();
    }

    @Test
    public void min() {
        minStack.push(1);
        assertTrue(minStack.min() == 1);
        minStack.push(2);
        assertTrue(minStack.min() == 1);
        minStack.clear();

        minStack.push(3);
        assertTrue(minStack.min() == 3);
        minStack.push(2);
        assertTrue(minStack.min() == 2);
        minStack.clear();

        minStack.push(8);
        minStack.push(6);
        minStack.push(7);
        assertTrue(minStack.min() == 6);
        minStack.pop();
        assertTrue(minStack.min() == 6);
    }
}