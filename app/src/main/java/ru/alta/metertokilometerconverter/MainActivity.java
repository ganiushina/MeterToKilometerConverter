package ru.alta.metertokilometerconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText firstText;
    private EditText secondText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstText =findViewById(R.id.kilometersValue);
        secondText = findViewById(R.id.metersValue);
    }

    public void onToKilometersClick(View view) {
        float firstValue = Float.parseFloat(firstText.getText().toString());
        Converter converter = new Converter(firstValue);
        float resultValue = converter.Convert(new ConvertToKilometers()).GetResult();
        secondText.setText(String.format("%.02f", resultValue));
    }

    public void onToMetersClick(View view) {
        float firstValue = Float.parseFloat(secondText.getText().toString());
        Converter converter = new Converter(firstValue);
        float resultValue = converter.Convert(new ConvertToMeters()).GetResult();
        firstText.setText(String.format("%.02f", resultValue));
    }

}
