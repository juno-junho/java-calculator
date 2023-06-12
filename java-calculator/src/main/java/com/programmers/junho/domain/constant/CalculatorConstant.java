package com.programmers.junho.domain.constant;

public enum CalculatorConstant {
    REDEX("^\\d+\\s([-+*/]\\s\\d+\\s)+$"),
    DELIMITER(" "),
    BLANK(" ");

    private final String value;

    CalculatorConstant(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}