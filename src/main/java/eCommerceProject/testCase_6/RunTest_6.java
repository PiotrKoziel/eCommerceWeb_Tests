package eCommerceProject.testCase_6;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/Scenarios/eCommerceProject/scenarioInclTestCase_6.feature",
            plugin = {"pretty", "html:testReports/cucumber-reports/TestCase_6"})
    public class RunTest_6 {

}

