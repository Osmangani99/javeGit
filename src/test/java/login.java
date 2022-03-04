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
        driver.findElement(By.name("email")).sendKeys("osmanqa200@gmail.com");
        // please add the password send key

        driver.findElement(By.name("password")).sendKeys("osman123");
        driver.findElement(By.className("my-login")).click();

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        String updatePage = driver.getTitle();
        System.out.println("This the page title of------------->"+" "+"updatePage");


        driver.findElement(By.linkText("iFrame")).click();
        String pageTitleIframe= driver.getTitle();
        System.out.println("This the page title of------------->"+" "+"pageTitleIframe");










    }

}
