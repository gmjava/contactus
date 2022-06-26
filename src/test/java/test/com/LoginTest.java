/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.com;

import com.itexps.LoginPage;
import com.itexps.LogoutPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author m_gab
 */
public class LoginTest {// cand ai sequentual flow pui chrome driver in global

    static {//static means it will run first
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    }
    ChromeDriver driver = new ChromeDriver();

    public LoginTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //trbuie sa stii asta ca si qa!!!!!
    @Test
    public void testLogin() throws Exception {

        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.pageobj("mercury", "mercury");
    }

    @Test
    public void testLogout() throws Exception {
        // SearchContext driver;

        LogoutPage logout = PageFactory.initElements(driver, LogoutPage.class);
        Thread.sleep(5000);
//Advisable to use explicit wait to pause the driver.
        logout.logoutPage();
        Thread.sleep(5000);
        driver.close();
    }

}
