package week5.day1.assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Leaftaps extends BaseClass {

	@Test(invocationCount = 2, priority = 2)
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

	@Test(enabled = false, priority = 3)
	public void duplicateLead() {

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

		// Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();

		// Clear the CompanyName Field And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant Technology Solutions");

		// Clear the FirstName Field And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharath Raju");

		// Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();

		// Get the Title of Resulting Page
		String finalPage = driver.getTitle();
		System.out.println(finalPage);
	}

	@Test(priority = 1, invocationCount = 2)
	public void contactForm() throws InterruptedException {

		// Click on contacts Button
		driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]/a")).click();
		Thread.sleep(2000);

		// Click on Create Contact
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li[2]/a")).click();

		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Bharath");

		// Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("R");

		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Bharu");

		// Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raju");

		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Information Technology");

		// Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createContactForm_description")).sendKeys("Software - IT");

		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("barathrju@gmail.com");

		// Select State/Province as NewYork Using Visible Text
		WebElement elements = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(elements);
		dd.selectByVisibleText("New York");

		// Click on Create Contact
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();

		// Click on edit button
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();

		// Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();

		// Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Week 2 - Assignment 2.1");

		// Click on update button using Xpath locator
		driver.findElement(By.xpath("//td[@class='label']/following-sibling::td/input[@value='Update']")).click();

		// Get the Title of Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority = 5)
	public void editLead() {

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

		// Click on edit button
		driver.findElement(By.linkText("Edit")).click();

		// Clear the Description Field using .clear()
		driver.findElement(By.id("updateLeadForm_description")).clear();

		// Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note is Added");

		// Click on update button
		driver.findElement(By.className("smallSubmit")).click();

		// Get the Title of Resulting Page
		String resultingPage = driver.getTitle();
		System.out.println(resultingPage);
	}

	@Test(priority = 4)
	public void companyChange() throws InterruptedException {

		// Click Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		// Enter first name
		driver.findElement(
				By.xpath("//div[contains(@class,'x-tab-item')]/following-sibling::div/div/input[@name='firstName']"))
				.sendKeys("Bharath");

		// Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

		// Click on first resulting lead
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();

		// Verify title of the page
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("I Verified that the Current Page title is View Lead");
		} else {
			System.out.println("The Current Page is not a View Lead page");
		}

		// Click Edit
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();

		// Change the company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		String changedCompany = "Cognizant Technology Solutions";
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(changedCompany);

		// Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();

		// Confirm the changed name appears
		String company = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (company.contains(changedCompany)) {
			System.out.println("I confirmed that the Changed Company Name Appeared");
		} else {
			System.out.println("The Changed Company Name does not Appeared");
		}
	}
}
