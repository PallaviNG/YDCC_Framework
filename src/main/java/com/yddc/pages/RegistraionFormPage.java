package com.yddc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistraionFormPage {
	@FindBy(css="#newAadharNumber")
	public WebElement aadhaar_number;
	@FindBy(css="input[name=checkAddhar]")
	public WebElement confirm_Aadhaar_Number;
	@FindBy(css="#newPanCard")
	public WebElement pan_Card;
	@FindBy(css="input[name=checkPanCard]")
	public WebElement confirm_pan_Card;
	@FindBy(css="#newFname")
	public WebElement first_name;
	@FindBy(css="input[name=checkNewFname]")
	public WebElement confirm_first_Name;
	@FindBy(css="#newMname")
	public WebElement middle_Name;
	@FindBy(css="input[name=checkNewMname]")
	public WebElement confirm_middle_Name;
	@FindBy(css="#newLname")
	public WebElement last_Name;
	@FindBy(css="input[name=checkNewLname]")
	public WebElement confirm_Last_Name;
	@FindBy(css="#fullName")
	public WebElement Name_To_Be_printed_On_hall_ticket;
	@FindBy(css="#newMobileNumber")
	public WebElement Mobile_Number;
	@FindBy(css="input[name='checkNewMobileNumber']")
	public WebElement Confirm_Mobile_Number;
	@FindBy(css="input[name='newAlternativeMobileNumber']")
	public WebElement Alternate_Mobile_Number;
	@FindBy(css="#newMailPartOne")
	public WebElement Email_id_onlyId;
	@FindBy(css="#newMailPartTwo")
	public WebElement Email_id_onlydomain;
	@FindBy(css="input[name='checkNewMailPartOne']")
	public WebElement confirmEmail_id_onlyId;
	@FindBy(css="input[name='checknewMailPartTwo']")
	public WebElement confirmEmail_id_onlydomain;
	@FindBy(css="#verifyNewRegistration i.fa")
	public WebElement verifyDetails;
	@FindBy(css="div#swal2-content")
	public WebElement registration_confirmation;
	@FindBy(css = "div.swal2-actions button:nth-child(1)")
	public WebElement regisBtnOk;
	@FindBy(css="button.btn:nth-child(2)")
	public WebElement regiPageSubmit;
	@FindBy(css="div#swal2-content")
	public WebElement registerSuccf;
	@FindBy(css="button.btn:nth-child(2)")
	public WebElement regiSuccPageSubmit;
	@FindBy(css = "div.swal2-actions button:nth-child(1)")
	public WebElement regisSuccofBtnOk;
}
