package com.ssafy.exception;

public class AgeValidator {
    public void checkAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("나이는 18세 이상이어야 합니다.");
        }
        System.out.println("나이 검증 통과!");
    }

    public void checkAgeResult(int age) {
        checkAge(age);
    }
}
