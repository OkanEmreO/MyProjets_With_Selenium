package Project_A101;

import Page.A101;
import Utilities.GWD;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;



import java.awt.*;
import java.awt.event.KeyEvent;


public class A101Test extends GWD {


    @Test
    public void test() throws AWTException, InterruptedException {

        A101 a101 = new A101();
        Robot rbt = new Robot();

        GWD.getDriver().get("https://www.a101.com.tr/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        Bekleme(1);
        a101.findAndClick("kabulet");

        a101.findAndSend("searchArea", "giyim");

        a101.findAndClick("giyimclick");
        Bekleme(1);
        a101.findAndClick("kadinicgiyim");
        Bekleme(1);
        a101.findAndClick("dizaltiCorap");
        Bekleme(2);

        a101.findAndClick("siyahcorap");

        a101.findAndContainsText("siyarRenk", "Penti Kadın 50 Denye Pantolon Çorabı Siyah");

        a101.findAndClick("sepeteEkle");

        a101.findAndClick("sepetiGoruntele");

        a101.findAndClick("sepetiOnayla");

        a101.findAndClick("uyeOlmadan");

        a101.findAndSend("email", "okan@gmail.com");

        a101.findAndClick("devamEt");

        a101.findAndClick("yeniAdres");

        a101.findAndSend("adresBasligi", "Ev Adresi");
        a101.findAndSend("firstName", "fgh");
        a101.findAndSend("lastName", "gfhfgh");
        a101.findAndSend("phoneNumber", "5555555555");
        Bekleme(1);
        a101.findAndClick("il");
        Bekleme(1);
        a101.findAndClick("ilce");
        Bekleme(1);
        a101.findAndClick("mahalle");
        Bekleme(1);
        a101.findAndSend("adres", "566 Sokak, Yaz Apartmanı, NO:56 Daire:98");
//        market.findAndSend("postaKodu", "36300"); // Siteden kaldırılan alan
        a101.findAndClick("kaydet");
        Bekleme(2);

        a101.findAndClick("kaydetveDevam");

        a101.findAndSend("adSoyad", "Yağmur Dereli");
        Bekleme(1);
        a101.findAndSend("kartNo", "5555444433332222");
        Bekleme(1);
        a101.findAndClick("monthDateCard");
        Bekleme(1);
        a101.findAndClick("yearDateCard");
        Bekleme(1);
        a101.findAndSend("cvvCard", "555");
        Bekleme(1);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);
        a101.findAndClick("siparisOnay");
        Bekleme(1);

        a101.findAndContainsText("kartHatasi", "Kart bilgilerinizi kontrol ediniz.");

        GWD.quitDriver();

    }
}
