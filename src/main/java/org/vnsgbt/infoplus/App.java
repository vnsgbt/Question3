package org.vnsgbt.infoplus;

public class App
{
    public static void main( String[] args )
    {
        CommaFormatNumber formatter = new CommaFormatNumber(args[0]);
        System.out.println(formatter.formatCurrentNumber());
    }
}

