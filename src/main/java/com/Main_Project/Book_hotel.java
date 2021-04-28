package com.Main_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
	public WebDriver driver;
	 @FindBy (name="hotel_name_dis")
	 private WebElement hotelname;
	 
	@FindBy(name="location_dis")
	 private WebElement locat;
	 @FindBy(name="room_type_dis")
	 private WebElement roomty;
	 @FindBy(name="room_num_dis")
	 private WebElement roomnum;
	 @FindBy(name="total_days_dis")
	 private WebElement totdays;
	 @FindBy(name="price_night_dis")
	 private WebElement night;
	 @FindBy(name="total_price_dis")
	 private WebElement price;
	 @FindBy(name="gst_dis")
	 private WebElement gst;
	 @FindBy(name="final_price_dis")
	 private WebElement fprice;
	 @FindBy(name="first_name")
	 private WebElement fname;
	 @FindBy(name="last_name")
	 private WebElement lname;
	 @FindBy(name="address")
	 private WebElement addres;
	 @FindBy(name="cc_num")
	 private WebElement ccnum;
	 @FindBy(name="cc_type")
	 private WebElement ctype;
	 @FindBy(name="cc_exp_month")
	 private WebElement expdate;
	 @FindBy(name="cc_exp_year")
	 private WebElement expyear;
	 @FindBy(xpath="//input[@name='cc_cvv']")
	 private WebElement cvv;
	 @FindBy(name="book_now")
	 private WebElement booknow;
	public Book_hotel(WebDriver driver2) {
this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	
	
	
	
	}
	public WebElement getHotelname() {
		return hotelname;
	}
	public WebElement getLocat() {
		return locat;
	}
	public WebElement getRoomty() {
		return roomty;
	}
	public WebElement getRoomnum() {
		return roomnum;
	}
	public WebElement getTotdays() {
		return totdays;
	}
	public WebElement getNight() {
		return night;
	}
	public WebElement getPrice() {
		return price;
	}
	public WebElement getGst() {
		return gst;
	}
	public WebElement getFprice() {
		return fprice;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddres() {
		return addres;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCtype() {
		return ctype;
	}
	public WebElement getExpdate() {
		return expdate;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	     
	 
	 
	 
	 
	 
}
