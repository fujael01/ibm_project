package utilityPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Shared {
	
	public static boolean verifyTitle(WebDriver dr,String text) {
		
	    return dr.getTitle().equals(text);
		
	}
   
    
	
	public static boolean isElementPresent(WebDriver dr,By x) {
		
		return dr.findElement(x).isDisplayed();	
			
	}
	
    public static boolean VerifyElementPresent(WebElement ele) {
		
		return ele.isDisplayed();	
			
	}
	
	public static void hoverOver(WebDriver dr,By x) {
		Actions a = new Actions(dr);
		a.moveToElement(dr.findElement(x)).perform();
		
	}
	
    public static void typeOnSearchBox(WebDriver dr,By x,String text) {
    	
    	dr.findElement(x).sendKeys(text);
    }
		
		
	
	public static void type(WebElement ele,String text) {
		
		ele.clear();
		ele.sendKeys(text);
	}
	
    
    public static void clickOnJuniorPage(WebDriver dr,By x) {
    	dr.findElement(x).click();
    }
    
    
		
    public static void clickOnFirstShow(WebDriver dr,By x) {
    	dr.findElement(x).click();
    }
    
     
    public static void clickOnColourBox(WebDriver dr,By x) {
    	dr.findElement(x).click();
    }
    
    public static void clickAddToCart(WebDriver dr,By x) {
    	dr.findElement(x).click();
    }
			
			 
	
    public static void click(WebElement ele) {
		ele.click();
		ele.clear();
		
    }
    
    public static void clickOnElement(List<WebElement> ele,int index) {
		ele.get(index).click();
		
	}
    
    
    
    public static WebElement anyActionOnElement(List<WebElement> ele,int index) {
		return ele.get(index);
		
		
    }
    
    public void clickMenuBasedOnUserInput(List<WebElement> elements,String expectedValue) {
    	
    	for(WebElement element:elements)
    	{
    		if(element.getText().equals(expectedValue))
    		{
    	         element.click();
    	         break;	
        }
    		else
    	    {
    			System.out.println("Text does not Match");
    	    }
    	}
    }
    	

    public static void click(WebDriver dr,By x) {
    	dr.findElement(x).click();
		
		
    }
    
  
    
    public static void selectColour(WebElement ele) {
    	
    	ele.click();
    }
  
    public static void selectSize(WebElement ele) {
    	
    	ele.click();
    }
    
    public static boolean getCartValue(WebElement ele,String exValue) {
		
		return ele.getText().Integer.parseInt();
		
    }
    
    public static int getCartValueFromElement(WebElement ele,String exValue) {
		
		return ele.Integer.parseInt("exValue");
		
    }
		
		
		
    public static void clickOnCheckOut(WebElement ele) {
    	
    	ele.click();
		
		
		
    	
   }
		
    
    
    public static int couneElement(List<WebElement> elements) {
		
	   return elements.size();
		
    }
    
    public static boolean getTextFromelement(WebDriver dr,By x,String exValue) {
   
    	return dr.findElement(x).getText().equals(exValue);
    }
 
    public static void couneElement(List<WebElement> elements,int i) { 
	
	elements.get(i).click();
	
    }
    public static String getCountElement(List<WebElement> elements,int i,String text) {
    	
    	return elements.get(i).getText();
    }
    public static boolean verifyCheckOut(WebElement ele,String text) {
		
	    return ele.getText().equals(text);
    }
	    
	   
	
		
}
   
    
   
  
  
   

	
		
    


