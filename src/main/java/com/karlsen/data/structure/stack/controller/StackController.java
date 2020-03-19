package com.karlsen.data.structure.stack.controller;

import com.karlsen.data.structure.stack.service.CheckCodeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("stack")
@RestController
public class StackController {
    @Resource
    private CheckCodeService checkCodeService;

    @GetMapping("checkBrackets")
    public boolean checkBrackets(String code) {
        return checkCodeService.checkBrackets(code);
    }
}
