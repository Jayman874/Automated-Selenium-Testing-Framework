package nz.ac.wgtn.veracity.drivers.alfresco.tests.settings;

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
public class SettingsTests extends SeleniumSetup {

	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void loginSettings() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.cssSelector(".alf-configure-icon")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-cancel-button-button")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_POPUP")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void changeLayout() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.cssSelector(".alf-configure-icon")).click();
	    driver.findElement(By.id("template_x002e_customise-layout_x002e_customise-user-dashboard_x0023_default-change-button-button")).click();
	    driver.findElement(By.id("template_x002e_customise-layout_x002e_customise-user-dashboard_x0023_default-select-button-dashboard-1-column-button")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-save-button-button")).click();
	    driver.findElement(By.id("HEADER_CUSTOMIZE_USER_DASHBOARD")).click();
	    driver.findElement(By.id("template_x002e_customise-layout_x002e_customise-user-dashboard_x0023_default-change-button-button")).click();
	    driver.findElement(By.id("template_x002e_customise-layout_x002e_customise-user-dashboard_x0023_default-select-button-dashboard-2-columns-wide-left-button")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-trashcan-img")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-save-button-button")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_POPUP")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void changeDashlets() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.cssSelector(".alf-configure-icon")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-addDashlets-button-button")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("#yui-gen0 > .dnd-draggable"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("ygddfdiv"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("ygddfdiv"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.id("Share")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-save-button-button")).click();
	    driver.findElement(By.cssSelector(".alf-configure-icon")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-save-button-button")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_POPUP_text")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void changeDashlets4() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.cssSelector(".alf-configure-icon")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-addDashlets-button-button")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("#yui-gen0 > .dnd-draggable"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("ygddfdiv"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("ygddfdiv"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.id("Share")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-save-button-button")).click();
	    driver.findElement(By.cssSelector(".alf-configure-icon")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-save-button-button")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_POPUP_text")).click();
	    driver.close();
	}
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void gettingStartedPanel() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.cssSelector(".alf-configure-icon")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-welcomePanelEnabled")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-save-button-button")).click();
	    driver.findElement(By.cssSelector(".alf-configure-icon")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-welcomePanelDisabled")).click();
	    driver.findElement(By.id("template_x002e_customise-dashlets_x002e_customise-user-dashboard_x0023_default-save-button-button")).click();
	    driver.findElement(By.id("HEADER_USER_MENU_POPUP_text")).click();
	    driver.close();
	}
}