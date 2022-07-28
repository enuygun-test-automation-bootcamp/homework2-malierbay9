package homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExistenceOfElement {

    WebDriver driver;

    public TestExistenceOfElement(){ //yapıcı metot

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        this.driver = new ChromeDriver();                   //Chrome driver oluşturuyoruz.
        this.driver.get("https://demoqa.com/webtables");    //İlgili sayfayı açıyoruz.
        this.driver.manage().window().maximize();           //Sayfayı büyütüyoruz.

        //Bunların hepsi yapıcı metotta olduğu için nesne oluşturduğumuzda çalışacaktır

    }

    public boolean isExist(){

        return !this.driver.findElements(By.id("searchBox")).isEmpty();
        //findElements() metodu içine girdiğimiz locatorlara sahip elementlerin listesini döndürür.
        //isEmpty() metodu bu listenin boş olup olmadığını kontrol eder . Liste boş ise 'true', doluysa 'false' döndürür.
        //isExist metodunun, liste dolu olduğu zaman 'true', boş olduğu zaman 'false' döndürmesi için ifadenin başına '!' koyup değilleriz.
        //Bu şekilde girdiğimiz locator a sahip bir element sayfada mevcut mu değil mi test edebiliriz.

    }

}