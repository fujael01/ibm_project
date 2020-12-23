package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilityPackage.Shared;

public class StorePage {
	
	WebDriver dr;

	public StorePage(WebDriver x) {
		
		dr=x;
	}
	
	public void clickOnFindStore() {
		
		Shared.click(dr.findElement(By.xpath("")));
	}
}
