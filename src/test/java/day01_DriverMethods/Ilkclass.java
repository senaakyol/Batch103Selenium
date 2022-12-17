package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*
            En temel haliyle otomasyon yapmak için Class'ımıza otomasyon için gerekli olan
            webdriver'ın yerini göstermemiz gerekir. Bunun için java kütüphanesinden System.setProperty()
            methodunun içine ilk olarak driver'i yazarız. İkinci olarak driver'ın fiziki yolunu kopyalarız.
         */
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");



    }
}
