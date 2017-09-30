package javapacck;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.System.*;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class myjavaclass {

    private static final By ARTICLE = By.xpath(("//h3[@class='top2012-title']"));//коментарии плюс тайтл
    private static final By ARTICLE_TITLE = By.xpath(("//h3/a[@class='top2012-title']"));
    private static final By ARTICLE_COMMENT_COUNT = By.xpath("//h3/a[@class='comment-count']");

    private static final By MOB_ARTICLE = By.xpath(("//div[@class='md-mosaic-title']"));//коментарии плюс тайтл
    private static final By MOB_ARTICLE_TITLE = By.xpath(("//div/a[@class='md-scrollpos']"));
    private static final By MOB_ARTICLE_COMMENT_COUNT = By.xpath("//div/a[@class='commentCount']");


    private String WEB_PAGE = "http://www.delfi.lv/";//помещаем ссылку в переменную
    private String MOB_PAGE = "http://m.delfi.lv/";//помещаем ссылку в переменную


    @Test

    public void firstTest() {

        setProperty("webdriver.gecko.driver", "/home/ilona/Downloads/geckodriver");

        //WebDriver driverWeb = new FirefoxDriver();


        //driverWeb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driverWeb.manage().window().maximize();
//
        // driverWeb.get(WEB_PAGE);//открываем десктопную версию страницы


        WebDriver driverMob = new FirefoxDriver();

        driverMob.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driverMob.manage().window().maximize();


        driverMob.get(MOB_PAGE);//открываем мобильную версию страницы


        // List<WebElement> webArticleList = driverWeb.findElements(ARTICLE);

        // List<String> webTitles = new ArrayList<String>( );

        // List<Integer> webCounts = new ArrayList<Integer>();


        List<WebElement> mobArticleList = driverMob.findElements(MOB_ARTICLE);

        List<String> mobTitles = new ArrayList<String>();

        List<Integer> mobCounts = new ArrayList<Integer>();


        // List<String> mobileTitles = new ArrayList<String>();
        //  List<Integer> mobileCounts = new ArrayList<Integer>();

        List<Long> idsToCheck;

   //     idsToCheck = new ArrayList<Long>();


        for (int i = 0; i < 5; i++)

        {


            WebElement element = mobArticleList.get(i);


            mobTitles.add(MOB_ARTICLE_TITLE.findElement(element).getText());

            String mobtitle = element.findElements(MOB_ARTICLE_TITLE).get(i).getText();


            mobTitles.add(mobtitle);


            // добавляем текст в массив заголовков
            //  out.println("после адд");


            out.println(mobTitles);


            //idsToCheck.add(Long.valueOf(element.findElement(ARTICLE_TITLE).getAttribute("href").substring(0,3  )));


            //  if (element.findElements(ARTICLE_COMMENT_COUNT).size() != 0)

            // {
            //     String countToParse = element.findElement(ARTICLE_COMMENT_COUNT).getText(); //(106)


            //   countToParse = countToParse.substring(countToParse.indexOf('(') + 1, countToParse.indexOf(')')); //106
            //   webCounts.add(Integer.valueOf(countToParse));

            // List<WebElement> all = driverWeb.findElements(ARTICLE_TITLE);


        }
        // else {
        //   webCounts.add(0);
        // }


    }

}























        //  WebDriver driverMob = new FirefoxDriver();

      //  driverMob.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //  driverMob.manage().window().maximize();


      //  driverWeb.get(MOB_PAGE);//открываем мобильную версию страницы


      //  List<WebElement> articleList = driverWeb.findElements(ARTICLE);
          //  Mobtitles = new ArrayList<String>();//с заголовками
      //  List<Integer> Mobcounts = new ArrayList<Integer>();//с коментариями














      //  System.out.println("до поиска");

    //  WebElement element = (WebElement) driverD.findElements(By.xpath("//h3/a[@class='top 2012-title']"));

     //   System.out.println("после  поиска");


    //  final String text = element.getText();


     // System.out.println(text);



        //  System.out.println(driverD.findElement(By.xpath("//div[@class='top2012 top2014 content-cb-42305116']")));




               //  WebDriver driverM = new FirefoxDriver();

               //  driverM.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

               //  driverM.manage().window().maximize();
               //  driverM.get(MOB_PAGE);//открываем мобильную версию сайта



           //  List  <WebElement> element=driverM.findElements(By.xpath("//a[@class='md-scrollpos']"));//a/text()




        //System.out.println(driverM.findElement(By.xpath("//div[@class='wrapperfp']")));



           // }

