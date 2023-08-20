package AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

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
        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("#kw")).sendKeys("selenium");
        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("杨幂");
//        driver.findElement(By.cssSelector("#kw")).sendKeys("这是一个自动化测试代码");
        Thread.sleep(1000);
        //找到“百度一下”按钮，并点击
        driver.findElement(By.cssSelector("#su")).click();
        Thread.sleep(1000);
        //释放驱动对象，关闭浏览器
        driver.quit();

    }
}
