package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testingData.TestData;
import utilityPackage.Shared;

public class FindstorePage {
	
	WebDriver dr;
	public FindstorePage(WebDriver x) {
		
		dr=x;
		
	}
	public void typeZipCode() {
		
		Shared.type(dr.findElement(By.xpath("")), TestData.zipCode);
	}
	
    public void clickOnArrowSign() {
		
		Shared.click(dr.findElement(By.xpath("")));
	}
    
    public void clickOnFifteenMile() {
		
		Shared.click(dr.findElement(By.xpath("")));
	}
    
    public void clickOnSearch() {
		
		Shared.click(dr.findElement(By.xpath("")));
	}

}
