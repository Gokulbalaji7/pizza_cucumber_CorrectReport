package stepdefinition;

import java.io.IOException;

import baseclasspizza.Baseclasspizza;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pomclasspizza.Pomclasspizza1;

public class stepdefpizza extends Baseclasspizza {

	public Pomclasspizza1 pompizza;

	@Given("user launches the url")
	public void user_launches_the_url() throws Throwable {
		chromedriverlaunch();
		url("https://www.pizzahut.co.in");
		maximize();
		Thread.sleep(2000);

	}

	@Given("click the collect from store button")
	public void click_the_collect_from_store_button() throws InterruptedException {
		pompizza = new Pomclasspizza1();
		Thread.sleep(5000);
	}

	@Given("enter your collected location")
	public void enter_your_collected_location() throws Throwable {
		buttonclick(pompizza.locationn);
		Thread.sleep(2000);
		sendkeyss(pompizza.Eyc, "phoenix market city chennai");
		Thread.sleep(3000);
		keypress_enter();
		Thread.sleep(3000);
	}

	@Given("click the order button")
	public void click_the_order_button() throws InterruptedException {
		buttonclick(pompizza.Order);
	}

	@Then("click the pizza button")
	public void click_the_pizza_button() throws InterruptedException {
		Thread.sleep(5000);
		buttonclick(pompizza.pizzas);
	}

	@Then("click the Schezwan Margherita button")
	public void click_the_schezwan_margherita_button() throws InterruptedException {
		Thread.sleep(3000);
		buttonclick(pompizza.Schezwan);
	}

	@Then("click San Francisco style button")
	public void click_san_francisco_style_button() throws InterruptedException {
		Thread.sleep(4000);
		buttonclick(pompizza.San);
	}

	@Then("click add to basket and checkout button")
	public void click_add_to_basket_and_checkout_button() throws IOException, Throwable {
		Thread.sleep(4000);
		click(pompizza.addbasket);
		Thread.sleep(2000);
		click(pompizza.checkout);
		Thread.sleep(2000);
		sendkeyss(pompizza.inputmyname, "Gokul R");
		screenshott("C:\\Users\\gokul\\eclipse-workspace\\Pizza.cucuber_report\\screenshott\\pizzacheckout.png");
	}

}
