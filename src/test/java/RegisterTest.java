import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    private WebDriver driver;

    @Before
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void validRegisterTest(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title='Register']")).click();
        driver.findElement(By.id("firstname")).sendKeys("And");
        driver.findElement(By.id("middlename")).sendKeys("blabla");
        driver.findElement(By.id("lastname")).sendKeys("Maaaaa");
        driver.findElement(By.id("email_address")).sendKeys("test@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("pass");
        driver.findElement(By.id("confirmation")).sendKeys("pass");
        driver.findElement(By.cssSelector(".button.validation-passed")).click();
    }

    @Test
    public void invalidRegisterTest(){
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("a[title='Register']")).click();
        driver.findElement(By.id("firstname")).sendKeys("And");
        driver.findElement(By.id("middlename")).sendKeys("blabla");
        driver.findElement(By.id("lastname")).sendKeys("Maaaaa");
        driver.findElement(By.id("email_address")).sendKeys("test@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("pass");
        driver.findElement(By.id("confirmation")).sendKeys("pass");
        driver.findElement(By.cssSelector(".button.validation-passed")).click();
    }

    @After
    public void close() {
        driver.close();
    }
}
