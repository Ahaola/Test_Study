package AutoTest.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

//定位一组元素
public class demo6 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("file:///C:/Users/ASUS/Desktop/demo6.html");

        List<WebElement> webElements = driver.findElements(By.cssSelector("input"));
        for (int i = 0; i < webElements.size(); i++) {
            if(webElements.get(i).getAttribute("type").equals("checkbox")){
                webElements.get(i).click();
            }else{
                //什么也不做
            }
        }
    }
}
