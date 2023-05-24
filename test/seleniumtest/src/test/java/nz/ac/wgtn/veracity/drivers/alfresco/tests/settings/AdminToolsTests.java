package nz.ac.wgtn.veracity.drivers.alfresco.tests.settings;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

import nz.ac.wgtn.veracity.drivers.alfresco.setup.SeleniumSetup;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdminToolsTests extends SeleniumSetup {

	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void changeSiteColours() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.linkText("Admin Tools")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("console-options-theme-menu"));
	      dropdown.findElement(By.xpath("//option[. = 'Green Theme']")).click();
	    }
	    {
	      WebElement element = driver.findElement(By.id("console-options-theme-menu"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("console-options-theme-menu"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("console-options-theme-menu"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-apply-button-button")).click();
	    {
	      WebElement element = driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-apply-button-button"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement dropdown = driver.findElement(By.id("console-options-theme-menu"));
	      dropdown.findElement(By.xpath("//option[. = 'Light Theme']")).click();
	    }
	    {
	      WebElement element = driver.findElement(By.id("console-options-theme-menu"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("console-options-theme-menu"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("console-options-theme-menu"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-apply-button-button")).click();
	    {
	      WebElement element = driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-apply-button-button"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-reset-button-button")).click();
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-upload-button-button")).click();
	    {
	      WebElement element = driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-upload-button-button"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.id("template_x002e_dnd-upload_x002e_console_x0023_default-cancelOk-button-button")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void categoryManager() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.linkText("Admin Tools")).click();
	    driver.findElement(By.linkText("Category Manager")).click();
	    driver.findElement(By.cssSelector("#ygtvt2 > .ygtvspacer")).click();
	    driver.findElement(By.cssSelector("#ygtvt3 > .ygtvspacer")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void browserInfo() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.linkText("Admin Tools")).click();
	    driver.findElement(By.linkText("Module Browser")).click();
	    driver.findElement(By.linkText("Node Browser")).click();
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-button-button")).click();
	    driver.findElement(By.linkText("workspace://SpacesStore/3df858ad-cdf5-4ccb-8e84-26651ad5f88c")).click();
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-goback-button-button")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void replicationJobs() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.linkText("Admin Tools")).click();
	    driver.findElement(By.linkText("Replication Jobs")).click();
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-button")).click();
	    driver.findElement(By.id("template_x002e_replication-job_x002e_replication-job_x0023_default-form-cancel-button")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void groupsAndUsers() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.linkText("Admin Tools")).click();
	    driver.findElement(By.cssSelector(".toolLink:nth-child(6) > .first-link")).click();
	    driver.findElement(By.linkText("Groups")).click();
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-text")).sendKeys("John");
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-button-button")).click();
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-browse-button-button")).click();
	    driver.findElement(By.cssSelector(".groups-newgroup-button")).click();
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-creategroup-cancel-button-button")).click();
	    driver.findElement(By.linkText("Users")).click();
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-text")).sendKeys("John");
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-button-button")).click();
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-newuser-button-button")).click();
	    driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-createuser-cancel-button-button")).click();
	    driver.close();
	}
}
