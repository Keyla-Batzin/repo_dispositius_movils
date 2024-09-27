package com.example.test_20_09_24;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mybutton;
    private TextView mytext;

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); mybutton=(Button)findViewById(R.id.button);

        mytext=(TextView)findViewById(R.id.textView);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                mytext.setText("Has clickat: "+ contador + " vegades");
            } });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets)-> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}