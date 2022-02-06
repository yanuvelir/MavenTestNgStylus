import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test4Shurupoverty {

        @Test
        public  void Test4Shurupoverty () {


            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://stylus.ua/");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //Каталог click
            driver.findElement(By.xpath("//*[@id=\"header_catalog\"]")).click();

            //Дача и сад click
            driver.findElement(By.xpath("//*[@id=\"nav\"]/div/div[13]/a")).click();


            //Все категории click
            driver.findElement(By.xpath("//*[@id=\"protal-page-block\"]/div/div[2]/div/span")).click();

            //Шуруповерты click
            driver.findElement(By.xpath("//*[@id=\"protal-page-block\"]/div/div[2]/div/div[2]/div/div[91]/a")).click();

            //Закрыть куки попап
            driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[2]/div[8]/div/button")).click();


            //Список шуруповертов со скидкой
            driver.findElements(By.xpath("//*[@id=\"p-list-category-products\"]//div[@class=\"old-price\"]"));

            List<WebElement> ShurupovertySkidka = driver.findElements(By.xpath
                    ("//*[@id=\"p-list-category-products\"]//div[@class=\"price-block\"]//div[@class=\"old-price\"]"));

            //Если шуруповерты со скидкой найдены
            if (ShurupovertySkidka.size() >= 1) System.out.println("Товаров со скидкой на странице N1 найдено");
                //Если не найдены
            else System.out.println("Товаров со скидкой на странице N1 не найдено");

            //Количество товаров со скидкой
            System.out.println(ShurupovertySkidka.size());

            //OldNewPrice sout
            //String OldNewPrice = driver.findElement(By.xpath
                  //  ("//*[@id=\"p-list-category-products\"]//div[@class=\"price-block\"]//div[@class=\"old-price\"]")).getText();
           //System.out.println(OldNewPrice);

           //Расчет цены

            //Assert цен Товар 1
            String NewPriceProd1 = driver.findElement(By.xpath
                    ("//*[@id=\"p-list-category-products\"]/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]")).getText();
            //System.out.println(NewPriceProd1);
            Assert.assertEquals(NewPriceProd1, "619грн");

            //Assert цен Товар 2
            String NewPriceProd2 = driver.findElement(By.xpath
                    ("//*[@id=\"p-list-category-products\"]/div[2]/div[4]/div/div[2]/div[2]/div[1]/div[1]")).getText();

           // boolean
            Assert.assertEquals(NewPriceProd2, "500грн");


            driver.quit();

        }
}
