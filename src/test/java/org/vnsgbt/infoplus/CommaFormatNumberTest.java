package org.vnsgbt.infoplus;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by snguy on 1/25/2016.
 *
 */

public class CommaFormatNumberTest {

    @Test(dataProvider = "provideNumbers")
    public void test(String number, String expected) {
        CommaFormatNumber test = new CommaFormatNumber(number);
        Assert.assertEquals(test.formatCurrentNumber(), expected);
    }

    @DataProvider(name = "provideNumbers")
    public Object[][] provideData() {
        String input = Long.toString(System.currentTimeMillis()/1000);
        String expect = formatWithCommas(input);

        return new Object[][] {
                { "10", "10" },
                { "1000", "1,000" },
                { "100000", "100,000" },
                { "2000000", "2,000,000" },
                { "2000000.123", "2,000,000.123" },
                {input,expect}
        };
    }

    private String formatWithCommas(String input) {
        long count = 1;
        String formatted = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            formatted = input.charAt(i) + formatted;
            if (count == 4) {
                formatted = formatted.charAt(0) + "," + formatted.substring(1,formatted.length());
                count = 1;
            }
            count++;
        }
        return formatted;
    }
}
