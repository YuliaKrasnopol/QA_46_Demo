
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssCelectors {
    WebDriver driver = new ChromeDriver();
    @Test

    public void selectorsHomePage(){
        //driver.navigate().to("https://demoqa.com/");
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // driver.close();
        driver.quit();
    }




}
