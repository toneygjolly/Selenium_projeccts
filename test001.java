package test_selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test001 {
    public static void main(String[] args) {
        // Set the correct path to msedgedriver.exe
        System.setProperty("webdriver.edge.driver", "E:\\NEW LAPTOP\\selenium_java\\Libraray\\edgedriver_win64\\msedgedriver.exe");

        // Initialize WebDriver for Edge
        WebDriver driver = new EdgeDriver();

        // Open a webpage
        driver.get("https://www.google.com");

        // Print the title to confirm it worked
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
