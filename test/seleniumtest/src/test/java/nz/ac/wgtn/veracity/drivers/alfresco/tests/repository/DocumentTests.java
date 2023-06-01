package nz.ac.wgtn.veracity.drivers.alfresco.tests.repository;

import java.util.concurrent.TimeUnit;

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
public class DocumentTests extends SeleniumSetup {
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void editing() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-form")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.linkText("Repository")).click();
	    //driver.findElement(By.cssSelector(".doclib-filter > .alfresco-twister")).click();
	    //driver.findElement(By.cssSelector(".doclib-filter > .alfresco-twister")).click();
	    
	    driver.findElement(By.linkText("I\'m Editing")).click();
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_documentlist_v2_x002e_repository_x0023_default-sortField-button-button"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("template_x002e_documentlist_v2_x002e_repository_x0023_default-sortField-button-button")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.linkText("Popularity")).click();
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_documentlist_v2_x002e_repository_x0023_default-options-button-button"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("template_x002e_documentlist_v2_x002e_repository_x0023_default-options-button-button")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.close();
	  }
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void favourite() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-form")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.linkText("Repository")).click();
	    driver.findElement(By.cssSelector(".doclib-filter > .alfresco-twister")).click();
	    driver.findElement(By.cssSelector(".doclib-filter > .alfresco-twister")).click();
	    driver.findElement(By.linkText("My Favorites")).click();
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_documentlist_v2_x002e_repository_x0023_default-sortField-button-button"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("template_x002e_documentlist_v2_x002e_repository_x0023_default-sortField-button-button")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.linkText("Popularity")).click();
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_documentlist_v2_x002e_repository_x0023_default-options-button-button"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("template_x002e_documentlist_v2_x002e_repository_x0023_default-options-button-button")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.close();
	  }
}
