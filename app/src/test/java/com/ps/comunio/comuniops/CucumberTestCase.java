package com.ps.comunio.comuniops;


import android.test.AndroidTestCase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        glue = {"com.ps.comunio.comuniops.steps"},
        //format = {"pretty","junit:/build/test-results/debugJUnitReport.xml", "json:D:/build/test-results/debug/JSONReport.json"},
        dryRun = false,
        features = {"src/test/resources/features"},
        strict = false
)
public class CucumberTestCase {
}