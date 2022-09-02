package org.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJvmReport(String json) {

		// mention the path of JVM report where to store
		File file = new File("C:\\Users\\user\\eclipse-workspace\\OMRBranchAdactinHotel\\target");
		// create the object for configuration class
		Configuration configure = new Configuration(file, "Aadactin Hotel Page Automation");
		// mention the os,browser,version,sprint
		configure.addClassifications("Browser", "Chrome");
		configure.addClassifications("Browser version", "104.0.5112.101");
		configure.addClassifications("os", "WIN7");
		configure.addClassifications("Sprint", "15");
		// Create the object for report builder and the json file to fetch the results
		// passed, failed and skipped
		List<String> jsonFile = new ArrayList<String>();
		jsonFile.add(json);
		ReportBuilder builder = new ReportBuilder(jsonFile, configure);
		// Build the JVM Report
		builder.generateReports();

	}

}
