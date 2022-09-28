package Project_Pegasus;

import Utilities.GWD;
import org.openqa.selenium.*;

public class Flypgs extends GWD {



    public static void main(String[] args) throws InterruptedException {

        GWD.getDriver().get("https://www.flypgs.com/");

        GWD.getDriver().manage().window().maximize();

        GWD.getDriver().manage().deleteAllCookies();

        WebElement accept=driver.findElement(By.id("nxm2CookieSubmitButton"));
        accept.click();

        WebElement oneWay=driver.findElement(By.xpath("(//div[@class='nxm2_form-group-radio']/label)[2]"));
        oneWay.click();

        WebElement whereAreyou=driver.findElement(By.xpath("//div[@data-text='Nereden']"));
        whereAreyou.click();

        WebElement chooseCity=driver.findElement(By.xpath("(//input[@data-search-title='Arama Sonuçları'])[1]"));
        chooseCity.sendKeys("Amsterdam");

        WebElement selectCity=driver.findElement(By.xpath("//li[@data-name='Amsterdam']"));
        selectCity.click();

        WebElement wheretoGo=driver.findElement(By.xpath("//div[@data-text='Nereye']"));
        wheretoGo.click();

        WebElement chooseSecondCity=driver.findElement(By.xpath("(//input[@data-search-title='Arama Sonuçları'])[2]"));
        chooseSecondCity.sendKeys("Abudhabi");

        WebElement selectSecondCity=driver.findElement(By.xpath("(//div[text()='Birleşik Arap Emirlikleri'])[5]"));
        selectSecondCity.click();

        WebElement calendar=driver.findElement(By.id("dp1"));
        calendar.click();

        WebElement endMonth=driver.findElement(By.xpath("//td[@data-month='8']/a[text()='29']"));
        endMonth.click();

        WebElement searchbutton=driver.findElement(By.xpath("//button[text()='Ucuz Uçuş Ara']"));
        searchbutton.click();

        WebElement tryToAgain=driver.findElement(By.xpath("//button/div[text()='TEKRAR DENE']"));


        if(tryToAgain.isDisplayed()){

            tryToAgain.click();

        }

        WebElement ucusSec=driver.findElement(By.xpath("//*[@id=\"availability-list\"]/div[1]/button"));
        ucusSec.click();

        Bekleme(1);
        WebElement ekopaket=driver.findElement(By.xpath("//*[@id=\"availability-list\"]/div[1]/div/div[1]/div[1]/div[2]/button"));
        ekopaket.click();

        Bekleme(1);
        WebElement devamet=driver.findElement(By.xpath("//*[@id=\"boarding-card-body\"]/div/div[7]/div[1]/button[2]"));
        devamet.click();

        Bekleme(1);
        WebElement mesajdvm=driver.findElement(By.xpath("//button[@type='button']/div[text()='Devam Et']"));
        mesajdvm.click();


        Bekleme(2);
        WebElement misafir=driver.findElement(By.xpath("//*[@id=\"boarding-card-body\"]/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/form/div/div[3]/button[3]/div"));
        WebElement misafirgiris=driver.findElement(By.xpath("//*[@id=\"passengerForm_0\"]/button/div[2]/div[1]"));

        try {

            misafir.click();

        }catch (ElementClickInterceptedException e){


            misafirgiris.click();
        }

        WebElement name=driver.findElement(By.xpath("(//div/input[@class='MuiInputBase-input MuiInput-input'])[3]"));
        name.sendKeys("Okan");

        WebElement lastname=driver.findElement(By.xpath("(//div/input[@class='MuiInputBase-input MuiInput-input'])[4]"));
        lastname.sendKeys("Emre");

        WebElement birthday=driver.findElement(By.xpath("(//div/input[@class='MuiInputBase-input MuiInput-input'])[5]"));
        birthday.sendKeys("12");

        WebElement birthmounth=driver.findElement(By.xpath("(//div/input[@class='MuiInputBase-input MuiInput-input'])[6]"));
        birthmounth.sendKeys("12");

        WebElement birthyear=driver.findElement(By.xpath("(//div/input[@class='MuiInputBase-input MuiInput-input'])[7]"));
        birthyear.sendKeys("1999");

        WebElement gendermale=driver.findElement(By.xpath("//*[@id='passengerForm_0']/div/div/form/div[1]/div/div[5]/div[2]/div/label[2]"));
        gendermale.click();

        WebElement firstelarea=driver.findElement(By.xpath("(//div/input[@name='area-code'])[2]"));
        firstelarea.sendKeys("543");

        WebElement telarea=driver.findElement(By.xpath("(//div/input[@class='MuiInputBase-input MuiInput-input'])[8]"));
        telarea.sendKeys("5554433");

        WebElement anothercountry=driver.findElement(By.xpath("//*[@id=\"passengerForm_0\"]/div/div/form/div[1]/div/div[7]/div/div[1]/div[2]/label[2]/span[2]"));
        anothercountry.click();

        WebElement continue2=driver.findElement(By.xpath("//div[@class='submit-button-container']/button"));
        continue2.click();

        WebElement eposta=driver.findElement(By.xpath("//*[@id=\"contactForm\"]/div/form/div/div[2]/div[4]/div/div/div/input"));
        eposta.sendKeys("okan123@gmail.com");

        continue2.click();

        Bekleme(2);
        WebElement dogrulama=driver.findElement(By.xpath("//button/div[text()='Üye Olmadan Devam Edin']"));
        dogrulama.click();

        Bekleme(4);
        WebElement sUcus=driver.findElement(By.xpath("//button/div[text()='SIRADAKİ UÇUŞA DEVAM']"));
        sUcus.click();



        Bekleme(4);
        WebElement ymkDevam=driver.findElement(By.xpath("//button/div[text()='YEMEK SEÇİMİNE DEVAM']"));
        ymkDevam.click();

        Bekleme(2);
        WebElement mesajdvm2=driver.findElement(By.xpath("//button[@type='button']/div[text()='Devam Et']"));
        mesajdvm2.click();

        Bekleme(4);
        WebElement sUcus2=driver.findElement(By.xpath("//button/div[text()='SIRADAKİ UÇUŞA DEVAM']"));
        sUcus2.click();

        Bekleme(2);
        WebElement bagajDevam=driver.findElement(By.xpath("//button/div[text()='BAGAJ HAKKI SEÇİMİNE DEVAM']"));
        bagajDevam.click();

        Bekleme(2);
        WebElement tekbgj=driver.findElement(By.xpath("(//div[@class='baggage-selection-item-radio-button'])[1]"));
        tekbgj.click();

        Bekleme(2);
        WebElement ucusdevam=driver.findElement(By.xpath("//*[@id=\"boarding-card-body\"]/div/div[2]/div[2]/div[7]/button/div"));
        ucusdevam.click();

        Bekleme(2);
        WebElement continue3=driver.findElement(By.xpath("//div[@class='submit-button-container']/button"));
        continue3.click();

        Bekleme(2);
        WebElement odemeYap=driver.findElement(By.xpath("//*[@id=\"boarding-card-body\"]/div/div[2]/div[2]/div[7]/button/div"));
        odemeYap.click();





























    }


}
