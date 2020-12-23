package pages;

import org.openqa.selenium.WebDriver;

import Repojetory.ObjectRepo;
import testingData.TestData;
import utilityPackage.Shared;

public class CartCheckOutPage {
	
	WebDriver dr;
    public CartCheckOutPage(WebDriver x) {
	
	dr=x;
	
    }
    
    public void clickViewCartAndCheckOutPage() {
		Shared.click(dr, ObjectRepo.ViewCartcheckOutButtonxpath);
	}

    
}    	
      