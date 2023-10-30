package nz.ac.wgtn.veracity.drivers.tests;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

import nz.ac.wgtn.veracity.drivers.setup.SeleniumSetup;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleTests extends SeleniumSetup {

	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void exampleTest() {
	    driver.get("https://example.com");
	    /** Test Code **/
	    driver.close();
	}
}
