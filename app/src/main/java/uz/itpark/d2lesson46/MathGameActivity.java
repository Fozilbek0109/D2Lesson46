package uz.itpark.d2lesson46;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MathGameActivity extends AppCompatActivity {
    private TextView txt_amal, num1, num2;
    private EditText editText;
    private Button btn_check;

    private Random random = new Random();
    private int realResult;
    private String myresult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_game);
        setUi();
        startGame();


        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myresult = editText.getText().toString();
                    if (myresult.equalsIgnoreCase(String.valueOf(realResult))) {
                        Toast.makeText(MathGameActivity.this, "Barakalla", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(MathGameActivity.this, "2 - chi", Toast.LENGTH_SHORT).show();
                    }
                    startGame();
                    editText.setText("");

            }
        });

    }

    private void startGame() {
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int c = random.nextInt(4);

        num1.setText(String.valueOf(a));
        num2.setText(String.valueOf(b==0?b++:b)); //ternary

        switch (c){
            case 0:
                txt_amal.setText("+");
                realResult = a + b;
                break;
            case 1:
                txt_amal.setText("-");
                realResult = a - b;
                break;
            case 2:
                txt_amal.setText("*");
                realResult = a * b;
                break;
            case 3:
                txt_amal.setText("/");
                realResult = a / b;
                break;

        }

    }

    private void setUi() {
        btn_check=findViewById(R.id.btn_check);
        editText = findViewById(R.id.edit_text);
        txt_amal = findViewById(R.id.amal_txt);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
    }
}