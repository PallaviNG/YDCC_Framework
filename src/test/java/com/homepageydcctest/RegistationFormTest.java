package com.homepageydcctest;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.ydcc.utils.WaitsFor;
import com.yddc.pages.RegistraionFormPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ydcc.keyword.UIKeywords;

public class RegistationFormTest {
	UIKeywords keyword = UIKeywords.getInstance();
	private static final Logger LOG = Logger.getLogger(RegistationFormTest.class);
	RegistraionFormPage rst = PageFactory.initElements(UIKeywords.getInstance().driver, RegistraionFormPage.class);

	@And("The Register page URL is launched")
	public void the_register_page_url_of_app_is_also_launched() {
		keyword.launchURL("http://143.110.249.55/new-registration");
	}

	@Given("Filled All Box Details")
	public void filled_all_box_details() {
		keyword.enterText(rst.aadhaar_number, "123456789087");
		keyword.enterText(rst.confirm_Aadhaar_Number, "123456789087");
		keyword.enterText(rst.pan_Card, "ABDCD5269F");
		keyword.enterText(rst.confirm_pan_Card, "ABDCD5269F");
		keyword.enterText(rst.first_name, "SHAKTI");
		keyword.enterText(rst.confirm_first_Name, "SHAKTI");
		keyword.enterText(rst.middle_Name, "MOHAN");
		keyword.enterText(rst.confirm_middle_Name, "MOHAN");
		keyword.enterText(rst.last_Name, "NAIK");
		keyword.enterText(rst.confirm_Last_Name, "NAIK");
		keyword.enterText(rst.Mobile_Number, "9970566120");
		keyword.enterText(rst.Confirm_Mobile_Number, "9970566120");
		keyword.enterText(rst.Alternate_Mobile_Number, "9970566122");
		keyword.enterText(rst.Email_id_onlyId, "SHAKTIMOHAN");
		keyword.enterText(rst.Email_id_onlydomain, "gmail.com");
		keyword.enterText(rst.confirmEmail_id_onlyId, "SHAKTIMOHAN");
		keyword.enterText(rst.confirmEmail_id_onlydomain, "gmail.com");

		System.out.println("Name To Be Printed On Hall Ticket*" + rst.Name_To_Be_printed_On_hall_ticket.getText());
		LOG.info("Name To Be Printed On Hall Ticket*" + rst.Name_To_Be_printed_On_hall_ticket.getText());
	}

	@When("Verify Details")
	public void verify_details() {
		keyword.click(rst.verifyDetails);
		System.out.println("Get pop text:" + rst.registration_confirmation.getText());
		LOG.info("Get pop text:" + rst.registration_confirmation.getText());
		keyword.click(rst.regisBtnOk);
	}

	@Then("Click On Submit Button")
	public void clickOnSubmitButton() {
		keyword.click(rst.regiSuccPageSubmit);
		WaitsFor.visibilityOFElement(rst.registerSuccf, 50);
		System.out.println("Get Regi Succe:" + rst.registerSuccf.getText());
		LOG.info("Get Regi Succe:" + rst.registerSuccf.getText());
		WaitsFor.visibilityOFElement(rst.regisSuccofBtnOk, 50);
		keyword.click(rst.regisSuccofBtnOk);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
