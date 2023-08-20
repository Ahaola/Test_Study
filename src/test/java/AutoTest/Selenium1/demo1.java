package AutoTest.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class demo1 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.baidu.com/");
        String button_value  = driver.findElement(By.cssSelector("#su")).getAttribute("value");
        //隐式等待
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.DAYS);
        if(button_value.equals("百度一下")){
            System.out.println("测试通过");
        }else{
            System.out.println("测试失败");
        }
        driver.quit();
    }
}
