package com.geekgarden.technicaltest.controller;

import com.geekgarden.technicaltest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("fibonacci")
    public Long testFibonacci(@RequestParam Long n) {
        return testService.findFibonacci(n);
    }

    @GetMapping("palindrome")
    public String testPalindrome(@RequestParam String s) {
        return testService.findPalindrome(s);
    }
}
