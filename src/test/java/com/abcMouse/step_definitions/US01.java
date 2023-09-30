package com.abcMouse.step_definitions;

import com.abcMouse.pages.MainPage;
import com.abcMouse.utilities.BrowserUtils;
import com.abcMouse.utilities.ConfigurationReader;
import com.abcMouse.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import static sun.jvm.hotspot.utilities.Assert.that;


public class US01 {

    MainPage mainPage = new MainPage();


    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {

        System.out.println("User is on the Main Page from Hooks Class");

    }

    @When("user click to Sign Up button")
    public void user_click_to_sign_up_button() {


        mainPage.signUpButton.click();


    }
    @When("user verify the register page returned")
    public void user_verify_the_register_page_returned() {

        String expectedTitle = "ABCmouse: Educational Games, Books, Puzzles & Songs for Kids & Toddlers";
        BrowserUtils.verifyTitle(expectedTitle);

                String currentURL = Driver.getDriver().getCurrentUrl();
                String expectedURL = "https://www.abcmouse.com/abt/register";
                Assert.assertEquals(currentURL, expectedURL);
    }
    @When("user entering the email address")
    public void user_entering_the_email_address() {

        mainPage.email.sendKeys(ConfigurationReader.getProperty("email"));

    }
    @When("user click the Submit button")
    public void user_click_the_submit_button() {

        mainPage.submitButton.click();

    }
    @When("user verify the subscription page returned")
    public void user_verify_the_subscription_page_returned() {

        String currentURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.abcmouse.com/abt/register";
        Assert.assertEquals(currentURL, expectedURL);

    }
    @Then("user verify the {string} text is rendered")
    public void user_verify_the_text_is_rendered(String string) {

        String currentText = "bla bla bla bla bla bla bla";
        String expectedText = "Become a Member!";
        Assert.assertEquals(currentText, expectedText);






    }
}
