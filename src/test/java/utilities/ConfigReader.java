package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    /*
    Methodu Devreye Sokabilmek Icin FileInputStream ile Dosya Yolunu Belirtmemeiz Gerekir
    Methoddan Once Calismasi Iccin Static Block Icerisine FileInputStream i Olusturmamiz Gerekir
     */
    static {
        String dosyaYolu = "config.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();// objeyi olusturduk ve deger atamasini yaptik
            properties.load(fis);// fis okudugu bilgileri properties e yukler
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String Key){
        /*
        Test methodundan gonderdigimiz String Key degerini alip Properties classindan
        getProperty() methodunu kullanarak bu key e ait valueu bize getirir.
         */
        return properties.getProperty(Key);
    }
}
