package com.example.inf04czerwiec2021;

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

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button submitButton =findViewById(R.id.button);
        submitButton.setOnClickListener(v -> Submited() );

        }
        public void Submited(){
            TextView text =(TextView)findViewById(R.id.textView6);
            EditText imejl = findViewById(R.id.editTextTextEmailAddress);
            String elejl = imejl.getText().toString();

            EditText pas1 = findViewById(R.id.editTextTextPassword);
            String pasword1 = pas1.getText().toString();
            EditText pas2 = findViewById(R.id.editTextTextPassword2);
            String pasword2 = pas2.getText().toString();

            if(elejl.contains("@") && elejl.contains(".")){
                if(pasword1.equals(pasword2)){
                    text.setText("Witaj "+elejl);
                }else{
                    text.setText("hasla muszą być takie same");
                }
            }else{
                text.setText("Email niepoprawny");
            }

        }


}