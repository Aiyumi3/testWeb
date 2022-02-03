import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main extends BaseTest{
    @BeforeMethod
    public void helloTest()  {
        System.out.println("~✨🌸hello from Test🌸✨~");
    }
    @AfterMethod
    public void screenShotResult() throws IOException {
        TakesScreenshot scr = ((TakesScreenshot) driver);
        File file1 = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file1, new File("G:\\practice\\testWeb\\src\\main\\test.PNG"));
        System.out.println("скрин результата сделан");
        System.out.println("~✨🌸bye from Test🌸✨~");
    }
    @Test
    public void checkNotNum() throws InterruptedException, IOException {
        WebElement inp = driver.findElement(By.xpath("//*[@id='billing_phone']"));
        Actions onmouseHover = new Actions(driver);
        onmouseHover.moveToElement(inp).click(inp).release(inp).perform();
        TakesScreenshot scr = ((TakesScreenshot) driver);
        File file = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("G:\\practice\\testWeb\\src\\main\\cursorininput.PNG"));
        System.out.println("скрин сделан");
        Thread.sleep(2000);
        inp.sendKeys("vjluйцкимчі");
        WebElement el = driver.findElement(By.xpath("//*[@id='app']/p"));
        el.click();
        scr = ((TakesScreenshot) driver);
        file = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("G:\\practice\\testWeb\\src\\main\\inputabc.PNG"));
        System.out.println("скрин сделан");
        Assert.assertTrue(inp.getAttribute("style").contains("border: thick solid rgb(204, 0, 51)"));
        Thread.sleep(5100);
    }

    @Test
    public void checkTooShort() throws InterruptedException, IOException {
        WebElement inp = driver.findElement(By.xpath("//*[@id='billing_phone']"));
        Actions onmouseHover = new Actions(driver);
        onmouseHover.moveToElement(inp).click(inp).release(inp).perform();
        TakesScreenshot scr = ((TakesScreenshot) driver);
        File file = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("G:\\practice\\testWeb\\src\\main\\cursorininput.PNG"));
        System.out.println("скрин сделан");
        Thread.sleep(2000);
        inp.sendKeys("38063712123");
        WebElement el = driver.findElement(By.xpath("//*[@id='app']/p"));
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("+38063712123");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("3806371217");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("+3806309");
        el.click();
        scr = ((TakesScreenshot) driver);
        file = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("G:\\practice\\testWeb\\src\\main\\tooshort.PNG"));
        System.out.println("скрин сделан");
        Assert.assertTrue(inp.getAttribute("style").contains("border: thick solid rgb(204, 0, 51)"));
        Thread.sleep(5100);
    }

    @Test
    public void checknotValidNum() throws InterruptedException, IOException {
        WebElement inp = driver.findElement(By.xpath("//*[@id='billing_phone']"));
        Actions onmouseHover = new Actions(driver);
        onmouseHover.moveToElement(inp).click(inp).release(inp).perform();
        TakesScreenshot scr = ((TakesScreenshot) driver);
        File file = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("G:\\practice\\testWeb\\src\\main\\cursorininput.PNG"));
        System.out.println("скрин сделан");
        Thread.sleep(2000);
        inp.sendKeys("+380000000000");
        WebElement el = driver.findElement(By.xpath("//*[@id='app']/p"));
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("380000001232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("000000101002");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("-380637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("=380637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("?380637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("%380637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("м380637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("И380637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("380637121232-");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("380637121232=");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("380637121232?");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("380637121232%");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("380637121232м");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("380637121232И");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("380637121b232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("3806371#21232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("0637121h232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("063712@1232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("-0637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("=0637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("?0637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("%0637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("м0637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("И0637121232");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("0637121232-");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("0637121232=");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("0637121232?");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("0637121232%");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("0637121232м");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("0637121232И");
        el.click();
        Thread.sleep(5000);
        inp.sendKeys("+380007121232");
        el.click();
        scr = ((TakesScreenshot) driver);
        file = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("G:\\practice\\testWeb\\src\\main\\notvalidnum.PNG"));
        System.out.println("скрин сделан");
        Assert.assertTrue(inp.getAttribute("style").contains("border: thick solid rgb(204, 0, 51)"));
        Thread.sleep(5100);
    }

    @Test
    public void validNumCheck() throws InterruptedException, IOException {
        WebElement inp = driver.findElement(By.xpath("//*[@id='billing_phone']"));
        Actions onmouseHover = new Actions(driver);
        onmouseHover.moveToElement(inp).click(inp).release(inp).perform();
        TakesScreenshot scr = ((TakesScreenshot) driver);
        File file = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("G:\\practice\\testWeb\\src\\main\\cursorininput.PNG"));
        System.out.println("скрин сделан");
        Thread.sleep(2000);
        inp.sendKeys("380637121232");
        WebElement el = driver.findElement(By.xpath("//*[@id='app']/p"));
        el.click();
        Thread.sleep(2000);
        inp.clear();
        inp.sendKeys("0637121232");
        el.click();
        Thread.sleep(2000);
        inp.clear();
        inp.sendKeys("+380637121232");
        el.click();
        scr = ((TakesScreenshot) driver);
        file = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("G:\\practice\\testWeb\\src\\main\\rightnumber.PNG"));
        System.out.println("скрин сделан");
        Assert.assertTrue(inp.getAttribute("style").contains("border: thin solid black"));
        Thread.sleep(5100);
    }


}
