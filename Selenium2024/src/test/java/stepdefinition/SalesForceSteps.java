package stepdefinition;

import org.junit.Assert;
import reusablefile.BaseCode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import reusablefile.ReadExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalesForceSteps extends BaseCode
{
    WebElement categoryElement;
    String amazonProductName;

    /*@Given("user navigates to salesforce login page")
    public void loginPage()
    {
        driver=new ChromeDriver();
        driver.get("https://amazon.in");
    }*/

    @When("user enters the username {string} and password {string}")
    public void verifyCredentials(String username, String password)
    {
        driver.findElement(By.id("username")).sendKeys(BaseCode.pro.getProperty("username"));
        driver.findElement(By.id("password")).sendKeys(BaseCode.pro.getProperty("password"));
    }

    @And("user clicks on login button")
    public void clickLogin()
    {
        driver.findElement(By.id("Login")).click();
    }

    @Then("Verify whether the  user navigates to home page")
    public void verifyHomePage()
    {

    }

    @And("Verify the Title")
    public void verifyTitle()
    {

    }

    @Then("Verify the Error Message")
    public void verifyTheErrorMessage() {
        String actualResult=driver.findElement(By.id("error")).getText();
        String expectedResult=" Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        //Assert.assertEquals((actualResult,expectedResult));

        if(actualResult.equals(expectedResult))
        {
            Assert.assertTrue(true);
            //System.out.println("The Error Message is correct");
        }
        else
        {
            Assert.assertFalse(false);
            //System.out.println("Incorrect Error Message");
        }
    }

    //ACMEDemoValidation.feature
    @Given("User logged into ACME Login Page")
    public void user_logged_into_acme_login_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User clicks card types")
    public void user_clicks_card_types() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Verify whether user can view fields {string} and {string} which is available under card types")
    public void verify_whether_user_can_view_fields_and_which_is_available_under_card_types(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    //AmazonValidation.feature
    /*@Given("Navigate to Amazon home page")
    public void amazonHomePage()
    {
      //driver.findElement(By.xpath("//div[@id=\"username_container\"]/child::input[1]"));
        driver=new ChromeDriver();
        driver.get("https://amazon.in");
    }*/

//    @When("user type the product name \"iPhone\" in search box")
//    public void searchProduct()
//    {
//
//    }

    @Then("verify the search result")
    public void verifySearchResult()
    {
        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon.in : "+amazonProductName;

        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @When("user selects the required value from the category drop down")
    public void selectCategory()
    {
        categoryElement=driver.findElement(By.id("searchDropdownBox"));
        Select selectCat=new Select(categoryElement);
        //selectCat.selectByIndex(6);
        //selectCat.selectByVisibleText("Books");
        selectCat.selectByValue("search-alias=mobile-apps");
    }

    @Then("user extracts the drop down value")
    public void userExtractsTheDropDownValue()
    {
        int categorySize=categoryElement.findElements(By.tagName("option")).size();

        for(int i=0;i<categorySize;i++)
        {
            String value=categoryElement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(value);
        }
    }



    @Given("User selects the baby wishlist")
    public void userSelectsTheBabyWishlist()
    {
        WebElement e=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a=new Actions(driver);
        a.clickAndHold(e).build().perform();
        //driver.findElement(By.linkText("Baby Wishlist")).click();
        //driver.findElement(By.partialLinkText("Baby Wi")).click();
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
    }

    @Given("user drag and drops")
    public void userDragAndDrops()
    {
        //If webelement present in the particular frame
        WebElement frameElement=driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);
        WebElement dragElement =driver.findElement(By.id("draggable"));
        WebElement dropElement =driver.findElement(By.id("droppable"));
        Actions drag=new Actions(driver);
        drag.dragAndDrop(dragElement,dropElement).build().perform();
        driver.switchTo().defaultContent();
    }

    /*@Given("user navigates to wiki page")
    public void userNavigatesToWikiPage()
    {
        driver=new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Tata_Consultancy_Services");
    }*/

    @Given("user extracts the column one value")
    public void userExtractsTheColumnOneValue()
    {
        //Using XPath elements
//        int colOneCount=driver.findElements(By.xpath("//table[@class=\"infobox vcard\"]/descendant::tr/child::th")).size();
//        for(int j=0;j<colOneCount;j++)
//        {
//            String colOneValue=driver.findElements(By.xpath("//table[@class=\"infobox vcard\"]/descendant::tr/child::th")).get(j).getText();
//            System.out.println(colOneValue);
//        }

        List<String> colOneVal=new ArrayList<>();
        List<WebElement> colOneElement=driver.findElements(By.xpath("//table[@class=\"infobox vcard\"]/descendant::tr/child::th"));
        for(WebElement e:colOneElement)
        {
            colOneVal.add(e.getText());

        }
        System.out.println(colOneVal);
        for(String x:colOneVal)
        {
           if(x.equals("Subsidiaries"))
           {
               System.out.println("Subsidiaries found in the list");
           }
        }

        //Using Webelements - getting 'th' count
//       WebElement e=driver.findElement(By.xpath("//table[@class='infobox vcard']"));

//        int thCount= e.findElements(By.tagName("th")).size();
//        List<String> colOneValue=new ArrayList<>();
//        for(int k=0;k<thCount;k++)
//        {
//            colOneValue.add(e.findElements(By.tagName("th")).get(k).getText());
//            //System.out.println(e.findElements(By.tagName("th")).get(k).getText());
//        }
//        System.out.println(colOneValue);

//        List<WebElement> coloneElement=e.findElements(By.tagName("th"));
//        List<String> coloneElementVal=new ArrayList<>();
//        for(WebElement oColOneElement:coloneElement)
//        {
//            coloneElementVal.add(oColOneElement.getText());
//        }
//
//        //Using Webelements - getting 'td' count
//        WebElement tdElement=driver.findElement(By.xpath("//table[@class='infobox vcard']"));
//        int tdCount= tdElement.findElements(By.tagName("td")).size();
//        List<String> colTwovalue=new ArrayList<>();
//        for(int k=2;k<tdCount;k++)
//        {
//            colTwovalue.add(tdElement.findElements(By.tagName("td")).get(k).getText());
//            //System.out.println(tdElement.findElements(By.tagName("td")).get(k).getText());
//        }
//        System.out.println(colTwovalue);
//        //For Aquitition table - Using xpath
//        int acqCount=driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[4]")).size();
//
//        for(int x=0;x<acqCount;x++)
//        {
//            String acqValue=driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[4]")).get((x)).getText();
//            System.out.println(acqValue);
//        }

//        //Using Webelement
//        WebElement acqElement=driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']"));
//        int acqSize = acqElement.findElements(By.xpath("/child::tbody/child::tr/child::td[4]")).size();
//
//        for(int y=0;y<acqSize;y++)
//        {
//            System.out.println(driver.findElements(By.xpath("/child::tbody/child::tr/child::td[4]")).get(y).getText());
//        }
    }

    @Given("user enter the credentials")
    public void userEnterTheCredentials() throws IOException {
        driver.findElement(By.id("username")).sendKeys(ReadExcel.getExcelData("Login",0,0));
        driver.findElement(By.id("password")).sendKeys(ReadExcel.getExcelData("Login",1,0));
    }

    @When("user type the product name {string} in search box")
    public void userTypeTheProductNameInSearchBox(String productName)
    {
      amazonProductName=productName;
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys(amazonProductName);
      driver.findElement(By.id("nav-search-submit-button")).click();
    }
}

