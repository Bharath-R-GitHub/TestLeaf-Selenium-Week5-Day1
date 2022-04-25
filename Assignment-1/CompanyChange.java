package week5.day1.assignment_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class CompanyChange extends BaseClass {
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
