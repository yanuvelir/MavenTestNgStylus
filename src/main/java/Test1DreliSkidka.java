import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test1DreliSkidka {

    @Test
    public void Test1DreliSkidka () {

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

        //Дрели click
        driver.findElement(By.xpath("//*[@id=\"protal-page-block\"]/div/div[2]/div/div[2]/div/div[20]/a")).click();


        //Список дрели со скидкой
        List<WebElement> DreliSkidkaList = driver.findElements
                (By.xpath("//div[@class='product-listing-right']//div[@class='old-price']"));

        //Если дрели со скидкой найдены, вывести сообщении
        if (DreliSkidkaList.size() >= 1) System.out.println("Товаров со скидкой на странице N1 найдено");
            //Если не найдены
        else System.out.println("Товаров со скидкой на странице N1 не найдено");

        //Количество товаров со скидкой
        System.out.println(DreliSkidkaList.size());

        //Цена со скидкой
        System.out.println("Старая цена на основной странице");
        System.out.println(DreliSkidkaList.get(0).getText());



        //Цена со скидкой на основной странице
        System.out.println("Цена со скидкой на основной странице");
        System.out.println(driver.findElement(By.xpath
                ("//*[@id=\"p-list-category-products\"]/div[2]/div[12]/div/div[2]/div[2]/div[1]/div[1]")).getText());

        //Vybor akcionnogo tovara na stranice N1, переход в карточку товара
        driver.findElement(By.xpath
                ("//*[@id=\"p-list-category-products\"]/div[2]/div[12]/div/div[2]/div[2]/div[2]/button[1]")).click();


        driver.findElement(By.xpath("//*[@id=\"checkout_popup\"]/div/div/div[2]/div[1]/div//span[@ class='price']"));

        WebElement SalePrice = driver.findElement(By.xpath
                ("//*[@id=\"checkout_popup\"]/div/div/div[2]/div[1]/div//span[@ class='price']"));

        //Валидация наличия акционной цены в карточке
        if (SalePrice.isDisplayed()) System.out.println("Акционная цена в карточке товара присутствует");

        else System.out.println("Акционная цена в карточке товара присутствует");

        //Акционная цена в карточке товара
        WebElement SalePriceCard = driver.findElement(By.xpath("//*[@id=\"checkout_popup\"]/div/div/div[2]/div[1]/div/form/div[1]/div/div/span[1]"));
        System.out.println(SalePrice.getText());

        //Закрытие карточки товара
        driver.findElement(By.xpath("//*[@id=\"checkout_popup\"]/div/div/div[1]")).click();

        //Поиск Акционной цена на страницах 2, 3, 4, 5.
        //Страница N2
        driver.findElement(By.xpath("//*[@id=\"p-list-category-products\"]/div[3]/div[2]/a[1]")).click();
        System.out.println("Количество Акционных товаров на странице N2");
        System.out.println(driver.findElements(By.xpath("//div[@class='old-price']")).size());


        //Страница N3
        driver.findElement(By.xpath("//*[@id=\"p-list-category-products\"]/div[3]/div[2]/a[3]")).click();
        System.out.println("Количество Акционных товаров на странице N3");
        System.out.println(driver.findElements(By.xpath("//div[@class='old-price']")).size());


        //Страница N4
        driver.findElement(By.xpath("//*[@id=\"p-list-category-products\"]/div[3]/div[2]/a[5]")).click();
        System.out.println("Количество Акционных товаров на странице N4");
        System.out.println(driver.findElements(By.xpath("//div[@class='old-price']")).size());


        //Страница N5
        driver.findElement(By.xpath("//*[@id=\"p-list-category-products\"]/div[3]/div[2]/a[3]")).click();
        System.out.println("Количество Акционных товаров на странице N5");
        System.out.println(driver.findElements(By.xpath("//div[@class='old-price']")).size());



        driver.quit();




    }
}
