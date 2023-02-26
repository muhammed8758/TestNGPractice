package tests.Cross;

import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class CrossTest01 extends TestBaseCross {
    @Test
    public void test01() {
        driver.get("htpps://amazon.com");
        driver.get("http://facebook.com");
    }
}
