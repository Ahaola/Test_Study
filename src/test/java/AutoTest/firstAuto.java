package AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstAuto {
    //web自动化实例
    public void dianji() throws InterruptedException {
     //创建一个驱动来打开浏览器
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        //输入百度地址
        driver.get("https://www.baidu.com");
        Thread.sleep(3000);
        //找到百度输入框，输入杨幂
        driver.findElement(By.cssSelector("#kw")).sendKeys("杨幂");
        Thread.sleep(3000);
        //找到“百度一下”按钮，并点击
        driver.findElement(By.cssSelector("#su")).click();
        Thread.sleep(3000);
        //释放驱动对象，关闭浏览器
        driver.quit();
    }
}
