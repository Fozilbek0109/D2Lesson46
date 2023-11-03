package uz.itpark.d2lesson46;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
         btn1 = findViewById(R.id.btn_tasdiq1);
         btn2 = findViewById(R.id.btn_tasdiq2);
         btn3 = findViewById(R.id.btn_tasdiq3);
         btn4 = findViewById(R.id.btn_tasdiq4);
         btn5 = findViewById(R.id.btn_tasdiq5);
    }

    public void click(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btn_tasdiq1:
                Toast.makeText(this, "1 bosildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_tasdiq2:
                Toast.makeText(this, "2 bosildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_tasdiq3:
                Toast.makeText(this, "3 bosildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_tasdiq4:
                Toast.makeText(this, "4 bosildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_tasdiq5:
                Toast.makeText(this, "5 bosildi", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}