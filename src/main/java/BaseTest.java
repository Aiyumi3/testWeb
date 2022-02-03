import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    @BeforeSuite
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver", "G:\\practice\\testWeb\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("запуск драйвера хрома завершен");

        driver.manage().window().maximize();
        System.out.println("развертывание окна браузера на максимум завершено");
    }
    @BeforeClass
    public void openUrl() throws IOException {
        String url = "https://aiyumi3.github.io/JQuery_t1_KL_borderColform/";
        driver.get(url);
        System.out.println("открытие сайта завершено");

        TakesScreenshot scr = ((TakesScreenshot) driver);
        File file = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("G:\\practice\\testWeb\\src\\main\\open.PNG"));
        System.out.println("скрин open сделан");

    }
    @AfterClass
    public void closeUp() {
        System.out.println("test is finished");
        driver.quit();
        System.out.println("завершение работы драйвера");
    }
    @AfterSuite
    public void finish() {
        System.out.println("все закрылось");
    }

}
