package AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static java.lang.Thread.sleep;

public class firstAuto {
    //web自动化实例
    public void dianji() throws InterruptedException {
        //允许所有的请求
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //创建一个驱动对象来打开浏览器
        ChromeDriver driver = new ChromeDriver(options);
        //输入百度地址
        driver.get("https://www.baidu.com/");
        sleep(3000);
        driver.findElement(By.cssSelector("#kw")).sendKeys("selenium");
        sleep(1000);
        //找到“百度一下”按钮，并点击
        driver.findElement(By.cssSelector("#su")).click();
        sleep(1000);
        //释放驱动对象，关闭浏览器
//        driver.quit();
    }
}
