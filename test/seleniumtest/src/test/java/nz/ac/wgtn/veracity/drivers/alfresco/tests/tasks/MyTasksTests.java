package nz.ac.wgtn.veracity.drivers.alfresco.tests.tasks;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

import nz.ac.wgtn.veracity.drivers.alfresco.setup.SeleniumSetup;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyTasksTests extends SeleniumSetup {
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void startWorkflow() {
		driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.cssSelector("#HEADER_TASKS > .alfresco-menus-AlfMenuBarPopup__arrow")).click();
	    driver.findElement(By.linkText("My Tasks")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_my-tasks_x0023_default-startWorkflow-button-button")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-workflow-definition-button-button")).click();
	    driver.findElement(By.cssSelector("#yui-gen0 > .description")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowDescription")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowDescription")).sendKeys("New Task");
	    {
	      WebElement dropdown = driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowPriority"));
	      dropdown.findElement(By.xpath("//option[. = 'High']")).click();
	    }
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowPriority"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowPriority"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowPriority"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.id("yui-gen11-button")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_assoc_bpm_assignee-cntrl-picker-searchText")).sendKeys("admin");
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_assoc_bpm_assignee-cntrl-picker-searchButton-button")).click();
	    driver.findElement(By.xpath("//a[@id=\'alf-id3\']/span")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_assoc_bpm_assignee-cntrl-ok-button")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0-form-submit-button")).click();
	    {
	      WebElement element = driver.findElement(By.id("yui-rec7"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.xpath("//div[3]/a/span")).click();
	    driver.findElement(By.cssSelector(".first-child > #page_x002e_data-actions_x002e_workflow-details_x0023_default-cancel-button")).click();
	    driver.findElement(By.xpath("//button")).click();
	    driver.close();
	  }
	
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void currentWorkflows() {
		driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.id("HEADER_TASKS_text")).click();
	    driver.findElement(By.linkText("Workflows I\'ve Started")).click();
	    driver.findElement(By.id("template_x002e_toolbar_x002e_my-workflows_x0023_default-startWorkflow-button-button")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-workflow-definition-button-button")).click();
	    driver.findElement(By.id("yui-gen2")).click();
	    driver.findElement(By.id("yui-gen11-button")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_assoc_bpm_assignees-cntrl-picker-searchText")).sendKeys("admin");
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_assoc_bpm_assignees-cntrl-picker-searchButton-button")).click();
	    driver.findElement(By.xpath("//a[@id=\'alf-id1\']/span")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector("#template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_assoc_bpm_assignees-cntrl-ok > .first-child")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowDescription")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowDescription")).sendKeys("New Tasks");
	    driver.findElement(By.cssSelector(".alf-g")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowPriority"));
	      dropdown.findElement(By.xpath("//option[. = 'Low']")).click();
	    }
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowPriority"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowPriority"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_bpm_workflowPriority"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector(".itemtype-cm\\3Aperson")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_wf_requiredApprovePercent")).click();
	    driver.findElement(By.cssSelector("#template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0_prop_wf_requiredApprovePercent-cntrl > label")).click();
	    driver.findElement(By.id("template_x002e_start-workflow_x002e_start-workflow_x0023_default-startWorkflowForm-alf-id0-form-submit-button")).click();
	    {
	      WebElement element = driver.findElement(By.id("yui-rec7"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.xpath("//div[2]/a/span")).click();
	    driver.findElement(By.id("yui-gen20-button")).click();
	    driver.close();
	  }
	
	@Test
	@BenchmarkOptions(concurrency = 1, warmupRounds = 0, benchmarkRounds = 1)
	public void completedWorkflows() {
	    driver.get("http://localhost:8080/share/page/");
	    driver.manage().window().setSize(new Dimension(1846, 1173));
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-username")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).click();
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-password")).sendKeys("admin");
	    driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
	    driver.findElement(By.cssSelector("#HEADER_TASKS > .alfresco-menus-AlfMenuBarPopup__arrow")).click();
	    driver.findElement(By.linkText("My Tasks")).click();
	    driver.findElement(By.linkText("Completed")).click();
	    driver.findElement(By.linkText("Me")).click();
	    driver.findElement(By.linkText("Next 7 days")).click();
	    driver.findElement(By.linkText("High")).click();
	    driver.findElement(By.linkText("Medium")).click();
	    driver.findElement(By.linkText("Low")).click();
	    driver.findElement(By.cssSelector("header > div")).click();
	    driver.close();
	}
	  
}
