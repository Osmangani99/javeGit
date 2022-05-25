import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {



    @Test
     public void login_test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.taltektc.com/home/login");
        driver.findElement(By.name("email")).sendKeys("osmanqa200@gmail.com");
        // please add the password send key
        // The fun part is here, Yes this is really fun and more fun
        driver.findElement(By.name("password")).sendKeys("osman123");
        driver.findElement(By.className("my-login")).click();

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        // Update page details
        driver.findElement(By.xpath("//a[@class='nav-link']")).click();
        String updatePage = driver.getTitle();
        System.out.println("This the page title of------------->"+" "+"updatePage");

        // i Frame page details
        driver.findElement(By.linkText("iFrame")).click();
        String pageTitleIframe= driver.getTitle();

        System.out.println("This the page title of------------->"+" "+"pageTitleIframe"); // Conflict


       // Let's add few more line

       driver.findElement(By.xpath("//button[@onclick='myFunction();']")).click();

       driver.findElement(By.linkText("Web Table")).click();
       String pageTitleWebTable = driver.getTitle();
       System.out.println("This the page title of------------->"+pageTitleWebTable);

       driver.findElement(By.linkText("Alert")).click();

       Thread.sleep(1000);
       WebElement jsAlert = driver.findElement(By.xpath("//button[@class='btn btn-light']"));
       System.out.println("Here is the Text of the jsAlert--------->"+jsAlert.getText());
       jsAlert.click();
       driver.switchTo().alert().accept();

         // No conflict please
         // solve Feature
        // I am from Feature4
        // I am in 57 line

















    }

}
