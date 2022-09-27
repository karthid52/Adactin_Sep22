package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String Type) {
		if (Type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					".\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String Url) {
		driver.get(Url);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void waitforAlertISPresent() {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 50);
			wb.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void confirmAlert() {
		driver.switchTo().alert().accept();
	}

	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();

	}

	public static void promptAlert(String options, String values) {
		
			waitforAlertISPresent();
			Alert alert = driver.switchTo().alert();
			if (options.equalsIgnoreCase("confirm")) {
				alert.sendKeys(values);
				alert.accept();

			} else if (options.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}
	}

	public static void dropDown(WebElement element, String type, String value) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("selectByValue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("selectByIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("selectByVisibleText")) {
			s.selectByVisibleText(value);
		}
	}

	// Action class Methods:
	public static void getActionsMethods(WebElement element, String action) {
		Actions a = new Actions(driver);
		if (action.equalsIgnoreCase("rightClick")) {
			a.contextClick(element).build().perform();
		}

		else if (action.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		} else if (action.equalsIgnoreCase("moveToElement")) {
			a.moveToElement(element).build().perform();
		}

		else if (action.equalsIgnoreCase("doubleClick")) {
			a.doubleClick(element).build().perform();

		}
	}

	public static void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchToDefault() {
		driver.switchTo().defaultContent();
	}

	public static void robotActions(String action) throws AWTException {
		Robot b = new Robot();
		if (action.equalsIgnoreCase("toEnter")) {
			b.keyPress(KeyEvent.VK_ENTER);
			b.keyRelease(KeyEvent.VK_ENTER);
		} else if (action.equalsIgnoreCase("toDown")) {
			b.keyPress(KeyEvent.VK_DOWN);
			b.keyRelease(KeyEvent.VK_DOWN);
		}
	}

	public static String getWindowHandle() {
		String id = driver.getWindowHandle();
		return id;
	}

	public static Set<String> getWindowHandles() {
		Set<String> ids = driver.getWindowHandles();
		return ids;
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String getAttribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		return attribute;
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void sendValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static List<WebElement> getOptions(WebElement element) {
		Select a = new Select(element);
		List<WebElement> options = a.getOptions();
		return options;
	}

	public static List<WebElement> getAllSelectedOptions(WebElement element) {
		Select a = new Select(element);
		List<WebElement> options = a.getAllSelectedOptions();
		return options;

	}

	public static WebElement getFirstSelectedOption(WebElement element) {
		Select a = new Select(element);
		WebElement aa = a.getFirstSelectedOption();
		return aa;
	}

	public static boolean isMultiple(WebElement element) {
		Select a = new Select(element);
		boolean boo = a.isMultiple();
		return boo;
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static WebDriver close() {
		driver.close();
		return driver;
	}

	public static WebDriver quit() {

		driver.quit();
		return driver;

	}

	public static void takesScreenshot(String fileName) throws IOException {

		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\screenShot\\" + fileName + ".png");
		FileHandler.copy(source, destination);

	}

	public static boolean isEnabled(WebElement element) {
		boolean is = element.isEnabled();
		return is;
	}

	public static boolean isDisplayed(WebElement element) {
		boolean is = element.isDisplayed();
		return is;
	}

	public static boolean isSelected(WebElement element) {
		boolean is = element.isSelected();
		return is;
	}

	public static void radioButton(WebElement element) {
		element.click();
	}

	public void checkBox(WebElement element) {
		element.click();

	}

	public static void scrollOnElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void waitforElementVisiblity(WebElement element, int seconds) {

		WebDriverWait wb = new WebDriverWait(driver, seconds);
		wb.until(ExpectedConditions.visibilityOf(element));

	}

	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

}
