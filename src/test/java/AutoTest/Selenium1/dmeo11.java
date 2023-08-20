package AutoTest.Selenium1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

/**
 * 截图操作：需要导入依赖，可以去pom.xml文件中查看依赖，依赖从maven中央仓库中搜索common-io，下载。
 */
public class dmeo11 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.baidu.com");

        driver.findElement(By.cssSelector("#kw")).sendKeys("自动化测试");
        driver.findElement(By.cssSelector("#su")).click();
        sleep(3000);
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("D://demo10.png"));
    }
}
