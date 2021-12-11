package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.DriverFactory;

public class SeleniumGrid_Chrome2 {
    @Test
    public void executeInAWSDocker() {
        WebDriver driver = DriverFactory.getInstance().getDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
