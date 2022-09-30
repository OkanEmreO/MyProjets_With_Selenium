package Project_Hotels;

import Page.Hotels;
import Utilities.GWD;

import java.util.ArrayList;

public class Hotels_com extends GWD {

    public static void main(String[] args) throws InterruptedException {

        Hotels hotels=new Hotels();

        System.out.println("Senaryo başladı");

        GWD.getDriver().get("https://tr.hotels.com/");

        String oldTab =getDriver().getWindowHandle();

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();


        hotels.findAndClick("varisNoktasi");
        Bekleme(1);
        hotels.findAndSend("nereye","rio De Janerio");
        Bekleme(1);
        hotels.findAndClick("rioDeJanerio");

        hotels.findAndClick("takvim");

        Bekleme(1);
        hotels.findAndClick("ekim26");
        Bekleme(1);
        hotels.findAndClick("kasim22");
        Bekleme(1);
        hotels.findAndClick("tamam");

        hotels.findAndClick("misafirSayisi");
        Bekleme(1);
        hotels.findAndClick("sayiDusur");

        hotels.findAndClick("tamam2");

        hotels.findAndClick("biletAra");
        Bekleme(2);
        hotels.findAndClick("copaCabana");

        ArrayList<String> newTab = new ArrayList<String>(getDriver().getWindowHandles());

        newTab.remove(oldTab);

        getDriver().switchTo().window(newTab.get(0));

        hotels.findAndClick("rezervasyon");

        hotels.findAndClick("odasec");

        hotels.findAndClick("konaklamaYerindeOde");

        hotels.findAndSend("name", "Russel");

        hotels.findAndSend("lastname", "Mcwalker");

        hotels.findAndSend("email", "email.email@gmail.com");

        hotels.findAndSend("phoneNumber", "5555555555");

        hotels.findAndClick("rizaMetni");

        hotels.findAndSend("kartNumarasi", "45645645454544646464448784754");

        hotels.findAndSend("kartAyTarihi", "03");

        hotels.findAndSend("kartYilTarihi", "26");

        hotels.findAndSend("kartCvv", "086");

        hotels.findAndClick("odemeYap");

        System.out.println("Test Passed");
        GWD.quitDriver();



    }

}
