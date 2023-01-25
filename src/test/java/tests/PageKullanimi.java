package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class PageKullanimi {
    @Test
    public void testName() {

        //amazona gidelim
        Driver.getDriver().get("https://amazon.com");
        // iphone aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);

        // sonuc yazisinin iphone icerdigini test edelim
        String actualSonuc = amazonPage.sonucYazisi.getText();
        String arananKelime = "iphone";
        assert actualSonuc.contains(arananKelime);
        Driver.closeDriver();

    }


}
