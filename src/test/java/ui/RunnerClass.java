package ui;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"C:\\Users\\Asus\\eclipse-workspace\\OvationTravelWebApplication\\resource\\Folder\\uiFeature\\ovation.feature"},
		glue = {"ui"},
		plugin = {"pretty","html:@target/oviation.html"}		
		)
public class RunnerClass extends AbstractTestNGCucumberTests
{

}
