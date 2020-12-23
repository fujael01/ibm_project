package com.bit.test;

import org.junit.Test;


import pages.CartCheckOutPage;
import pages.FindstorePage;
import pages.HomePage;
import pages.ShoesPage;
import pages.StorelistPage;
import pages.VerifyCheckOutButton;

public class SmokeTest extends BaseTest {
	
	//Go to www.jcpenny.com
	//Verify jcpenny logo displayed or not
	//MouseOver on Menu
	//Click On Junior and MouseOver on Back to School
	//Type Shoe and Click on Search Button 
	//Click on First Shoe on the Page
	//Select Black Colour of Shoe
	//Select Size of Shoe
	//Fixed Width of Shoe
	//Click Add to Cart
	//Click View Cart and CheckOut
	//Verify that The Checkout Button is Enabled or Not
	//Then Click on Checkout
	//Click on FindStore
    //Type Zipcode
	//Click on Arrow Sign
	//Click on FifteenMile
	//Click On Search
	//Count Store
	//Set My Store
    
	
	
	
	
	
	HomePage hp;
	ShoesPage sh;
	CartCheckOutPage cp;
	VerifyCheckOutButton vc;
	FindstorePage fp;
	StorelistPage sp;
	
	@Test
	public void findStoreByZipCode() {
		
		//call open browser
		hp=new HomePage(driver);
		hp.verifyHomePageTitle(driver);
		hp.verifyHomePagelogo(driver);
		hp.mouseOveronMenu();
		hp.clickOnJunior();
		hp.mouseOverOnBackToSchool();
		hp.clickOnStores();
		sh=new ShoesPage(driver);
		sh.clickOnFirstShow();
		sh.clickOncolourBox();
		sh.showsSize();
		sh.showsWidth();
		sh.addingProductToCart();
		cp=new CartCheckOutPage(driver);
		cp.clickViewCartAndCheckOutPage();
		vc=new VerifyCheckOutButton(driver);
		vc.CheckButtonVerify();
		vc.clickOnCheckOutButton();
		fp=new FindstorePage(driver);
		fp.typeZipCode();
		fp.clickOnArrowSign();
		fp.clickOnFifteenMile();
		fp.clickOnSearch();
		sp=new StorelistPage(driver);
		sp.countStore();
		sp.setMystore();
		
		
		@Test
		public void arrayHeatingNumber() {
			int a []= {6,6,4,76,45,3,3,3}; 
					
			
					
			
			
		}
		
		
		
		
		
	}

}
