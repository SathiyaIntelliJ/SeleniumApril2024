package reusablefile;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseCode
{
    public static WebDriver driver;
    public static Properties pro;
   public static void launchBrowser() throws IOException {
       File file=new File("src/main/resources/configurations/Utility.properties");
       FileInputStream fis=new FileInputStream(file);
       pro=new Properties();
       pro.load(fis);

//       if(pro.getProperty("browser").equalsIgnoreCase("chrome")) //equalsImgnoreCase - ignore the case sensitive
//       {
//           driver=new ChromeDriver();
//       }
//       else if (pro.getProperty("browser").equalsIgnoreCase("edge"))
//       {
//           driver=new EdgeDriver();
//       }
//       else if (pro.getProperty("browser").equalsIgnoreCase("safari"))
//       {
//           driver=new SafariDriver();
//       }
//       else
//       {
//           throw new InvalidArgumentException("Wrong browser");
//       }
       switch (pro.getProperty("browser").toLowerCase()) {
           case "chrome" -> driver = new ChromeDriver();
           case "edge" -> driver = new EdgeDriver();
           case "safari" -> driver = new SafariDriver();
           default -> throw new InvalidArgumentException("Enter valid browser name");
       }

       //driver=new ChromeDriver();
       //driver.get("https://jqueryui.com/droppable/");
       //driver.get("https://amazon.in");
       //driver.get("https://en.wikipedia.org/wiki/Tata_Consultancy_Services");
       //driver.get(pro.getProperty("Url"));
       driver.navigate().to(pro.getProperty("Url"));
       driver.navigate().refresh();
       //driver.navigate().forward();
       driver.manage().window().maximize();
   }
}
