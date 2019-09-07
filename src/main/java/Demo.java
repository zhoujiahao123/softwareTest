import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        WebDriver  driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Jacob\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://happymmall.com/index.html");
        driver.findElement(By.className("link-login")).click();
    }
}
