package com.karlsen.data.structure.service;

import java.util.Stack;

import org.springframework.stereotype.Service;

/**
 * BracketsValidateService
 */
@Service
public class BracketsValidateService {
    public boolean bracketsValidate(String code) {
        Stack<Object> bracketStack = new Stack<>();
        for (int i = 0; i < code.length(); i++) {
            char charAt = code.charAt(i);
            if (charAt == '(') {
                bracketStack.push(charAt);
            } else if (charAt == ')') {
                if (bracketStack.isEmpty()) {
                    return false;
                } else {
                    bracketStack.pop();
                }
            }
        }
        return bracketStack.isEmpty();
    }
}