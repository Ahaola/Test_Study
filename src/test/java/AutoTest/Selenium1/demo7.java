package AutoTest.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//下拉框处理
public class demo7 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/ASUS/Desktop/demo7.html");

        WebElement webElement = driver.findElement(By.cssSelector("#ShippingMethod"));
        Select select = new Select(webElement);
        select.selectByIndex(3);
//        select.selectByValue("9.03");
    }
}
