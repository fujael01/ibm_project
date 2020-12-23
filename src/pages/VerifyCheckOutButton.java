package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Repojetory.ObjectRepo;
import testingData.TestData;
import utilityPackage.Shared;

public class VerifyCheckOutButton {
	
	WebDriver dr;
    public VerifyCheckOutButton(WebDriver x) {
	
	dr=x;
	
    }
    
    public void CheckButtonVerify() {
    	
    	//Shared.verifyCheckOutButton(dr.findElement(ObjectRepo.ViewCartCheckOutButtonXpath),TestData.CheckOutButtonName);
    	
    	if(Shared.verifyCheckOut(dr.findElement(ObjectRepo.ViewCartcheckOutButtonxpath),TestData.CheckOutButtonName)) {
    		
    		System.out.println("Checkout Button is Enabled");
    	}
    
    	else {
    		System.out.println("Checkout Button does'nt Enabled");
    	}
    }
    
public void clickOnCheckOutButton() {
		
		Shared.clickOnCheckOut(dr.findElement(By.xpath("")), TestData.CheckOutButtonName);
			                                  
    	
   }
    	
    

}
