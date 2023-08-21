package AutoTest.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

import static java.lang.Thread.sleep;

public class demo10 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.baidu.com");

        driver.findElement(By.cssSelector("#s-top-left > a:nth-child(1)")).click();
        sleep(3000);

        //通过getWindowHandles获取所有的窗口句柄
        //通过getWindowHandle获取get打开的页面窗口句柄
        Set<String> handles =  driver.getWindowHandles();
        //target用来获取当前最新的页面地址
        String target = "";
        for (String handle:handles) {
            target = handle;
        }
        driver.switchTo().window(target);
        driver.findElement(By.cssSelector("#ww")).sendKeys("新闻联播");
        driver.findElement(By.cssSelector("#s_btn_wr")).click();
    }
}
