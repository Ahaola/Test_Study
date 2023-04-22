package AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class firstAuto {
    //web自动化实例
    public void dianji() throws InterruptedException {
        //创建一个驱动对象来打开浏览器
        EdgeDriver driver = new EdgeDriver();
        //输入百度地址
        driver.get("https://www.baidu.com");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#kw")).sendKeys("这是一个自动化测试代码");
        Thread.sleep(3000);
        //找到“百度一下”按钮，并点击
        driver.findElement(By.cssSelector("#su")).click();
        Thread.sleep(3000);
        //释放驱动对象，关闭浏览器
        driver.quit();
    }
}
