package testRunner;		

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="/Incubyte/Features/MyTest.feature",glue={"/Incubyte/src/main/java/stepDefinition/Steps.java"})						
public class Runner 				
{		

}