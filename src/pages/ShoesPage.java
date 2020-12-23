package pages;

import org.openqa.selenium.WebDriver;

import Repojetory.ObjectRepo;
import testingData.TestData;
import utilityPackage.Shared;

public class ShoesPage {
	
	WebDriver dr;
    public ShoesPage(WebDriver x) {
	
	dr=x;
	
    }
public void clickOnFirstShow() {
	
	Shared.clickOnFirstShow(dr, ObjectRepo.FirstShowXpath);
    }
public void clickOncolourBox() {
	
	Shared.clickOnColourBox(dr, ObjectRepo.ColourBoxxpath);
	
}

public void showsSize() {
	
	Shared.selectSize(dr.findElement(ObjectRepo.ShowsSizeXpath));
}

public void showsWidth() {
	
	Shared.selectSize(dr.findElement(ObjectRepo.ShowsWidthXpath));
}

public void addProductQuantityToCart() {
	
	if(Shared.getCartValue(dr.findElement(ObjectRepo.CartValueXpath), TestData.numberOfProductinTheCart)) {
	   System.out.println("There are Two Product in The Cart Value");	
	}
	else {
		System.out.println("There is no Product in The Cart Value");
	  }
}

	
public void addingProductToCart() {
	Shared.clickAddToCart(dr, ObjectRepo.cartXpath);
	
	
   }

}
