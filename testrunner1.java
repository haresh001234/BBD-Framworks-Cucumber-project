package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

 @CucumberOptions(features ={"src/test/resources/Guru/guru.feature"}, glue = {"definition1"}, plugin = {"html:report/myreport.html"})
public class testrunner1 extends AbstractTestNGCucumberTests {

}
