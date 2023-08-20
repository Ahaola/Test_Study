package AutoTest.Selenium1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo2 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.baidu.com/");

        // 打印url和标题title
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        if(url.equals("https://www.baidu.com/") || title.equals("百度一下，你就知道")){
            System.out.println("测试通过，标题和url均正确。");
        }
    }
}
