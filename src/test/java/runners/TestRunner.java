package runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"pretty" ,"html:target/cucumber-html-report",
                "json:target/testresult/cucumber.json","pretty:target/cucumber-pretty.txt",
                "junit:target/cucumber-results.xml"},
				
        features= { "src/test/java/demo.feature" },
        		 format={"pretty","html:target/Reports"}
		)
public class TestRunner {
	
	
	

}
