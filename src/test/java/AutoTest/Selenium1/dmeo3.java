package AutoTest.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class dmeo3 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.baidu.com/");

        //全屏
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        //设置固定宽，高
        driver.manage().window().setSize(new Dimension(1000,800));

        driver.findElement(By.cssSelector("#kw")).sendKeys("杨幂");
        driver.findElement(By.cssSelector("#su")).click();
        //浏览器回退
        driver.navigate().back();
        sleep(1000);
        //浏览器刷新
        driver.navigate().refresh();
        sleep(3000);
        //浏览器前进
        driver.navigate().forward();
        sleep(3000);
        //将浏览器滚动条滑到最底端  JS脚本强制转换
        ((JavascriptExecutor)driver).executeScript("document.documentElement.scrollTop=10000");
    }
}
