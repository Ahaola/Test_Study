package AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class secondAuto {
    ChromeDriver driver = new ChromeDriver();
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

    //测试submit操作
    public void Submit_test() throws InterruptedException{
        driver.findElement(By.cssSelector("#kw")).sendKeys("迪丽热巴");
        driver.findElement(By.cssSelector("#su")).submit();
    }

    //清除操作
    public void clear_test() throws InterruptedException {
        driver.findElement(By.cssSelector("#kw")).sendKeys("杨幂哈哈");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#kw")).clear();//删除输入框的内容
        driver.findElement(By.cssSelector("#kw")).sendKeys("王大毛");//再次输入
    }

    //获取文本
    public void getText(){
        String text1 = driver.findElement(By.cssSelector("ul > li:nth-child(1)")).getText();
        System.out.println("应该的文本是我的咨询，实际打印出来的文本是"+text1);
        //获取属性值
        String text2 = driver.findElement(By.cssSelector("#su")).getAttribute("value");
        System.out.println("应该打印出来的是百度一下，实际打印出来的是"+text2);
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
