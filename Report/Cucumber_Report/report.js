$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/org/feature_file/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page",
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
  "line": 6,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click The Login Button To Navigate The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;",
  "rows": [
    {
      "cells": [
        "Username",
        "password"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login-page;;1"
    },
    {
      "cells": [
        "Test1",
        "pass1"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login-page;;2"
    },
    {
      "cells": [
        "Test2",
        "pass2"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;login-page;;3"
    },
    {
      "cells": [
        "jagadeesh007",
        "Jaga@007"
      ],
      "line": 16,
      "id": "hotel-booking-in-adactin-application;login-page;;4"
    },
    {
      "cells": [
        "vinilakumar",
        "vinila@123"
      ],
      "line": 17,
      "id": "hotel-booking-in-adactin-application;login-page;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 58718000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;2",
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
  "line": 6,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Test1\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"pass1\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click The Login Button To Navigate The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Setp_Definition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 12323696100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test1",
      "offset": 16
    }
  ],
  "location": "Setp_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 2457488300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass1",
      "offset": 16
    }
  ],
  "location": "Setp_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 1356285800,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Click_The_Login_Button_To_Navigate_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 6736123700,
  "status": "passed"
});
formatter.after({
  "duration": 368400,
  "status": "passed"
});
formatter.before({
  "duration": 255600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;3",
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
  "line": 6,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Test2\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"pass2\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click The Login Button To Navigate The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Setp_Definition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 1162350000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test2",
      "offset": 16
    }
  ],
  "location": "Setp_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 697667700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass2",
      "offset": 16
    }
  ],
  "location": "Setp_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 522492700,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Click_The_Login_Button_To_Navigate_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 4342642900,
  "status": "passed"
});
formatter.after({
  "duration": 282600,
  "status": "passed"
});
formatter.before({
  "duration": 177500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;4",
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
  "line": 6,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"jagadeesh007\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"Jaga@007\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click The Login Button To Navigate The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Setp_Definition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 1365306200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jagadeesh007",
      "offset": 16
    }
  ],
  "location": "Setp_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 555625500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jaga@007",
      "offset": 16
    }
  ],
  "location": "Setp_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 666825700,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Click_The_Login_Button_To_Navigate_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 7736356000,
  "status": "passed"
});
formatter.after({
  "duration": 137800,
  "status": "passed"
});
formatter.before({
  "duration": 192900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;5",
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
  "line": 6,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"vinilakumar\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"vinila@123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click The Login Button To Navigate The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Setp_Definition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 1419163500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinilakumar",
      "offset": 16
    }
  ],
  "location": "Setp_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 800135600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinila@123",
      "offset": 16
    }
  ],
  "location": "Setp_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 610168900,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Click_The_Login_Button_To_Navigate_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 4773408800,
  "status": "passed"
});
formatter.after({
  "duration": 179400,
  "status": "passed"
});
formatter.before({
  "duration": 247600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user Select The Hotel \"New York\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user Select The \"Hotel Sunshine\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Enter The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Enter The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Select The Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Select The Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Click The Search Button To Navigate The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 23
    }
  ],
  "location": "Setp_Definition.user_Select_The_Hotel(String)"
});
formatter.result({
  "duration": 914205100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 17
    }
  ],
  "location": "Setp_Definition.user_Select_The(String)"
});
formatter.result({
  "duration": 504149400,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 341377000,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 383917200,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Enter_The_Check_In_Date()"
});
formatter.result({
  "duration": 212346700,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Enter_The_Check_Out_Date()"
});
formatter.result({
  "duration": 319196100,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Select_The_Adults_Per_Room()"
});
formatter.result({
  "duration": 485503300,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Select_The_Children_Per_Room()"
});
formatter.result({
  "duration": 336925300,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Click_The_Search_Button_To_Navigate_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 4709495200,
  "status": "passed"
});
formatter.after({
  "duration": 172400,
  "status": "passed"
});
formatter.before({
  "duration": 150100,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "user Click To Select The Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user Click The Continue Button To Navigate The BooK Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Setp_Definition.user_Click_To_Select_The_Hotel()"
});
formatter.result({
  "duration": 889079400,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Click_The_Continue_Button_To_Navigate_The_BooK_Hotel()"
});
formatter.result({
  "duration": 3635865900,
  "status": "passed"
});
formatter.after({
  "duration": 163900,
  "status": "passed"
});
formatter.before({
  "duration": 242400,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Book Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "user Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "user Enter The Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Enter The Address In Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Enter The Credit Card No IN Credit Card Field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Select The Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Select The Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user Select The Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user Enter The Cvv Number In Cvv Field",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user Click The Book Now Button To Navigate The Booking Confirm Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Setp_Definition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 597123700,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 233108400,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Enter_The_Address_In_Address_Field()"
});
formatter.result({
  "duration": 325701000,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Enter_The_Credit_Card_No_IN_Credit_Card_Field()"
});
formatter.result({
  "duration": 349317000,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Select_The_Card_Type()"
});
formatter.result({
  "duration": 304819300,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Select_The_Expiry_Month()"
});
formatter.result({
  "duration": 267167700,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Select_The_Expiry_Year()"
});
formatter.result({
  "duration": 310346300,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Enter_The_Cvv_Number_In_Cvv_Field()"
});
formatter.result({
  "duration": 205808000,
  "status": "passed"
});
formatter.match({
  "location": "Setp_Definition.user_Click_The_Book_Now_Button_To_Navigate_The_Booking_Confirm_Page()"
});
formatter.result({
  "duration": 306793800,
  "status": "passed"
});
formatter.after({
  "duration": 153500,
  "status": "passed"
});
formatter.before({
  "duration": 203100,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "Booking Confirm Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booking-confirm-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "user Click The My Itinerary Button To Navigate Booked Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Setp_Definition.user_Click_The_My_Itinerary_Button_To_Navigate_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 10836258100,
  "status": "passed"
});
formatter.after({
  "duration": 148300,
  "status": "passed"
});
formatter.before({
  "duration": 185900,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "Booked Itinerary Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booked-itinerary-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 56,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "user Click The Logout Button To Logout The Our Account",
  "keyword": "Then "
});
formatter.match({
  "location": "Setp_Definition.user_Click_The_Logout_Button_To_Logout_The_Our_Account()"
});
formatter.result({
  "duration": 7405581800,
  "status": "passed"
});
formatter.after({
  "duration": 180400,
  "status": "passed"
});
});