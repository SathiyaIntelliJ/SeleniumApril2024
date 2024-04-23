package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import reusablefile.BaseCode;

import java.io.IOException;

public class Hooks {

  @Before()
    public void preCondition() throws IOException {
      System.out.println("Execution starts");
      BaseCode.launchBrowser();
  }
  @After()
    public void postCondition()
  {
      System.out.println("Execution ended");
  }
}
