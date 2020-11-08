package eCommerceProject.testCase_5;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Scenarios/eCommerceProject/scenarioInclTestCase_5.feature",
        plugin = {"pretty", "html:testReports/cucumber-reports/TestCase_5"})
public class RunTest_5 {

}



