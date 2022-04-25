package week5.day1.assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class CreateLead extends BaseClass {
	public void createLead() {

		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");

		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharath");

		// Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rengaraj");

		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bharath R");

		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software - IT");

		// Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Week 2 - Assignment 1 - Create Lead");

		// Enter your email in the E-mail address Field using the locator of your
		// choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("barathrju@gmail.com");

		// Select State/Province as NewYork Using Visible Text
		WebElement ddElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(ddElement);
		dd.selectByVisibleText("New York");

		// Click on Create Button
		driver.findElement(By.name("submitButton")).click();

		// Get the Title of Resulting Page
		String resultingPage = driver.getTitle();
		System.out.println(resultingPage);
	}
}
