package com.karlsen.data.structure.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.google.common.collect.Lists;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * Inverse
 */

@Slf4j
@Service
public class InversePolishService {
    private ScriptEngine scriptEngine;

    public InversePolishService() {
        scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
    }

    public String eval(String expression) {
        try {
            BigDecimal result = new BigDecimal(scriptEngine.eval(expression).toString());
            return result.setScale(0, RoundingMode.DOWN).toString();
        } catch (ScriptException e) {
            log.error(e.getMessage(), e);
        }
        return "表达式错误";
    }

    public String inversePolish(List<String> items) {
        List<String> operations = Lists.newArrayList("+", "-", "*", "/");
        Stack<String> inversePolishStack = new Stack<>();
        for (String item : items) {
            if (!operations.contains(item)) {
                inversePolishStack.push(item);
            } else {
                String first = inversePolishStack.pop();
                String second = inversePolishStack.pop();
                String expression = second + item + first;
                inversePolishStack.push(eval(expression));
            }
        }
        return inversePolishStack.pop();
    }

}