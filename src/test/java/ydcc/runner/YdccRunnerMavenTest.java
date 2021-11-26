package ydcc.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources",
glue = {"com.homepageydcctest"},
tags ="@Regression",
dryRun = false
)

public class YdccRunnerMavenTest extends AbstractTestNGCucumberTests {

}
