package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\User\\eclipse-workspace\\Main_Project\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");

		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		// load-property la value insert panna
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;

	}

	public String geturl() {
		String url = p.getProperty("url");

		return url;

	}
	public String getUsername() {
String username = p.getProperty("username");
		
		return username;
		
	}
	public String getPassword() {
String Password = p.getProperty("Password");
return Password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getccv() {
		String ccv = p.getProperty("ccv");
		return ccv;
	}

}
