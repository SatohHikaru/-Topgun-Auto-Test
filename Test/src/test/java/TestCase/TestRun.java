package TestCase;

import Page.*;
import Model.driverConnect;

import Page.pendingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;


public class TestRun {

    public static void main(String[] args) {

        popupPDFImageTestcase();

    }

    public static void switchNewTab(WebDriver driver){
        String currentTab = driver.getWindowHandle();
        for (String tab : driver.getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                driver.switchTo().window(tab);
            }
        }
    }

    public static void LoginTestCase(){
        driverConnect.setUpDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://applicintweb.com/ExamRightTrunk/Default.aspx");
        Login login = new Login();
        login.loginFunction(driver);
    }

    public static void popupPDFImageTestcase(){
        driverConnect.setUpDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://applicintweb.com/ExamRightTrunk/Default.aspx");
        Login login = new Login();
        pendingPage pendingpage = new pendingPage();
        persionalInfomationPage persionalinfomationpage = new persionalInfomationPage();

        //Login To page
        login.loginFunction(driver);

        //Create Function in Pending page
        pendingpage.createNewFunction(driver);

        //Switch focus when have new tab opened
        switchNewTab(driver);

        //Fill information into inputs
        persionalinfomationpage.fillFunction(driver);

    }

}

