package com.Main_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conformation {
	public WebDriver driver;
	@FindBy(name="my_itinerary")
	private WebElement itinerary;

	public Conformation(WebDriver driver2) {
this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary() {
		return itinerary;
	}
	
}
