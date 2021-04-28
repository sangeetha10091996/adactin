package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Main_Project.Book_hotel;
import com.Main_Project.Conformation;
import com.Main_Project.Final_page;
import com.Main_Project.Login_Page;
import com.Main_Project.Search_hotel;
import com.Main_Project.Select_hotel;

public class PageObjectManager {
	public static WebDriver driver;

	private Login_Page login;
	private Search_hotel search;
	private Select_hotel select;
	private Book_hotel book;
	private Conformation conform;
	private Final_page finl;
	
public PageObjectManager(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
			}

	public Login_Page getInstanceLogin() {
		login = new Login_Page(driver);
		return login;
	}
	
 	public Search_hotel getInstancesearch() {
 		search=new Search_hotel(driver);
 		return search;

	}
 	public Select_hotel getInstanceselect() {
      select=new Select_hotel(driver);
      return select;
	}
 	
 	public Book_hotel getInstancebook() {
book=new Book_hotel(driver);
return book;
 		
	}
 	public Conformation getInstanceconform() {
conform=new Conformation(driver);
return conform;
	}
 	public Final_page getInstancefinl() {
finl=new Final_page(driver);
return finl;
	}
 	
 	
 	
 	
 	
	
	

	
	
	
	
	
	
	
	
	
	

}
