package javapacck;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myjavaclass {

  @Test

  public void firstTest() {

     System.setProperty("webdriver.gecko.driver","/home/ilona/Downloads/geckodriver");

      WebDriver driver = new FirefoxDriver();

      driver.manage().window().maximize();
      driver.get("http://javaguru.lv");
      driver.quit();


    }
}
