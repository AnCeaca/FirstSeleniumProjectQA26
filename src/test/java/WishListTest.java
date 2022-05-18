import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {
    private WebDriver driver;

    @Before
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void addToWishListTest(){
        driver.findElement(By.cssSelector(".nav-1 .has-children")).click();
        driver.findElement(By.cssSelector("h2 [title='Slim fit Dobby Oxford Shirt']")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
    }



    @After
    public void close() {
        driver.close();
    }
}
