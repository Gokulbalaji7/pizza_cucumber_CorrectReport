package pomclasspizza;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclasspizza.Baseclasspizza;

public class Pomclasspizza1 extends Baseclasspizza {

	public Pomclasspizza1() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Collect From Store']")
	public WebElement collectfs;

	@FindBy(xpath = "//span[text()='Collect From Store']")
	public WebElement locationn;

	@FindBy(xpath = "//input[@placeholder ='Enter your collection location']")
	public WebElement Eyc;

	@FindBy(xpath = "//span[text()= 'Order']")
	public WebElement Order;

	@FindBy(xpath = "(//span[text()='Pizzas'])[2]")
	public WebElement pizzas;

	@FindBy(xpath = "(//div[text()='Schezwan Margherita'])[1]")
	public WebElement Schezwan;

	@FindBy(xpath = "(//div[text()='San Francisco Style'])[1]")
	public WebElement San;
	
	@FindBy(xpath = "//span[text()='Add to my basket']")
	public WebElement addbasket;
	
	@FindBy(xpath = "//span[text()='Checkout']")
	public WebElement checkout;
	
	@FindBy(id = "checkout__name")
	public WebElement inputmyname;
	
	
}
