package Locators;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class A101 extends GWD {

//    String a101 = "https://www.a101.com.tr/";

    WebElement accept = driver.findElement(By.xpath("//button[text()='Kabul Et']"));

    WebElement searchArea = driver.findElement(By.xpath("(//input[@name='search_text'])[1]"));

    WebElement giyimclick = driver.findElement(By.xpath("//a[@data-id='1555']/span"));

    WebElement kadinicgiyim = driver.findElement(By.xpath("//a[@href='/giyim-aksesuar/kadin-ic-giyim/?recommended_by=instant_search&recommended_code=giyim']"));

    WebElement dizaltiCorap = driver.findElement(By.xpath("//a[@href='/giyim-aksesuar/dizalti-corap/?recommended_by=instant_search&recommended_code=giyim']"));

    WebElement siyahcorap = driver.findElement(By.xpath("(//h3[@class='name'])[1]"));

    WebElement sepeteEkle = driver.findElement(By.xpath("//button[@data-pk='18864']"));

    WebElement sepetiGoruntele = driver.findElement(By.xpath("(//a[text()='Sepeti Görüntüle'])[2]"));

    WebElement sepetiOnayla = driver.findElement(By.xpath("(//a[@title='Sepeti Onayla'])[2]"));

    WebElement uyeOlmadan = driver.findElement(By.xpath("//a[@title='ÜYE OLMADAN DEVAM ET']"));

    WebElement email = driver.findElement(By.xpath("//div/input[@name='user_email']"));

    WebElement devamEt = driver.findElement(By.xpath("//button[@class='button block green']"));

    WebElement yeniAdres = driver.findElement(By.xpath("(//a[@title='Yeni adres oluştur'])[1]"));

    WebElement adresBasligi = driver.findElement(By.xpath("//input[@name='title']"));

    WebElement firstName = driver.findElement(By.name("first_name"));

    WebElement lastName = driver.findElement(By.name("last_name"));

    WebElement phoneNumber = driver.findElement(By.name("phone_number"));

    WebElement il = driver.findElement(By.cssSelector("option[value='40']"));

    WebElement ilce = driver.findElement(By.cssSelector("option[value='468']"));

    WebElement mahalle = driver.findElement(By.cssSelector("option[value='35891']"));

    WebElement adres = driver.findElement(By.cssSelector("textarea[name='line']"));

    WebElement kaydet = driver.findElement(By.xpath("(//button[@type='button'])[6]"));

    WebElement kaydetveDevam = driver.findElement(By.xpath("//button[@class='button block green js-proceed-button']"));

    WebElement adSoyad = driver.findElement(By.xpath("(//input[@name='name'])[2]"));

    WebElement kartNo = driver.findElement(By.xpath("(//label/input[@type='tel'])[3]"));

    WebElement monthDateCard = driver.findElement(By.xpath("(//select[@name='card_month']/option[@value='12'])[2]"));

    WebElement yearDateCard = driver.findElement(By.xpath("(//select[@name='card_year']/option[@value='2026'])[2]"));

    WebElement cvvCard = driver.findElement(By.xpath("(//label/input[@type='tel' or  @name='card_cvv'])[4]"));

    WebElement siparisOnay = driver.findElement(By.xpath("(//button[@type='submit']/span)[4]"));

    WebElement kartHatasi = driver.findElement(By.xpath("//div[text()='Kart bilgilerinizi kontrol ediniz.']"));


}
