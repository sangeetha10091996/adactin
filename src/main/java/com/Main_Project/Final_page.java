package com.Main_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_page {
	public WebDriver driver;
	public Final_page(WebDriver driver2) {
		this.driver=driver2;
				
				PageFactory.initElements(driver, this);
				
				
			
			
			}
	
	
	
	@FindBy(id="logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
