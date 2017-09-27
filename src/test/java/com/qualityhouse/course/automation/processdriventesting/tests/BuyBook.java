package com.qualityhouse.course.automation.processdriventesting.tests;

import com.qualityhouse.course.automation.processdriventesting.pageobjects.BooksPageObject;
import com.qualityhouse.course.automation.processdriventesting.pageobjects.CommonPageObjects;
import com.qualityhouse.course.automation.processdriventesting.pageobjects.LoginPageObject;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyBook {

    private WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    private CommonPageObjects common = new CommonPageObjects(driver);

    private BooksPageObject bookPage = new BooksPageObject(driver);


    @Before
    public void setup() { common.openApplication(); }

    @After
    public void tearDown() {
        common.closeApplication();
    }

    @Test
    public void tcBuyBook() {
        // todo: Exercise - create a procedure, readable by end users, to buy a book
    }
}
