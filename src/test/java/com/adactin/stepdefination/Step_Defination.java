package com.adactin.stepdefination;

import org.openqa.selenium.WebDriver;

import com.Main_Project.Base_Main;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defination extends Base_Main {

	public static WebDriver driver = Test_Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = FileReaderManager.getinstance().getInstanceCR().geturl();
		getUrl(url);
		Thread.sleep(7000);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String Username) throws Throwable {
		elementsendkey(pom.getInstanceLogin().getUsername(), Username);
		Thread.sleep(7000);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String Password) throws Throwable {
		elementsendkey(pom.getInstanceLogin().getPassword(), Password);
		Thread.sleep(7000);
	}

	@Then("^user CLick The Login Button And It Navigates To The Select Hotel Pages$")
	public void user_CLick_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_Pages() throws Throwable {
	
		clickonelement(pom.getInstanceLogin().getLogin());
		Thread.sleep(7000);
	}

	@When("^user Select The Location In  Select Location Page$")
	public void user_Select_The_Location_In_Select_Location_Page() throws Throwable {
		scroll(pom.getInstancesearch().getLocation(), "by value", "New York");
		scroll(pom.getInstancesearch().getHotel(), "by index", "2");
		scroll(pom.getInstancesearch().getRoomtyp(), "by index", "1");
		scroll(pom.getInstancesearch().getRoomno(), "by index", "2");
		elementsendkey(pom.getInstancesearch().getDate_in(), "14/06/2022");
		elementsendkey(pom.getInstancesearch().getDate_out(), "18/07/2022");
		scroll(pom.getInstancesearch().getAdult(), "by index", "1");
		scroll(pom.getInstancesearch().getChild(), "by index", "1");
	
	}

	@Then("^user Click The Search Button And Its Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_Its_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		clickonelement(pom.getInstancesearch().getSubmit_btn());
		Thread.sleep(10000);
	}

	@When("^user Select The Desire Hotel In The Select Hotel Page$")
	public void user_Select_The_Desire_Hotel_In_The_Select_Hotel_Page() throws Throwable {
		clickonelement(pom.getInstanceselect().getRadio());
		Thread.sleep(10000);
	}

	@Then("^user Click The Contiune Button And Its Navigate To The Book The Hotel Page$")
	public void user_Click_The_Contiune_Button_And_Its_Navigate_To_The_Book_The_Hotel_Page() throws Throwable {
		clickonelement(pom.getInstanceselect().getCont());
		Thread.sleep(10000);
	}

	@When("^user Enter Their Fast Name And Personal Details In Book Hotel Page$")
	public void user_Enter_Their_Fast_Name_And_Personal_Details_In_Book_Hotel_Page() throws Throwable {
		elementsendkey(pom.getInstancebook().getFname(), "chellamaaa");
		Thread.sleep(7000);
	}

	@When("^user Enter Their Last Name In Last Name Field$")
	public void user_Enter_Their_Last_Name_In_Last_Name_Field() throws Throwable {
		elementsendkey(pom.getInstancebook().getLname(), "manikandan");
		Thread.sleep(7000);
	}

	@When("^user Enter Their Billing Address In Billing Address Field$")
	public void user_Enter_Their_Billing_Address_In_Billing_Address_Field() throws Throwable {
		elementsendkey(pom.getInstancebook().getAddres(), "abc street");
		Thread.sleep(7000);
	}

	@When("^user Enter Their Credit Card No In That Particular Field$")
	public void user_Enter_Their_Credit_Card_No_In_That_Particular_Field() throws Throwable {
		elementsendkey(pom.getInstancebook().getCcnum(), "1234567890123421");
		Thread.sleep(7000);
	}

	@When("^user Enter Their Credit Card Type In That ParticularField$")
	public void user_Enter_Their_Credit_Card_Type_In_That_ParticularField() throws Throwable {
		scroll(pom.getInstancebook().getCtype(), "by index", "2");
		Thread.sleep(7000);
	}

	@When("^user Enter Their Expiry Date In That Particular Field$")
	public void user_Enter_Their_Expiry_Date_In_That_Particular_Field() throws Throwable {
		scroll(pom.getInstancebook().getExpdate(), "by index", "3");
		Thread.sleep(7000);
	}

	@When("^user Enter Their Expiry Year In That Particular Field$")
	public void user_Enter_Their_Expiry_Year_In_That_Particular_Field() throws Throwable {
		scroll(pom.getInstancebook().getExpyear(), "by index", "5");
		Thread.sleep(7000);
	}

	@When("^user Enter Their Cvv Number In That Particular Field$")
	public void user_Enter_Their_Cvv_Number_In_That_Particular_Field() throws Throwable {
		elementsendkey(pom.getInstancebook().getCvv(), "765");
		Thread.sleep(7000);
	}

	@Then("^user Click The Book Now Button And It Navigate In Booking Conformation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigate_In_Booking_Conformation_Page() throws Throwable {
		clickonelement(pom.getInstancebook().getBooknow());
		Thread.sleep(7000);
	}

	@Then("^user Click The My Iternity Button And Its Navigates In Book Iternity Page$")
	public void user_Click_The_My_Iternity_Button_And_Its_Navigates_In_Book_Iternity_Page() throws Throwable {
		clickonelement(pom.getInstanceconform().getItinerary());
		Thread.sleep(7000);
	}

	@Then("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
		clickonelement(pom.getInstancefinl().getLogout());

	}

}
