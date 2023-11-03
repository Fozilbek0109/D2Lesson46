package uz.itpark.d2lesson46;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        LinearLayout linearLayout = findViewById(R.id.container1);
        Button btn1 = findViewById(R.id.btn_tasdiq1);
        Button btn2 = findViewById(R.id.btn_tasdiq2);
        Button btn3 = findViewById(R.id.btn_tasdiq3);
        Button btn4 = findViewById(R.id.btn_tasdiq4);
        Button btn5 = findViewById(R.id.btn_tasdiq5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Button 1 bosildi", Toast.LENGTH_SHORT).show();
                    linearLayout.setBackgroundColor(Color.YELLOW);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Button 2 bosildi", Toast.LENGTH_SHORT).show();
                linearLayout.setBackgroundColor(Color.RED);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Button 3 bosildi", Toast.LENGTH_SHORT).show();
                linearLayout.setBackgroundColor(Color.GREEN);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Button 4 bosildi", Toast.LENGTH_SHORT).show();
                linearLayout.setBackgroundColor(Color.BLUE);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Button 5 bosildi", Toast.LENGTH_SHORT).show();
                linearLayout.setBackgroundColor(Color.GRAY);
            }
        });
    }
}