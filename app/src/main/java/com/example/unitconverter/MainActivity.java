package com.example.unitconverter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private  TextView text;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
            button=findViewById(R.id.button2);
            text=findViewById(R.id.textView);
            editText=findViewById(R.id.editTextText);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(MainActivity.this, "Hi my click listener worked", Toast.LENGTH_SHORT).show();
                    String s=editText.getText().toString();
                    int kg=Integer.parseInt(s);
                    double pound=kg*2.205;
                    text.setText("The corresponding value in pounds is"+pound);

            }


        });
    }
}