package com.dogus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CandidatePage {
    @FindBy(id = "ddlFaculties")
    WebElement facultyDropdown;

    @FindBy(id = "ddlPrograms")
    WebElement programDropdown;

    @FindBy(id = "filter-programs")
    WebElement searchButton;

    public CandidatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectFaculty(String faculty) {
        var element = new Select(facultyDropdown);
        element.selectByVisibleText(faculty);
        System.out.println("Selected faculty: " + faculty);
    }

    public void selectProgram(String program) {
        var element = new Select(programDropdown);
        element.selectByVisibleText(program);
        System.out.println("Selected program: " + program);
    }

    public void clickSearchButton() {
        searchButton.click();
        System.out.println("Search button clicked");
    }
}
