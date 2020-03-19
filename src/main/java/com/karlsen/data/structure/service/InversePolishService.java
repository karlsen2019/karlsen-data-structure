package com.karlsen.data.structure.service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

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
            return String.valueOf(scriptEngine.eval(expression));
        } catch (ScriptException e) {
            log.error(e.getMessage(), e);
        }
        return "表达式错误";
    }

}