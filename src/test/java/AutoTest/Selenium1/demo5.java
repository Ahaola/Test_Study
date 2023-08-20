package AutoTest.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

//鼠标事件
public class demo5 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.baidu.com/");

        driver.findElement(By.cssSelector("#kw")).sendKeys("520");
        driver.findElement(By.cssSelector("#su")).click();
        //找到图片按钮
        WebElement webElement = driver.findElement(By.cssSelector("#s_tab > div > a.s-tab-item.s-tab-item_1CwH-.s-tab-pic_p4Uej.s-tab-pic"));
        //鼠标右击
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).contextClick().perform();
    }
}
