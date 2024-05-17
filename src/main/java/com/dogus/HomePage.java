package com.dogus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(className = "go-to-candidate")
    WebElement candidateButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickCandidateButton() {
        candidateButton.click();
        System.out.println("Candidate button clicked");
    }
}
