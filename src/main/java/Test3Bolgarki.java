import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test3Bolgarki {

    @Test
    public void Test3Bolgarki () {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://stylus.ua/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Katalog click
        driver.findElement(By.xpath("//*[@id=\"header_catalog\"]")).click();


        //Дача сад ремонт click
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div/div[13]/a")).click();

        //Предворительная очистка строки поиска
        WebElement SearchInpField = driver.findElement(By.xpath("//input[@ name='q']"));
        SearchInpField.clear();
        //Ввод категории Болгарка
        SearchInpField.sendKeys("болгарка");

        // search button click
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[2]/form/button[2]")).click();

        //close cookie
        driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[2]/div[2]/div/button")).click();

        //Вывод количества товаров с возможностью рассрочки (кредит чпстями) //div[@class="month"]
        driver.findElements(By.xpath("//div[@class=\"month\"]"));

        List<WebElement> KreditProducts = driver.findElements(By.xpath
                ("//*[@id=\"p-list-searchresult\"]//div[@class=\"bank-stickers\"]"));

        System.out.println("Количество товаров с возможностью рассрочки стр 1");
        System.out.println(KreditProducts.size());

        //Вывод количества месяцев рассорчки
        System.out.println("Вывод максимального количество месяцев рассорчки для выбранного товара");
        System.out.println(KreditProducts.get(12).getText());

        //Страница №1
        System.out.println("Список товаров с рассрочкой, стр№1");

        //Товар 1
        System.out.println("Товар №1");


        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed = false;
        try {
            isDisplayed = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[4]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (
                NoSuchElementException e) {

        }

        if (isDisplayed) {
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[1]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 2
        System.out.println("Товар №2");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed2 = false;
        try {
            isDisplayed2 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[2]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed2) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[2]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }
//Товар 3
        System.out.println("Товар №3");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed3 = false;
        try {
            isDisplayed3 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[3]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed3) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[3]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 4
        System.out.println("Товар №4");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed4 = false;
        try {
            isDisplayed4 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[4]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed4) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[4]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 5
        System.out.println("Товар №5");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed5 = false;
        try {
            isDisplayed5 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[9]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {
        }

        if (isDisplayed5) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[5]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 6
        System.out.println("Товар №6");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed6 = false;
        try {
            isDisplayed6 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[6]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed6) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[6]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 7
        System.out.println("Товар №7");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed7 = false;
        try {
            isDisplayed7 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[7]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed7) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[7]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 8
        System.out.println("Товар №8");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed8 = false;
        try {
            isDisplayed8 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[8]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed8) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[8]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }


//Товар 9
        System.out.println("Товар №9");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed9 = false;
        try {
            isDisplayed9 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[9]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed9) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[9]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

//Товар 10
        System.out.println("Товар №10");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed10 = false;
        try {
            isDisplayed10 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[10]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed10) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[10]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

//Товар 11
        System.out.println("Товар №11");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed11 = false;
        try {
            isDisplayed11 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[11]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed11) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[11]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

//Товар 12
        System.out.println("Товар №12");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed12 = false;
        try {
            isDisplayed12 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[12]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed12) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[12]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

//Товар 13
        System.out.println("Товар №13");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed13 = false;
        try {
            isDisplayed13 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[13]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed13) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[13]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 14
        System.out.println("Товар №14");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed14 = false;
        try {
            isDisplayed14 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[14]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed14) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[14]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 15
        System.out.println("Товар №15");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed15 = false;
        try {
            isDisplayed15 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[15]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed15) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[15]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }


        //Товар 16
        System.out.println("Товар №16");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed16 = false;
        try {
            isDisplayed16 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[16]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed16) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[16]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

//Товар 17
        System.out.println("Товар №17");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed17 = false;
        try {
            isDisplayed17 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[17]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed17) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[17]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }


        //Товар 18
        System.out.println("Товар №18");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed18 = false;
        try {
            isDisplayed18 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[18]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed18) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[18]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 19
        System.out.println("Товар №19");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed19 = false;
        try {
            isDisplayed19 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[19]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed19) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[19]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

//Товар 20
        System.out.println("Товар №20");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed20 = false;
        try {
            isDisplayed20 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[20]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed20) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[20]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

//Товар 21
        System.out.println("Товар №21");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed21 = false;
        try {
            isDisplayed21 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[21]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed21) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[21]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 22
        System.out.println("Товар №22");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed22 = false;
        try {
            isDisplayed22 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[22]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed22) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[22]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 23
        System.out.println("Товар №23");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed23 = false;
        try {
            isDisplayed23 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[23]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed23) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[23]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

//Товар 24
        System.out.println("Товар №24");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed24 = false;
        try {
            isDisplayed24 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[24]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed24) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[24]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

//Товар 25
        System.out.println("Товар №25");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed25 = false;
        try {
            isDisplayed25 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[25]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed25) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[25]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 26
        System.out.println("Товар №26");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed26 = false;
        try {
            isDisplayed26 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[26]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed26) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[26]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 27
        System.out.println("Товар №27");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed27 = false;
        try {
            isDisplayed27 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[27]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed27) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[27]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 28
        System.out.println("Товар №28");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed28 = false;
        try {
            isDisplayed28 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[28]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed28) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[28]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

//Товар 29
        System.out.println("Товар №29");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed29 = false;
        try {
            isDisplayed29 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[29]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed29) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[29]/div/div[2]/div[1]/div[2]")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }

        //Товар 30
        System.out.println("Товар №30");
        //Если рассрочка у товара присутствует то вывести название товара


        boolean isDisplayed30 = false;
        try {
            isDisplayed30 = driver.findElement
                    (By.xpath("//*[@id=\"p-list-searchresult\"]/div[2]/div[30]/div/div[2]//div[@class=\"bank-stickers\"]")).isDisplayed();

        } catch (NoSuchElementException e) {

        }

        if (isDisplayed30) {
            System.out.println("Товар с возможностью рассрочки");
            System.out.println(driver.findElement(By.xpath
                    ("//*[@id=\"p-list-searchresult\"]/div[2]/div[30]/div/div[2]/div[1]/div[2]/a")).getText());
        } else {
            System.out.println("Рассрочка отсутствует");
        }


        driver.quit();

    }

}
