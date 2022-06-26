/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author m_gab
 */
public class LoginPage {

    WebDriver driver; //declaration for Webdriver

    public LoginPage(WebDriver driver) {//constructor for driver
        this.driver = driver;
    }

 
    //Atributes cu @Find By=adnotations

    @FindBy(xpath = ".//*[@name='userName']")
    private WebElement userName;//assign a variable to the WebElement aici WebElementul e user name.

    @FindBy(xpath = ".//*[@name='password']")
    private WebElement password;

    @FindBy(xpath = ".//*[@name='submit']")
    private WebElement submitBtn;

//pasul nr 2!!!! trebuie sa stii pasul asta
    public void pageobj(String uName, String pWord)
            throws Exception {
        try {
            driver.get("http://demo.guru99.com/test/newtours/index.php");
            driver.manage().window().maximize();
            userName.sendKeys(uName);
            password.sendKeys(pWord);
            submitBtn.click();
            //   LoginPage login = new LoginPage(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
