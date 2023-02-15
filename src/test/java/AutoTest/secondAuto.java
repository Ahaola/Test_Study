package AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class secondAuto {
    public ChromeDriver driver = new ChromeDriver();

    public void start_test() throws InterruptedException {
        driver.get("https://www.baidu.com");
        Thread.sleep(3000);
    }

    /**
     * 定位元素的方法
     */
    public void dingwei() throws InterruptedException {
        //css选择器
//        String txt = driver.findElement(By.cssSelector("#title-content > span.title-content-title")).getText();//返回文本
//        System.out.println(txt);

        //xpath选择器
//        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("杨幂");
//        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
        String news = driver.findElement(By.xpath("//*[@id=\"title-content\"]/span[1]")).getText();
        System.out.println(news);
    }

    public void wait_test() throws InterruptedException {
        //不添加等待的话页面没有渲染完成，导致最后查找页面元素失败，添加强制等待3s，再进行页面元素查找，结果成功！
//        driver.findElement(By.cssSelector("#kw")).sendKeys("杨幂");
//        driver.findElement(By.cssSelector("#su")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("#\\34  > div > div > div > div:nth-child(2) > div > div.group-sub-abs_N-I8P"));

        //隐式等待
       //在规定的时间范围内，轮询等待元素出现之后就立即结束，如果在规定的时间内元素仍然没有出现，则会抛出一个NoSuchElementException异常。
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    /**
     * 退出浏览器
     */
    public void end_test() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
