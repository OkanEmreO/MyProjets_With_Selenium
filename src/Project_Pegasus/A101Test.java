package Project_Pegasus;

import Locators.A101;
import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import java.awt.*;
import java.awt.event.KeyEvent;




public class A101Test extends GWD {




    public static void main(String[] args) throws AWTException, InterruptedException {

        Robot rbt = new Robot();

        A101 a101 = new A101();


        GWD.getDriver().get("https://www.a101.com.tr/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        Bekleme(1);


//
//        a101.accept.click();
//
//        Bekleme(1);
//
//        a101.searchArea.sendKeys("giyim");
//        Bekleme(1);
//
//        a101.giyimclick.click();
//        Bekleme(1);
//
//        a101.kadinicgiyim.click();
//        Bekleme(1);

//        a101.dizaltiCorap.click();
//        Bekleme(1);
//
//        a101.siyahcorap.click();
//        Bekleme(1);
//
//        a101.sepeteEkle.click();
//        Bekleme(1);
//
//        a101.sepetiGoruntele.click();
//        Bekleme(1);
//
//        a101.sepetiOnayla.click();
//        Bekleme(1);
//
//        a101.uyeOlmadan.click();
//        Bekleme(1);
//
//        a101.email.sendKeys("okan@gmail.com");
//        Bekleme(1);
//
//        a101.devamEt.click();
//        Bekleme(1);
//
//        a101.yeniAdres.click();
//        Bekleme(1);
//
//        a101.adresBasligi.sendKeys("Ev Addressi");
//        Bekleme(1);
//
//        a101.firstName.sendKeys("Fatihli");
//        Bekleme(1);
//
//        a101.lastName.sendKeys("Terim");
//        Bekleme(1);
//
//        a101.phoneNumber.sendKeys("5555555555");
//        Bekleme(1);
//
//        a101.il.click();
//        Bekleme(1);
//
//        a101.ilce.click();
//        Bekleme(1);
//
//        a101.mahalle.click();
//        Bekleme(1);
//
//        a101.adres.sendKeys("596 Sokak, Yaz Apartmanı, NO:36 Daire:68");
//        Bekleme(1);
//
//        a101.kaydet.click();
//        Bekleme(1);
//
//        a101.kaydetveDevam.click();
//        Bekleme(1);
//
//        a101.adSoyad.sendKeys("Meltem Çınar");
//        Bekleme(1);
//
//        a101.kartNo.sendKeys("5555444433332222");
//        Bekleme(1);
//
//        a101.monthDateCard.click();
//        Bekleme(1);
//
//        a101.yearDateCard.click();
//        Bekleme(1);
//
//        a101.cvvCard.sendKeys("666");
//
//        rbt.keyPress(KeyEvent.VK_TAB);
//        rbt.keyRelease(KeyEvent.VK_TAB);
//        rbt.keyPress(KeyEvent.VK_TAB);
//        rbt.keyRelease(KeyEvent.VK_TAB);
//        rbt.keyPress(KeyEvent.VK_SPACE);
//        rbt.keyRelease(KeyEvent.VK_SPACE);
//
//
//        a101.siparisOnay.click();


//          Assert.assertTrue(kartHatasi.getText().toLowerCase().contains("Kart bilgilerinizi kontrol ediniz."));


    }
}
