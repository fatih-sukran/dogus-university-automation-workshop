package com.dogus.tests;

import com.dogus.CandidatePage;
import com.dogus.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProgramFilterTests {

    private WebDriver driver;

    @BeforeTest
    public void init() {
        driver = new ChromeDriver(new ChromeOptions());
    }

    @Test
    public void testProgramFilter() {
        driver.get("https://www.dogus.edu.tr/");
        var homePage = new HomePage(driver);
        homePage.clickCandidateButton();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        var candidatePage = new CandidatePage(driver);
        candidatePage.selectFaculty("Mühendislik Fakültesi");
        candidatePage.selectProgram("Bilgisayar Mühendisliği (İngilizce)");
        candidatePage.clickSearchButton();
    }

    @AfterTest
    public void destroy() {
        driver.quit();
    }
}
