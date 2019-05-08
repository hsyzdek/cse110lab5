package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        float x = ((value*9)/5) + 32;
        return new Celsius(x);
    }

    public String toString()
    {
        // TODO: Complete this method
        return "" +value +" C";
    }
}