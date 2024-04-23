package seleniumbasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCode
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/");

        /*Using id locator */
        //driver.findElement(By.id("username")).sendKeys("Sathiya");
        /* Using name locator */
        //driver.findElement((By.name("username"))).sendKeys(("Sathiya"));

        /* Using xPath */
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Sathiya");
        driver.findElement(By.id("password")).sendKeys(("123"));
        driver.findElement(By.id("Login")).click();
        //String eMessage = driver.findElement(By.className("loginError")).getText();
        String eMessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
        System.out.println(eMessage);

    }
}
