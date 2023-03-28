package com.geekgarden.technicaltest.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public Long findFibonacci(Long n) {
        long a = 0L, b = 1L, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public String findPalindrome(String s) {

        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subString = s.substring(i, j + 1);
                if (checkPalindrome(subString)) {
                    if (subString.length() > longestPalindrome.length() && !subString.equals(s) && subString.length() > 1) {
                        longestPalindrome = subString;
                    }
                }
            }
        }
        return (!longestPalindrome.equals("") ? longestPalindrome : "Palindrome substring not found");
    }

    public static boolean checkPalindrome(String subString)
    {
        int size = subString.length();
        for (int i = 0; i < size / 2; i++) {
            if (subString.charAt(i) != subString.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
