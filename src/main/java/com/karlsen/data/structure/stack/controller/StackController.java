package com.karlsen.data.structure.stack.controller;

import com.karlsen.data.structure.stack.service.CheckCodeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("stack")
@RestController
@AllArgsConstructor
public class StackController {
    private CheckCodeService checkCodeService;

    @GetMapping("checkBrackets")
    public boolean checkBrackets(String code) {
        return checkCodeService.checkBrackets(code);
    }
}
