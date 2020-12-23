package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilityPackage.Shared;

public class StorelistPage {
	
	WebDriver dr;
	public StorelistPage(WebDriver x) {
		
		dr=x;
	}
	
	public void countStore() {
		
		int count = Shared.couneElement(dr.findElements(By.xpath("")));
		System.out.println(count);
	}
	
	public void setMystore() {
		
		Shared.couneElement(dr.findElements(By.xpath("")), 1);
	}

}
