package com.Main_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	public WebDriver driver;
	@FindBy(name="location")
	private WebElement location;
	@FindBy(name="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomtyp;
	@FindBy (id="room_nos")
	private WebElement roomno;
	@FindBy(name="datepick_in")
	private WebElement date_in;
	@FindBy(name="datepick_out")
	private WebElement date_out;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy (name="child_room")
	private WebElement child;
	@FindBy(name="Submit")
	private WebElement submit_btn;
	public Search_hotel(WebDriver driver2) 
	{
		
this.driver=driver2;
	
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtyp() {
		return roomtyp;
	}
	public WebElement getRoomno() {
		return roomno;
	}
	public WebElement getDate_in() {
		return date_in;
	}
	public WebElement getDate_out() {
		return date_out;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSubmit_btn() {
		return submit_btn;
	}
	
	
	
	
	

}
