package AutoTest;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class ThirdAuto {
    EdgeOptions options = new EdgeOptions();
    EdgeDriver driver;

     public EdgeDriver createDriver(){
        if(driver == null){
            options.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public void start_test(){
        driver.get("https://www.baidu.com");
    }

    public void printTitle(){
        String title1 = driver.getTitle();
        System.out.println(title1);
    }
}
