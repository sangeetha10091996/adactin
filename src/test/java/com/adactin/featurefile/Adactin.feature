Feature: Hotel Bookin In Adactin Application 

@Smoketest
Scenario Outline: User Login The Application

	Given user Launch The Application 
	
	When user Enter The "<Username>" In Username Field 
	
	And user Enter The "<Password>" In Password Field 
	
	Then user CLick The Login Button And It Navigates To The Select Hotel Pages 
	
	
	Examples: 
		|Username|Password|
		|aaa|423|
		|fff|7654|
		|geethuganesah|kS@@KhjJie5F8dr|
		
@Sanitytest 		
Scenario: User Search The Details 

	When user Select The Location In  Select Location Page 
	
	Then user Click The Search Button And Its Navigates To The Select Hotel Page
@Sanitytest  
Scenario: User Select The Desire Hotel

	When user Select The Desire Hotel In The Select Hotel Page 
	
	Then user Click The Contiune Button And Its Navigate To The Book The Hotel Page 
	
	
@Sanitytest	
Scenario: User Billing Details And Conform The Room

	When user Enter Their Fast Name And Personal Details In Book Hotel Page
	 
	And user Enter Their Last Name In Last Name Field
	
	And user Enter Their Billing Address In Billing Address Field
	
	And user Enter Their Credit Card No In That Particular Field
	
	And user Enter Their Credit Card Type In That ParticularField
	
	And user Enter Their Expiry Date In That Particular Field
	
	And user Enter Their Expiry Year In That Particular Field
	
	And user Enter Their Cvv Number In That Particular Field
	
	Then user Click The Book Now Button And It Navigate In Booking Conformation Page 
@Sanitytest
Scenario: User My Iternity Button
    	
    Then user Click The My Iternity Button And Its Navigates In Book Iternity Page 
@Regressiontest	
Scenario: User Logout Their Account
	
	Then user Click The Logout Button 
	
	
	
	
