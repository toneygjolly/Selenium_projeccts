package test_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigation_command {
public static void main(String [] args) throws InterruptedException {
    System.setProperty("webdriver.edge.driver", "E:\\NEW LAPTOP\\selenium_java\\Libraray\\edgedriver_win64\\msedgedriver.exe");
   //WebDriver driver =new marionetteDriver();
    WebDriver driver = new EdgeDriver();
    driver.get("https://www.google.com");
    System.out.println(driver.getTitle());
   driver.navigate().to("http:\\www.tutorialspoint.com");
   System.out.println(driver.getTitle());
   driver.navigate().back();
   System.out.println(driver.getTitle());
   driver.get("https://github.com/login");
   System.out.println(driver.getTitle());
   driver.navigate().forward();
   System.out.println(driver.getTitle());
   driver.navigate().refresh();
   Thread.sleep(5000);
   driver.quit();
}
}
