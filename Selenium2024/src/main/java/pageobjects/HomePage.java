package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage
{
    WebDriver driver;
    public void enterProductName(String productname)
    {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productname);
    }

    public void clickSearchIcon()
    {
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void  selectCategoryDropDownByIndex(int index)
    {
        WebElement e1=driver.findElement(By.id("searchDropdownBox"));
        Select s1=new Select(e1);
        s1.selectByIndex(index);
    }

    public void selectCategoryDropDownByValue(String val)
    {
        WebElement e2=driver.findElement(By.id("searchDropdownBox"));
        Select s2=new Select(e2);
        s2.selectByValue(val);
    }
}
