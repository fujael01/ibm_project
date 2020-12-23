package Repojetory;

import org.openqa.selenium.By;

public class ObjectRepo {
	public static String HomePagelogo=("//a[@data-automation-id='jcp-logo']");
	public static By menu=By.xpath("//div[@id='flyoutMenuBlock']");
	public static By SearchButton=By.xpath("//input[@id='searchInputId']");
    public static By Junior=By.xpath("//div[text()='Juniors']");
    public static By BackToSchool=By.xpath("//iframe[@id='_mN_cksync_0']");
    public static By FirstShowXpath=By.xpath("//img[@class='_2Wcf6' and @title='Athletic Shoes']");
	public static By ColourBoxxpath=By.xpath("//button[@class='_3-u9M' and @style='background: url(\"https://s7d9.scene7.com/is/image/JCPenney/DP1208201617025269S?wid=35&hei=35&resmode=sharp2\");']");
	public static By ShowsSizeXpath=By.xpath("//select[@class='E-MJI fFHrW' and @ name='size']");
	public static By ShowsWidthXpath=By.xpath("//button[@class='gwoO1 _3YR5_ kkuXk']");
	public static By CartValueXpath=By.xpath("//div[@id='GlobalOptions-AddToCart']//button[@class='w-full flex items-center justify-center rounded-medium p-1 text-large _1MRAP bg-brand hover:bg-brand-accent focus:bg-brand-accent text-white-100 shadow-medium font-open-sans-semibold'and@type='button']");
	public static By cartXpath=By.xpath("//button[@class='w-full flex items-center justify-center rounded-medium p-1 text-large _1MRAP bg-brand hover:bg-brand-accent focus:bg-brand-accent text-white-100 shadow-medium font-open-sans-semibold']");
    public static By ViewCartcheckOutButtonxpath=By.xpath("//button[@data-automation-id='at-panel-checkout-button']");
    public static By ClickOnCheckOut=By.xpath("//span[@class='align-top inline-block mt-half']");
    public static By Storexpath=By.xpath("//div[@class='Header-hoverAction']");
	public static By SearchZipCode=By.xpath("//input[@id='find-store-input-field']");
	public static By Mile=By.xpath("//div[@data-automation-id='at-storedetailscard-number']");
	
	
}