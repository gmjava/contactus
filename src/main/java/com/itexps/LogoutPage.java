/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author m_gab
 */

public class LogoutPage {

    WebDriver driver;//declaration

    public LogoutPage(WebDriver driver) {
        this.driver = driver;//constructor for driver
    }
//Atributes
    @FindBy(xpath = ".//*[contains(text(),'SIGN-OFF')]")
    private WebElement logoutPage;

    public void logoutPage() throws Exception {
        try {
            logoutPage.click();
// Logout logout = new Logout(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}