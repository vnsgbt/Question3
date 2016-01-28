package org.vnsgbt.infoplus;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

/**
 * Created by snguy on 1/25/2016.
 *
 */

public class CommaFormatNumber {

    private String currentNumber;

    public CommaFormatNumber(String number) {
        currentNumber = number;
    }

    public String formatCurrentNumber() {
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();

        symbols.setGroupingSeparator(',');
        formatter.setDecimalFormatSymbols(symbols);

        return formatter.format(new BigDecimal(currentNumber));
    }
}
