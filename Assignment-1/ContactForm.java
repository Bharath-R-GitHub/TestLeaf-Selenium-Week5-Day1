package week5.day1.assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class ContactForm extends BaseClass {
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
}
