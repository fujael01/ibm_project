package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Repojetory.ObjectRepo;
import testingData.TestData;
import utilityPackage.Shared;

public class HomePage {
	WebDriver dr;
	public HomePage(WebDriver x) {
		
		dr=x;
	}
	
	public void verifyHomePageTitle(WebDriver x) {
		
		Shared.verifyTitle(dr, TestData.HomeTitle);
	}
    public void verifyHomePagelogo(WebDriver x) {
		
		Shared.isElementPresent(dr, By.xpath(ObjectRepo.HomePagelogo));
	}
	
	public void mouseOveronMenu() {
		
		Shared.hoverOver(dr, ObjectRepo.menu );
	}
	
	public void typeOnSearchBox(WebDriver x) {
		
		Shared.typeOnSearchBox(dr, By.id(""), "shoe");
	}
	 public void clickOnSearchButton(WebDriver x) {
			
			Shared.click(dr, ObjectRepo.SearchButton);
		}
	
    public void clickOnJunior() {
		
		Shared.click(dr, ObjectRepo.Junior);
	}
    
    public void mouseOverOnBackToSchool() {
		
		Shared.hoverOver(dr, ObjectRepo.BackToSchool);
	}
    
    public void clickOnStores() {
		
		Shared.click(dr, ObjectRepo.Storexpath);
	}
	
   
    
    
   
    
   

}
