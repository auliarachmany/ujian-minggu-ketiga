package com.ujianmingguketiga.utils;

public enum TestScenarios {

    T1("User invalid login"),
    T2("User valid login"),
    T3("User searching for product not found"),
    T4("User search product item"),
    T5("User add cart dress product item"),
    ;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}

