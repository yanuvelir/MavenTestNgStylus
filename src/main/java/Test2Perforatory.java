import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test2Perforatory {

    @Test
    public void Test2Perforatory () {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://stylus.ua/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Katalog click
        driver.findElement(By.xpath("//*[@id=\"header_catalog\"]")).click();


        //Dacha i sad.Remont
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div/div[13]/a")).click();

        // Vse categorii
        driver.findElement(By.xpath("//*[@id=\"protal-page-block\"]/div/div[2]/div/span")).click();

        // Perforatory
        driver.findElement(By.xpath("//*[@id=\"protal-page-block\"]/div/div[2]/div/div[2]/div/div[51]/a")).click();


        //Вывод  товаров у которых есть тикет "Акция" (Valentin's Day)
        driver.findElements(By.xpath("//a[@class=\"sticker-inner\"][@title=\"Покупай подарки на День св.Валентина!\"]"));

        List<WebElement> VDay = driver.findElements
                (By.xpath("//a[@class=\"sticker-inner\"][@title=\"Покупай подарки на День св.Валентина!\"]"));

        System.out.println("Количество акционных товаров");
        System.out.println(VDay.size());


        driver.quit();


    }
}
