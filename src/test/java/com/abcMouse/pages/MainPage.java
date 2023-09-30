package com.abcMouse.pages;

import com.abcMouse.utilities.ConfigurationReader;
import com.abcMouse.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {


    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void clickAndHold(){
        WebElement element = Driver.getDriver().findElement(By.xpath("//div[@id='px-captcha']"));
        SearchContext shadowRoot = element.getShadowRoot();
        WebElement iframeFirst = shadowRoot.findElement(By.xpath("//iframe"));
        Driver.getDriver().switchTo().frame(iframeFirst);
        WebElement element1 = shadowRoot.findElement(By.xpath("//div[@role='button']"));
        Actions actions=new Actions(Driver.getDriver());
        actions.clickAndHold(element1).pause(15000).release().perform();

    }
    
    public void clickSubmit(){

        SearchContext shadowRoot = outerShadow.getShadowRoot();
        WebElement webElement = shadowRoot.findElement(By.cssSelector("page-component"));
        SearchContext shadowRoot1 = webElement.getShadowRoot();
        WebElement webElement1 = shadowRoot1.findElement(By.xpath("//main-layout"));
        SearchContext shadowRoot2 = webElement1.getShadowRoot();
        WebElement webElement2 = shadowRoot2.findElement(By.xpath(""));
                // now sorry I can do that but I have some meetings and other interviews time is up :(

        shadowRoot.findElement(By.cssSelector("signup-button[aria-label='Sign Up for ABCmouse.com']")).click();
        
        // everywhere is shadow element this is taking a long time :D
    }

    @FindBy(xpath = "//route-view[@class='loaded']")
    public WebElement outerShadow;

    @FindBy(css = "signup-button[aria-label='Sign Up for ABCmouse.com']")
    public WebElement signUpButton;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(css = "#submit-button")
    public WebElement submitButton;


    @FindBy(css = "#become-member")
    public WebElement becomeMemberText;


    }


