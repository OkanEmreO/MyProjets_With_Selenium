package Project_Pegasus;

import Page.Flypgs;
import Utilities.GWD;
import org.openqa.selenium.*;

public class Flypgs_Test extends GWD {

    public static void main(String[] args) throws InterruptedException {

        Flypgs fly = new Flypgs();

        GWD.getDriver().get("https://www.flypgs.com/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        fly.findAndClick("acceptCookie");

        fly.findAndClick("oneway");

        fly.findAndClick("nereden");
        fly.findAndSend("sehirsec", "ams");
        Bekleme(1);
        fly.findAndClick("amsterdam");
        Bekleme(1);
        fly.findAndClick("wheretoGo");
        fly.findAndSend("sehirsec2", "Abudhabi");
        fly.findAndClick("abudhabi");
        fly.findAndClick("calendar");
//        fly.findAndClick("calendarnext");
        fly.findAndClick("sixthday");

        fly.findAndClick("searchbutton");

        if (fly.tekrardene.isDisplayed()) {

            fly.findAndClick("tekrardene");

        }

        fly.findAndClick("ucusSec");

        Bekleme(1);

        fly.findAndClick("ekopaket");

        Bekleme(1);

        fly.findAndClick("devamet");

        Bekleme(1);

        fly.findAndClick("mesajdvm");


        try {
            fly.findAndClick("misafirgiris");
        } catch (ElementClickInterceptedException e) {
            fly.findAndClick("misafir");
        }
        fly.findAndSend("name", "Mustafa");

        fly.findAndSend("lastname", "Ceylan");

        fly.findAndSend("birthday", "10");

        fly.findAndSend("birthmounth", "10");

        fly.findAndSend("birthyear", "1990");

        fly.findAndClick("gendermale");

        fly.findAndSend("firstelarea", "555");

        fly.findAndSend("telarea", "5555555");

        fly.findAndClick("anothercountry");

        fly.findAndClick("devamet2");

        fly.findAndSend("eposta", "mustafa.cceylan@gmail.com");

        fly.findAndClick("devamet2");

        Bekleme(1);

        fly.findAndClick("sUcus");

        Bekleme(1);

        fly.findAndClick("ymkDevam");

        Bekleme(1);

        fly.findAndClick("mesajdvm");

        Bekleme(1);

        fly.findAndClick("sUcus");

        Bekleme(1);

        fly.findAndClick("bagajDevam");

        Bekleme(1);

        fly.findAndClick("tekbgj");

        fly.findAndClick("ucusdevam");

        fly.findAndClick("devamet2");

        fly.findAndClick("ödemeYap");

        fly.findAndContainsText("odemeAlani","Ödeme Şeklini Seçiniz");

        System.out.println("Test Passed");

        GWD.quitDriver();


    }


}
