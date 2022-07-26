package TestNGTestCases;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNGmethods {

     @org.testng.annotations.Test()

        @DataProvider
        public Object[][] data() {
            return new String[][] {new String[] {"data1"}, new String[] {"data2"}};
        }

        @Test (dataProvider = "data")
        public void test(String d) {
            Assert.assertEquals("First Line/Second Line", "Third Line/Fourth Line");
        }
    }




