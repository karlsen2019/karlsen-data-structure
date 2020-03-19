package com.karlsen.data.structure.stack.service;

import com.karlsen.data.structure.stack.entity.Stack;

import org.springframework.stereotype.Service;

@Service
public class CheckCodeService {
    public boolean checkBrackets(String code) {
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
        return true;
    }
}
