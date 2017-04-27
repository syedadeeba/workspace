package com.niit.SampleTemperatureConversion;

import com.niit.TemperatureConversion.TempConversion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(TempConversion.farenheitTocelcius(70) );
        System.out.println(TempConversion.celciusTofarenheit(23) );
    }
}
