$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Bookin In Adactin Application",
  "description": "",
  "id": "hotel-bookin-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Login The Application",
  "description": "",
  "id": "hotel-bookin-in-adactin-application;user-login-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user CLick The Login Button And It Navigates To The Select Hotel Pages",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "hotel-bookin-in-adactin-application;user-login-the-application;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 16,
      "id": "hotel-bookin-in-adactin-application;user-login-the-application;;1"
    },
    {
      "cells": [
        "aaa",
        "423"
      ],
      "line": 17,
      "id": "hotel-bookin-in-adactin-application;user-login-the-application;;2"
    },
    {
      "cells": [
        "fff",
        "7654"
      ],
      "line": 18,
      "id": "hotel-bookin-in-adactin-application;user-login-the-application;;3"
    },
    {
      "cells": [
        "geethuganesah",
        "kS@@KhjJie5F8dr"
      ],
      "line": 19,
      "id": "hotel-bookin-in-adactin-application;user-login-the-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "User Login The Application",
  "description": "",
  "id": "hotel-bookin-in-adactin-application;user-login-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"aaa\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Enter The \"423\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user CLick The Login Button And It Navigates To The Select Hotel Pages",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Launch_The_Application()"
});
formatter.result({
  "duration": 31883430099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aaa",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 11448874500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "423",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 7459936700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_CLick_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_Pages()"
});
formatter.result({
  "duration": 12116468000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User Login The Application",
  "description": "",
  "id": "hotel-bookin-in-adactin-application;user-login-the-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"fff\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Enter The \"7654\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user CLick The Login Button And It Navigates To The Select Hotel Pages",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Launch_The_Application()"
});
formatter.result({
  "duration": 8214557900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fff",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 7255213400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7654",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 7272556100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_CLick_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_Pages()"
});
formatter.result({
  "duration": 8008778300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User Login The Application",
  "description": "",
  "id": "hotel-bookin-in-adactin-application;user-login-the-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"geethuganesah\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user Enter The \"kS@@KhjJie5F8dr\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user CLick The Login Button And It Navigates To The Select Hotel Pages",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Launch_The_Application()"
});
formatter.result({
  "duration": 8248000000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "geethuganesah",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 7408543601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kS@@KhjJie5F8dr",
      "offset": 16
    }
  ],
  "location": "Step_Defination.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 7290254100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_CLick_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_Pages()"
});
formatter.result({
  "duration": 11379308400,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User Search The Details",
  "description": "",
  "id": "hotel-bookin-in-adactin-application;user-search-the-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user Select The Location In  Select Location Page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user Click The Search Button And Its Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Select_The_Location_In_Select_Location_Page()"
});
formatter.result({
  "duration": 6023861599,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_The_Search_Button_And_Its_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 12096948599,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User Select The Desire Hotel",
  "description": "",
  "id": "hotel-bookin-in-adactin-application;user-select-the-desire-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Select The Desire Hotel In The Select Hotel Page",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user Click The Contiune Button And Its Navigate To The Book The Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Select_The_Desire_Hotel_In_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 10118481599,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_The_Contiune_Button_And_Its_Navigate_To_The_Book_The_Hotel_Page()"
});
formatter.result({
  "duration": 11658882100,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "User Billing Details And Conform The Room",
  "description": "",
  "id": "hotel-bookin-in-adactin-application;user-billing-details-and-conform-the-room",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "user Enter Their Fast Name And Personal Details In Book Hotel Page",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user Enter Their Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enter Their Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Enter Their Credit Card No In That Particular Field",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Enter Their Credit Card Type In That ParticularField",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user Enter Their Expiry Date In That Particular Field",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user Enter Their Expiry Year In That Particular Field",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "user Enter Their Cvv Number In That Particular Field",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "user Click The Book Now Button And It Navigate In Booking Conformation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Enter_Their_Fast_Name_And_Personal_Details_In_Book_Hotel_Page()"
});
formatter.result({
  "duration": 9172307100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_Their_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 7190694500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_Their_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 7340112600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_Their_Credit_Card_No_In_That_Particular_Field()"
});
formatter.result({
  "duration": 7355931700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_Their_Credit_Card_Type_In_That_ParticularField()"
});
formatter.result({
  "duration": 7246677100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_Their_Expiry_Date_In_That_Particular_Field()"
});
formatter.result({
  "duration": 7259539100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_Their_Expiry_Year_In_That_Particular_Field()"
});
formatter.result({
  "duration": 7310407400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Enter_Their_Cvv_Number_In_That_Particular_Field()"
});
formatter.result({
  "duration": 7189595301,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defination.user_Click_The_Book_Now_Button_And_It_Navigate_In_Booking_Conformation_Page()"
});
formatter.result({
  "duration": 7334578600,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "User My Iternity Button",
  "description": "",
  "id": "hotel-bookin-in-adactin-application;user-my-iternity-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 55,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 58,
  "name": "user Click The My Iternity Button And Its Navigates In Book Iternity Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Click_The_My_Iternity_Button_And_Its_Navigates_In_Book_Iternity_Page()"
});
formatter.result({
  "duration": 8973453100,
  "status": "passed"
});
formatter.scenario({
  "line": 60,
  "name": "User Logout Their Account",
  "description": "",
  "id": "hotel-bookin-in-adactin-application;user-logout-their-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 59,
      "name": "@Regressiontest"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "user Click The Logout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defination.user_Click_The_Logout_Button()"
});
formatter.result({
  "duration": 1094022899,
  "status": "passed"
});
});