package AutoTest.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

//quit和close的区别
public class demo9 {
    public static void main(String[] args) throws InterruptedException {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            ChromeDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://www.baidu.com");

//            driver.findElement(By.cssSelector("#kw")).sendKeys("杨幂");
            driver.findElement(By.cssSelector("#s-top-left > a:nth-child(1)")).click();
            sleep(3000);
            //quit是关闭整个浏览器
//            driver.quit();
            //close只是关闭当前窗口
            driver.close();
            //即quit会清空缓存，而close不会清空缓存。
    }
}
