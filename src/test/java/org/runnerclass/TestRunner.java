package org.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reporting.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( snippets = SnippetType.CAMELCASE, dryRun = false, publish = true, monochrome = true, plugin = {
		"pretty",
		"json:target\\Output.json" }, stepNotifications = true, features = "src\\test\\resources", glue = "org.stepdefinition")
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		Reporting.generateJvmReport(System.getProperty("user.dir") + "\\target\\Output.json");

	}

}