
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
        // Initialize web driver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Go to Google.com
        driver.get("https://www.google.com/");

        Thread.sleep(1000);
        WebElement accept = driver.findElement(By.id("L2AGLb"));
       // accept.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", accept);

        // Find the search box element
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter the search term "WPT" into the search box
        searchBox.sendKeys("WebPort Technology");

        // Submit the search form
        searchBox.submit();

        // Wait for the search results to load
        // Add your own wait logic here, if necessary

        // Close the browser
        //driver.quit();
    }
}

