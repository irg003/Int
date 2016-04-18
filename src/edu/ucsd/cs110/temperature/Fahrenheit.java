package edu.ucsd.cs110.temperature;
//package edu.ucsd.cs110.temperature.Celsius;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    int temp;
    @Override
    public Temperature toCelsius() {
        float temp = getValue();
        temp = (float) ((temp - 32)/1.8);
        return new Celsius(temp);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }


    public String toString()
    {
        // TODO: Complete this method
        float x = getValue();
        return "" + x;
    }
}

