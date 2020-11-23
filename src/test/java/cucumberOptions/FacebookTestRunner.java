package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Facebook/features",
		glue = "Facebook.stepDefinitions",
//		dryRun = true,
		monochrome = true,
		plugin = {"pretty","html:target/site/cucumber-report-default","json:target/site/cucumber_Facebook.json"},
		snippets = SnippetType.CAMELCASE,
		tags = {"@have_param"})


public class FacebookTestRunner {

}
