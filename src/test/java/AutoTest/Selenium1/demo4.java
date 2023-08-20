package AutoTest.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//键盘事件 让自动化代码1在运行过程中可以进行点击键盘上的按键操作
public class demo4 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.baidu.com/");

        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
        driver.findElement(By.cssSelector("#kw")).sendKeys("杨幂");
        driver.findElement(By.cssSelector("#kw")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.cssSelector("#kw")).sendKeys(Keys.CONTROL,"c");
        driver.findElement(By.cssSelector("#kw")).sendKeys(Keys.CONTROL,"v");
        driver.findElement(By.cssSelector("#su")).click();
    }
}
