package Page;

import Model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class persionalInfomationPage {

    private By firstnameXpath = By.xpath("//*[@id=\"ctl_insured_first_name\"]");
    private By middlenameXpath = By.xpath("//*[@id=\"MainPane\"]/table/tbody/tr[3]/td[3]/div/input");
    private By lastnameXpath = By.xpath("//*[@id=\"ctl_insured_last_name\"]");
    private By suffixXpath = By.xpath("//*[@id=\"ctl_insured_suffix\"]");

    private By firstinputDateXpath = By.xpath("//*[@id=\"MainPane\"]/table/tbody/tr[6]/td[3]/div/input[1]");
    private By secinputDateXpath = By.xpath("//*[@id=\"MainPane\"]/table/tbody/tr[6]/td[3]/div/input[2]");
    private By lastinputDateXpath = By.xpath("//*[@id=\"MainPane\"]/table/tbody/tr[6]/td[3]/div/input[3]");

    private By SSNradioboxXpath = By.xpath("//*[@id=\"ctl_insured_sw_1_1\"]");
    private By printbuttonXpath = By.xpath("//*[@id=\"buttonPrint\"]");

    public void fillFunction(WebDriver driver){

        User user = new User();
        String heading = driver.findElement(By.xpath("/html/body/div/form/div[1]/div[1]/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]")).getText();
        System.out.println(heading);

        driver.findElement(firstnameXpath).sendKeys(user.getFirstName());

        driver.findElement(middlenameXpath).sendKeys(user.getMiddleName());
        driver.findElement(lastnameXpath).sendKeys(user.getLastName());
        driver.findElement(suffixXpath).sendKeys(user.getSuffix());

        driver.findElement(firstinputDateXpath).sendKeys(user.getMonth());
        driver.findElement(secinputDateXpath).sendKeys(user.getDay());
        driver.findElement(lastinputDateXpath).sendKeys(user.getYear());

        driver.findElement(SSNradioboxXpath).click();
        driver.findElement(printbuttonXpath).click();

    }
}
