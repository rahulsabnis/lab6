package edu.ucsd.cs110.temperature;

/**
 * Created by rahulsabnis on 2/15/17.
 */
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(((getValue() * 9) / 5) + 32);
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue() + " C";
    }
}
