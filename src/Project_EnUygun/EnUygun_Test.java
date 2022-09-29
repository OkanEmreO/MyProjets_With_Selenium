package Project_EnUygun;

import Page.EnUygun;
import Utilities.GWD;
import org.openqa.selenium.support.ui.Select;

public class EnUygun_Test extends GWD {

    public static void main(String[] args) throws InterruptedException {

        EnUygun enUygun = new EnUygun();


        GWD.getDriver().get("https://www.enuygun.com/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        enUygun.findAndClick("otobusTicket");

        enUygun.findAndSend("nereden", "Fethiye");

        enUygun.findAndClick("fethiye");

        enUygun.findAndSend("nereye", "İstanbul");

        enUygun.findAndClick("istanbul");
        enUygun.findAndClick("takvim");
        enUygun.findAndClick("nextMonth");
        enUygun.findAndClick("twelfthDecember");
        enUygun.findAndClick("biletBul");
        Bekleme(2);
        enUygun.findAndClick("biletSec");
        Bekleme(1);
        enUygun.findAndClick("firstSeat");
        Bekleme(1);
        enUygun.findAndClick("cinsiyetErkek");
        Bekleme(1);
        enUygun.findAndClick("onaylaveDevamEt");
        Bekleme(1);
        enUygun.findAndSend("email", "mymail@gmail.com");
        Bekleme(1);
        enUygun.findAndSend("phoneNumber", "5555555555");
        Bekleme(1);
        enUygun.findAndClick("rizaMetni");
        Bekleme(1);
        enUygun.findAndSend("name", "sdfdsf");
        Bekleme(1);
        enUygun.findAndSend("lastname", "dsfdsf");
        Bekleme(1);
        enUygun.findAndClick("yabanciVatandas");
        Bekleme(1);
        enUygun.findAndSend("passaportNumber", "45645645");
        Bekleme(1);
        enUygun.findAndClick("passaportCountry");
        Bekleme(1);
        enUygun.findAndSend("kartNumarasi", "45645645454544646464448784754");
        Bekleme(1);
        enUygun.findAndClick("kartAyTarihi");
        Bekleme(1);
        enUygun.findAndClick("kartYilTarihi");
        Bekleme(1);
        enUygun.findAndSend("kartCvv", "086");
        Bekleme(1);
        enUygun.findAndClick("odemeYap");

        enUygun.findAndContainsText("hataMesaji","Lütfen geçerli bir kart girin.");

    }
}
