package cz.lukynka.api;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

public abstract class Maths {

    public static Integer getIntPercentage(Integer full, Integer part) {
        return part / full * 100;
    }

    public static Float getFloatPercentage(Float full, Float part) {
        return part / full * 100;
    }


    public static String getFormat(double d) {
        return getFormat(d, 2);
    }


    public static String getFormat(double d, int decimals) {
        return getDecimalFormat(decimals).format(d);
    }


    public static String getFormat(int i) {
        return getFormat(i, 2);
    }


    public static String getFormat(int i, int decimals) {
        return getDecimalFormat(decimals).format(i);
    }





    public static DecimalFormat getDecimalFormat(int decimals) {
        DecimalFormat format = new DecimalFormat("#,##,##0.00");
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        otherSymbols.setDecimalSeparator('.');
        otherSymbols.setGroupingSeparator(',');

        format.setDecimalFormatSymbols(otherSymbols);
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(decimals);

        return format;
    }


    public static boolean IsInteger(Object object) {
        try {
            Integer.parseInt(object.toString());
            return true;
        } catch (Exception exc) {
            return false;
        }
    }




    public static  boolean isDouble(Object object) {
        try {
            Double.parseDouble(object.toString());
            return true;
        } catch (Exception exc) {
            return false;
        }
    }



    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


}
