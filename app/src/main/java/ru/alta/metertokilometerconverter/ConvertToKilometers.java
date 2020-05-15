package ru.alta.metertokilometerconverter;

public class ConvertToKilometers implements ConvertTo {
    @Override
    public float Convert(float firstValue) {
        return (float) ((float) firstValue * 3.6);
    }
}
