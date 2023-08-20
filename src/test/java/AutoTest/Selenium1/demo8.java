package AutoTest.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//上传文件
public class demo8 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/ASUS/Desktop/demo8.html");

        driver.findElement(By.cssSelector("input")).sendKeys("C:\\Users\\ASUS\\Desktop\\UPUP.txt");

    }
}
