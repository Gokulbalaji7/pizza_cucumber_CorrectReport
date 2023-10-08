package baseclasspizza;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclasspizza {

	
	
		// driver
			public static WebDriver driver;

			// launch
			public static WebDriver launch() {
				//below is new version

				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-Origins=*");
	WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver(option);

				// before is new version
				
				
				
				
				
				
				
				//EdgeOptions option = new EdgeOptions();
				//option.addArguments("--remote-allow-Origins=*");
			    //driver = new EdgeDriver(option);
			    
			    

				return driver; // we should type return

			}

			// url
			public static void url(String url) {
				driver.get(url);
			}

			// sendkeys

			public static void sendkeyss(WebElement element, String name) {

				element.sendKeys(name);
			}

			// buttonclick
			public static void buttonclick(WebElement element) {

				element.click();
				
			}
			// userid

			public static void userid(WebElement element, String name) {

				element.sendKeys(name);
			}

			// password

			public static void passw(WebElement elements, String name) {

				elements.sendKeys(name);
			}

			// dropdown select

			public static void selectbyvalue(WebElement element, String name) {

				Select s1 = new Select(element);
				s1.selectByValue(name);
			}


			public static void selectbyindex(WebElement element, int name) {

				Select s2 = new Select(element);
				s2.selectByIndex(name);
			}

			public static void selectbyvisibletext(WebElement element, String name) {

				Select s3 = new Select(element);
				s3.selectByVisibleText(name);
			}

			// deselect

			public static void deselectbyvalue(WebElement element, String name) {

				Select s4 = new Select(element);
				s4.deselectByValue(name);
			}



			// click mouse action

			public static void click(WebElement element) {

				Actions a = new Actions(driver);
				a.click(element).build().perform();
			}

			// move to element mouse action

			public static void movetoelement(WebElement element) {
				Actions obj = new Actions(driver);
				obj.moveToElement(element).perform();
			}

			// drag and drop mouse action

			public static void draganddrop(WebElement from , WebElement to ) {
				Actions obj = new Actions(driver);
				obj.dragAndDrop(from,to).perform();
			}

			// doubleclick mouse action

			public static void doubleclick() {
				Actions obj = new Actions(driver);
				obj.doubleClick().perform();
			}


			// scrolldown mouse action

			public void scrolldownmouse() throws Throwable {
				Actions act1 = new Actions(driver);
				act1.sendKeys(Keys.PAGE_DOWN).build().perform();
				Thread.sleep(3000);
			}

			// scrollup mouse action

			public void scrollupmouse() throws Throwable {
				Actions act1 = new Actions(driver);
				act1.sendKeys(Keys.PAGE_UP).build().perform();
				Thread.sleep(3000);
			}


			// robotkeyboard up

			public static void keypress_up() throws Throwable {
				Robot rob = new Robot();
				rob.keyPress(KeyEvent.VK_UP);
				rob.keyRelease(KeyEvent.VK_UP);
			}

			// robotkeyboard down

			public static void robotkeyboard() throws Throwable {

				Robot ro = new Robot();

				ro.keyPress(KeyEvent.VK_DOWN);
				ro.keyRelease(KeyEvent.VK_DOWN);
			}

			// robotkeyboard enter

			public static void keypress_enter() throws Throwable {
				Robot robo = new Robot();
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);
			}



			// screenshot in syntax folderlocation type must    anyname.png after location in end.

			public static void screenshot(String folderlocationthenaddlastdoubleslashnamedotpng) throws IOException, Throwable {

				TakesScreenshot ts = (TakesScreenshot) driver;
				File sourcefilee = ts.getScreenshotAs(OutputType.FILE);
				File designationn = new File(folderlocationthenaddlastdoubleslashnamedotpng);
				Thread.sleep(2000);
				
//				FileUtils.copyFile(sourcefilee, designationn);
				

//				above line or below line any one give , 
		// if above line given means we add commons io jar file in referenced libraries
		// if below line given means we cannot add any jar files referenced libraries just give this line it is easy to take screenshot	
				
				org.openqa.selenium.io.FileHandler.copy(sourcefilee, designationn);
				
			}

			// waits

			public static void waits() {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			}

			// alert accept

			public static void alertaccept() {

				driver.switchTo().alert().accept();
			}

			// alert dismiss

			public static void alertdismiss() {

				driver.switchTo().alert().dismiss();
			}

			// send alert

			public static void sendalert(String s) {
				Alert obj = driver.switchTo().alert();
				obj.sendKeys(s);	
			}

			//frame

			public static void indexframe(int i) {
				driver.switchTo().frame(i);
			}
			public static void nameframe(String name) {
				driver.switchTo().frame(name);
			}
			public static void Webelement( WebElement web) {
				driver.switchTo().frame(web);
			}

			//javascriptexecutor

			public static void scrolldown() {
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("Window.ScrollBy(0,1000)");
			}
			public static void scrollup() {
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("Window.ScrollBy(0.-5000");
			}
			public static void jsclick(WebElement element) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("argument[Webelement name].jsclick();", element);
			}
			public static void scrollintoview( WebElement element) {
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("arguments[Webelement element].scrollIntoView();", element);
			}


			// send keys input
			public static void sendInput(WebElement element,String input) {
				element.sendKeys(input);
			}
			// click	
			public static void clickbutton(WebElement element) {
				element.click();
			}
			// clear
			public static void clear(WebElement element) {

				element.clear();
			}

			// web element methods

			public static void maximize() {
				driver.manage().window().maximize();
			}

			public static void fullscreen() {
				driver.manage().window().fullscreen();
			}

			public static void close() {
				driver.close();
			}
			public static void quit() {
				driver.quit();
			}



			// web element locators

			public static void id(WebElement element,String input) {
				element =driver.findElement(By.id(input));
			}
			public static void name(WebElement element,String input) {
				element =driver.findElement(By.name(input));

			}
			public static void classname(WebElement element,String input) {
				element =driver.findElement(By.className(input));
			}
			public static void xpath(WebElement element,String input) {
				element =driver.findElement(By.xpath(input));
			}
			public static void linktext(WebElement element,String input) {
				element =driver.findElement(By.linkText(input));
			}
			public static void partiallinktext(WebElement element,String input) {
				element =driver.findElement(By.partialLinkText(input));
			}
			public static void tagname(List<WebElement> element,String input) {
				element =driver.findElements(By.tagName(input));
			}

			//window handling

			public static void windowhandle() {
				String parent = driver.getWindowHandle();
				Set<String>  allwindow = driver.getWindowHandles();
				for(String newwindowmessge : allwindow ) {
					if(!(parent.equals(allwindow))) {
						driver.switchTo().window(newwindowmessge);
					}
				}

			




	}

	
	
	
	
	
	
	
	
}
