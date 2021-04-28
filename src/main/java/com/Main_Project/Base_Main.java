package com.Main_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Main {
	
	public static WebDriver driver;

	public static WebDriver getBrowser(String Type) {

		// Using browser launch

		if (Type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (Type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");

			driver = new FirefoxDriver();

		}

		else if (Type.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\driver\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();

		return driver;
	}
	
	public static void close() {
		driver.close();

	}

	public static void clickonelement(WebElement element) {
		element.click();

	} 	

	public static void getUrl(String Url) {
		driver.get(Url);
	}

	
	
	
	public static void elementsendkey(WebElement element, String value) {
		element.sendKeys(value);

	}
	public static void scroll(WebElement element, String type, String value) {
		Select sc = new Select(element);
		if (type.equalsIgnoreCase("by value")) {
			sc.selectByValue(value);

		} else if (type.equalsIgnoreCase("by index")) {
			int index = Integer.parseInt(value);
			sc.selectByIndex(index);
			;
		} else if (type.equalsIgnoreCase("by visible text")) {
			sc.selectByVisibleText(value);
		}

	}

}
