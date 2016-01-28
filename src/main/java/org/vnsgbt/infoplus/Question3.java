package org.vnsgbt.infoplus;

public class Question3
{
    public static void main( String[] args )
    {
        long number;

        if (args.length > 0 && Long.parseLong(args[0]) > 0) {
            number = Long.parseLong(args[0]);
        }
        else {
            number = System.currentTimeMillis()/1000;
            System.out.println("\n Input not found or invalid: using epoch as number: " + number);
        }
        CommaFormatNumber formatter = new CommaFormatNumber(String.valueOf(number));
        System.out.println("\n " + formatter.formatCurrentNumber() + "\n");
    }
}

