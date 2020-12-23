package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Repojetory.ObjectRepo;
import utilityPackage.Shared;

public class CheckOutPage {
	

	WebDriver dr;
	public CheckOutPage(WebDriver x) {
		dr=x;
	}
	
	public void clickOnCheckOut() {
		Shared.click(dr, ObjectRepo.ClickOnCheckOut);
	}


}
