package com.ujianmingguketiga;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
                "src/main/resources/features/01.Login.feature",
                "src/main/resources/features/02.Search.feature",
                "src/main/resources/features/03.AddCart.feature",
        },
        glue = "com.ujianmingguketiga",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
