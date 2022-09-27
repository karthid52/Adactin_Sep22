package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import javax.annotation.processing.Filer;

import org.openqa.selenium.WebDriver;
import com.adactin.runner.RunnerClass;
import com.baseclass.BaseClass;
import com.pageobjectmanager.Page_Object_Manager;
import com.sdp.FileReaderManager;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = RunnerClass.driver;
	Page_Object_Manager pom = new Page_Object_Manager(driver);


@Given("^user Launch The Adactin Application$")
public void user_Launch_The_Adactin_Application() throws Throwable {
	String url = FileReaderManager.getInstanceFRM().getInstanceCR().getUrl();
	getUrl(url);
}
@When("^user Enter The \"([^\"]*)\" In Username Field$")
public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	sendValue(pom.getInstanceLp().getUsername(), username);
}

@When("^user Enter The \"([^\"]*)\" In Password Field$")
public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	sendValue(pom.getInstanceLp().getPassword(), password);

}
@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {

	clickOnElement(pom.getInstanceLp().getLogin());
}

@When("^user Select The Location In Select Location Dropdown List$")
public void user_Select_The_Location_In_Select_Location_Dropdown_List() throws Throwable {
dropDown(pom.getInstanceHs().getLocation(), "selectByIndex", "2");
}

@When("^user Select The Hotel In Select Hotels Dropdown List$")
public void user_Select_The_Hotel_In_Select_Hotels_Dropdown_List() throws Throwable {
	dropDown(pom.getInstanceHs().getHotels(),"selectByindex", "2");
}

@When("^user Select The Room Type In Select Room Type Dropdown List$")
public void user_Select_The_Room_Type_In_Select_Room_Type_Dropdown_List() throws Throwable {
	dropDown(pom.getInstanceHs().getRoomtype(),"selectByIndex","3");
}

@When("^user Select The Number of Rooms In Dropdown List$")
public void user_Select_The_Number_of_Rooms_In_Dropdown_List() throws Throwable {
	dropDown(pom.getInstanceHs().getRoom_nos(),"selectByIndex", "1"); 
}

@When("^user Enter The Check In Date In The Check In Date Field$")
public void user_Enter_The_Check_In_Date_In_The_Check_In_Date_Field() throws Throwable {
	clear(pom.getInstanceHs().getDatepick_in());
	String in_date = FileReaderManager.getInstanceFRM().getInstanceCR().getIn_date();
	sendValue(pom.getInstanceHs().getDatepick_in(), in_date);
}

@When("^user Enter The Check Out Date In The Check Out Date Field$")
public void user_Enter_The_Check_Out_Date_In_The_Check_Out_Date_Field() throws Throwable {
	clear(pom.getInstanceHs().getDatepick_out());
	String out_date = FileReaderManager.getInstanceFRM().getInstanceCR().getOut_date();
	sendValue(pom.getInstanceHs().getDatepick_out(), out_date);
}

@When("^user Select The Adults Per Room In Dropdown List$")
public void user_Select_The_Adults_Per_Room_In_Dropdown_List() throws Throwable {
	dropDown(pom.getInstanceHs().getAdult_room(),"selectByIndex","1");
}

@When("^user Select The Children Per Room In Dropdown List$")
public void user_Select_The_Children_Per_Room_In_Dropdown_List() throws Throwable {
	dropDown(pom.getInstanceHs().getChild_room(),"selectByIndex", "2");
}

@Then("^user Click The Search Hotel Button And It Navigates To Select Hotel Page$")
public void user_Click_The_Search_Hotel_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	clickOnElement(pom.getInstanceHs().getSubmit());
}

@When("^user Click The Radio Button To Select The Hotel$")
public void user_Click_The_Radio_Button_To_Select_The_Hotel() throws Throwable {
	clickOnElement(pom.getInstanceSh().getRadiobutton());
}

@Then("^user Click The Continue Button And Navigates To Book A Hotel Page$")
public void user_Click_The_Continue_Button_And_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	clickOnElement(pom.getInstanceSh().getContinues());
}

@When("^user Enter The First Name  In First Name Field$")
public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	String firstname = FileReaderManager.getInstanceFRM().getInstanceCR().getFirstname();
	sendValue(pom.getInstanceBh().getFirst_name(), firstname);
}

@When("^user Enter The Last Name  In Last Name Field$")
public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	String lastname = FileReaderManager.getInstanceFRM().getInstanceCR().getLastname();
	sendValue(pom.getInstanceBh().getLast_name(), lastname);
}

@When("^user Enter The Billing Address In Address Field$")
public void user_Enter_The_Billing_Address_In_Address_Field() throws Throwable {
	String address = FileReaderManager.getInstanceFRM().getInstanceCR().getAddress();
	sendValue(pom.getInstanceBh().getAddress(), address);
}

@When("^user Enter The Credit Card Number In The Number Field$")
public void user_Enter_The_Credit_Card_Number_In_The_Number_Field() throws Throwable {
	String cc_num = FileReaderManager.getInstanceFRM().getInstanceCR().getCc_num();
	sendValue(pom.getInstanceBh().getCc_num(), cc_num);
}

@When("^user Select The Credit Card Type In Dropdown List$")
public void user_Select_The_Credit_Card_Type_In_Dropdown_List() throws Throwable {
	dropDown(pom.getInstanceBh().getCc_type(),"selectByIndex", "1");
}

@When("^user Select The Expiry Date In Select Month And Select Year Dropdown List$")
public void user_Select_The_Expiry_Date_In_Select_Month_And_Select_Year_Dropdown_List() throws Throwable {
	dropDown(pom.getInstanceBh().getCc_exp_month(),"selectByVisibleText", "December");
	dropDown(pom.getInstanceBh().getCc_exp_year(),"selectByVisibleText", "2022");
}

@When("^user Enter The Ccv Number In Ccv Number Field$")
public void user_Enter_The_Ccv_Number_In_Ccv_Number_Field() throws Throwable {
	String cvv_num = FileReaderManager.getInstanceFRM().getInstanceCR().getCvv_num();
	sendValue(pom.getInstanceBh().getCc_cvv(), cvv_num);
}

@Then("^user Click The Book Now Button And It Navigates To Booking Confirmation Page$")
public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
	clickOnElement(pom.getInstanceBh().getBook_now());
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

@When("^user Get The Booking Confirmation And Take The Screenshot$")
public void user_Get_The_Booking_Confirmation_And_Take_The_Screenshot() throws Throwable {
	getActionsMethods(pom.getInstanceBc().getSearch_hotel(), "moveToElement");
	takesScreenshot("pic1");
}

@Then("^user Click The Logout Button And It Navigates To Logout Page$")
public void user_Click_The_Logout_Button_And_It_Navigates_To_Logout_Page() throws Throwable {
	clickOnElement(pom.getInstanceBc().getLog_out());
}


}