package Model;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverConnect {

    public static void setUpDriver(){
        WebDriverManager.chromedriver().setup();
    }

}
