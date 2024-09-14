package com.nazira.class204;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edBuy,edSell;
    Button buttonCalculate;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edBuy = findViewById(R.id.edBuy);
        edSell = findViewById(R.id.edSell);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        tvDisplay = findViewById(R.id.tvDisplay);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float byPrice,sellPrice,profit,profitPercent;

                byPrice = Float.parseFloat(edBuy.getText().toString());
                sellPrice = Float.parseFloat(edSell.getText().toString());
                profit = sellPrice-byPrice;
                profitPercent = profit/byPrice*100;


                tvDisplay.setText("Profit is: "+profit+"\nProfit % is:"+profitPercent+"%");
            }
        });

    }
}