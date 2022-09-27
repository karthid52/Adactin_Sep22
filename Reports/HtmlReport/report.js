$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "user Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;1"
    },
    {
      "cells": [
        "karthid",
        "12345"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;2"
    },
    {
      "cells": [
        "kartik3",
        "12345678"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;3"
    },
    {
      "cells": [
        "karthik322",
        "Q3M0P0"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "user Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"karthid\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"12345\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 7734084300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karthid",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 404874500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 153298100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 897239300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "user Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"kartik3\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"12345678\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 573038200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kartik3",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 393290600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 259599900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1065053200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "user Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"karthik322\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Q3M0P0\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 556648500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karthik322",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 231628800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Q3M0P0",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 168319400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1261233600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "user  Search The Hotel In Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user--search-the-hotel-in-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user Select The Location In Select Location Dropdown List",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotel In Select Hotels Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The Room Type In Select Room Type Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Number of Rooms In Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter The Check In Date In The Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter The Check Out Date In The Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The Adults Per Room In Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Children Per Room In Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click The Search Hotel Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Location_In_Select_Location_Dropdown_List()"
});
formatter.result({
  "duration": 519439700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_In_Select_Hotels_Dropdown_List()"
});
formatter.result({
  "duration": 430263800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Room_Type_In_Select_Room_Type_Dropdown_List()"
});
formatter.result({
  "duration": 359686300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_of_Rooms_In_Dropdown_List()"
});
formatter.result({
  "duration": 299977300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field()"
});
formatter.result({
  "duration": 728090900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 778143200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Adults_Per_Room_In_Dropdown_List()"
});
formatter.result({
  "duration": 679241300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Children_Per_Room_In_Dropdown_List()"
});
formatter.result({
  "duration": 627855800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Search_Hotel_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1838904100,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "user Select The Hotel In Select The Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel-in-select-the-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Click The Radio Button To Select The Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Click The Continue Button And Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Radio_Button_To_Select_The_Hotel()"
});
formatter.result({
  "duration": 213427200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Continue_Button_And_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 2106414100,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "user  Book A Hotel In Book Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user--book-a-hotel-in-book-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@regressionest"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user Enter The First Name  In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Last Name  In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Billing Address In Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Enter The Credit Card Number In The Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select The Credit Card Type In Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select The Expiry Date In Select Month And Select Year Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Ccv Number In Ccv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Click The Book Now Button And It Navigates To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 597318300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 296703000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Billing_Address_In_Address_Field()"
});
formatter.result({
  "duration": 338635500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Credit_Card_Number_In_The_Number_Field()"
});
formatter.result({
  "duration": 238442600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Credit_Card_Type_In_Dropdown_List()"
});
formatter.result({
  "duration": 429136200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Expiry_Date_In_Select_Month_And_Select_Year_Dropdown_List()"
});
formatter.result({
  "duration": 489119900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Ccv_Number_In_Ccv_Number_Field()"
});
formatter.result({
  "duration": 206741900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 176387300,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "user Get The Booking Confirmation",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-get-the-booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "user Get The Booking Confirmation And Take The Screenshot",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "user Click The Logout Button And It Navigates To Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Get_The_Booking_Confirmation_And_Take_The_Screenshot()"
});
formatter.result({
  "duration": 6905771400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Logout_Button_And_It_Navigates_To_Logout_Page()"
});
formatter.result({
  "duration": 853698300,
  "status": "passed"
});
});