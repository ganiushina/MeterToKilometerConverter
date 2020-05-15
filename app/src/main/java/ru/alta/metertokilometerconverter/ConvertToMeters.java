package ru.alta.metertokilometerconverter;

public class ConvertToMeters implements ConvertTo {
    @Override
    public float Convert(float firstValue) {
        return (float) (firstValue/3.6);
    }
}
