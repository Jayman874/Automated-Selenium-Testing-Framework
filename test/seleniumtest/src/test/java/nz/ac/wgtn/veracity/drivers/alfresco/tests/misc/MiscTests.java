package nz.ac.wgtn.veracity.drivers.alfresco.tests.misc;

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
public class MiscTests extends SeleniumSetup {

	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void incorrectSignIn() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin123");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void searchUser() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.linkText("People")).click();
	    driver.findElement(By.id("template_x002e_people-finder_x002e_people-finder_x0023_default-search-text")).click();
	    driver.findElement(By.id("template_x002e_people-finder_x002e_people-finder_x0023_default-search-text")).sendKeys("Mike");
	    driver.findElement(By.id("template_x002e_people-finder_x002e_people-finder_x0023_default-search-button-button")).click();
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_people-finder_x002e_people-finder_x0023_default-search-button-button"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.xpath("(//a[contains(@href, \'profile\')])")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-profile_x0023_default-profile-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-profile_x0023_default-user-sites-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-sites_x0023_default-user-content-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-content_x0023_default-otherfollowing-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_following_x0023_default-user-sites-link")).click();
	    driver.findElement(By.linkText("Sample: Web Site Design Project")).click();
	    driver.findElement(By.xpath("(//div[@id=\'page_x002e_component-2-1_x002e_site_x007e_swsdp_x007e_dashboard_x0023_default-item-template\']/div/a/img)[2]")).click();
	    driver.findElement(By.id("closeButton")).click();
	    driver.findElement(By.cssSelector("#HEADER_USER_MENU_POPUP > .alfresco-menus-AlfMenuBarPopup__arrow")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_LOGOUT_text")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void followUsers() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.linkText("People")).click();
	    driver.findElement(By.id("template_x002e_people-finder_x002e_people-finder_x0023_default-search-text")).sendKeys("jobtitle:Manager");
	    driver.findElement(By.id("template_x002e_people-finder_x002e_people-finder_x0023_default-search-button-button")).click();
	    driver.findElement(By.linkText("Mike Jackson")).click();
	    driver.findElement(By.id("template_x002e_user-profile_x002e_user-profile_x0023_default-button-following-button")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-profile_x0023_default-user-sites-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-profile_x0023_default-user-sites-link")).click();
	    driver.findElement(By.linkText("Sample: Web Site Design Project")).click();
	    driver.findElement(By.linkText("Alice Beecher")).click();
	    driver.findElement(By.id("template_x002e_user-profile_x002e_user-profile_x0023_default-button-following-button")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-profile_x0023_default-profile-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-profile_x0023_default-user-sites-link")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_POPUP")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_PROFILE_text")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-profile_x0023_default-following-link")).click();
	    driver.findElement(By.id("template_x002e_following_x002e_following_x0023_default-checkbox-following-private")).click();
	    driver.findElement(By.id("template_x002e_following_x002e_following_x0023_default-checkbox-following-private")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void userProfile() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_POPUP")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_PROFILE_text")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-profile_x0023_default-profile-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-profile_x0023_default-user-sites-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-sites_x0023_default-user-content-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-content_x0023_default-following-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_following_x0023_default-followers-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_followers_x0023_default-body")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_followers_x0023_default-change-password-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_change-password_x0023_default-user-notifications-link")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_user-notifications_x0023_default-user-trashcan-link")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_POPUP")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_LOGOUT_text")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void selectHelp() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_POPUP")).click();
	    vars.put("window_handles", driver.getWindowHandles());
	    driver.findElement(By.linkText("Help")).click();
	    vars.put("win7672", waitForWindow(2000));
	    vars.put("root", driver.getWindowHandle());
	    driver.switchTo().window(vars.get("win7672").toString());
	    driver.close();
	    driver.switchTo().window(vars.get("root").toString());
	    driver.close();
	}
}
