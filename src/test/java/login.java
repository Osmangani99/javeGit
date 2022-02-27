import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {



    @Test
     public void login_test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa.taltektc.com/home/login");
        driver.findElement(By.name("email")).sendKeys("osmangani360@gmail.com");
        // please add the password send key

        // Below is what I change in Add branch from "Osman"
        driver.findElement(By.className("nav-link")).click();
        // where is my add

        //here is add from sadia where is it
        // Here is everything you do


        // From Sadia can not push



    }

}
