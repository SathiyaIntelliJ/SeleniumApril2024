package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMoreLogin
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        driver.findElement(By.id("username")).sendKeys("Sathiya");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        String eMessage = driver.findElement(By.xpath("//p[@id='errorMessage']")).getText();
        System.out.println(eMessage);

    }
}
