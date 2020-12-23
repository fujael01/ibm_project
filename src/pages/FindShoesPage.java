package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testingData.TestData;
import utilityPackage.Shared;

public class FindShoesPage {
	
	WebDriver dr;
	public FindShoesPage(WebDriver x) {
		
		dr=x;
		
	}
	
	 public void clickOnSearch() {
			
			Shared.click(dr.findElement(By.xpath("")));
		}
	 public void typeShoe() {
			
			Shared.type(dr.findElement(By.xpath("")), TestData.productname);
		}
	 
	

}
