import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Administrator on 2019/3/6.
 */
public class LoginTestIE {
    public static void main(String args[]) {
        System.setProperty("webdriver.ie.driver", "D:\\work\\workspace\\webdriver\\IEDriverServer.exe");
//        WebDriver driver = new InternetExplorerDriver();
        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
        WebDriver driver = new InternetExplorerDriver(ieCapabilities);
        driver.get("https://passport.cnblogs.com/user/signin?ReturnUrl=https%3A%2F%2Fwww.cnblogs.com%2F");
        driver.manage().window().maximize();
        WebElement loginName = driver.findElement(By.id("input1"));
        loginName.sendKeys("lilyYan");
        driver.findElement(By.id("input2")).sendKeys("testPassword");
        driver.findElement(By.id("signin")).click();
        driver.close();

    }
}
