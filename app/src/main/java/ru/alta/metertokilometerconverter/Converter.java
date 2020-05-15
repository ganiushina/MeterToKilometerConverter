package ru.alta.metertokilometerconverter;

class Converter {
    private float queryValue;
    private float resultValue;

    Converter(float firstValue){
        queryValue = firstValue;
    }

    Converter Convert(ConvertTo convertTo){
        resultValue = convertTo.Convert(queryValue);
        return  this;
    }

    float GetResult(){
        return resultValue;
    }
}
