package stepdef;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class HerokuSteps
{
WebDriver driver;

@Given("user extracts the available example values")
public void getAllAvailableExamples()
{
  driver=new ChromeDriver();
  driver.get("https://the-internet.herokuapp.com/");
  driver.manage().window().maximize();

  //Using Collections - List, Advanced for loop
  List<String> allValues=new ArrayList<>();
  //List<WebElement> allValElement=driver.findElements(By.xpath("//div[@id='content']/child::ul/child::li"));
  List<WebElement> allValElement=driver.findElements(By.xpath("//div[@id='content']/descendant::li"));

  for(WebElement element:allValElement)
  {
    allValues.add(element.getText());
  }
  System.out.println(allValues);

  //Using xpath,for loop
  //int valCount=driver.findElements(By.xpath("//div[@id='content']/child::ul/child::li")).size();
  int valCount=driver.findElements(By.xpath("//div[@id='content']/descendant::li")).size();

  for(int i=0;i<valCount;i++)
  {
    //String values=driver.findElements(By.xpath("//div[@id='content']/child::ul/child::li")).get(i).getText();
    String values=driver.findElements(By.xpath("//div[@id='content']/descendant::li")).get(i).getText();
    System.out.println(values);
  }

}

}
