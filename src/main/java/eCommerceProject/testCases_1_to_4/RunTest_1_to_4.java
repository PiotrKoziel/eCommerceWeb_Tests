package eCommerceProject.testCases_1_to_4;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/Scenarios/eCommerceProject/scenariosInclTestCases_1_to_4.feature",
            plugin = {"pretty", "html:testReports/cucumber-reports/TestCases_1_to_4"})
    public class RunTest_1_to_4 {

}



