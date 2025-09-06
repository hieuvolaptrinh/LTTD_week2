package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //khai báo các giao diện ở đây
    EditText tF, tC;
    Button btnCtoF, btnFtoC, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//        ánh xạ các giao diện => nghĩa là kết nối các cái biến đế các cái componenet trong giao diện kéo thả
        tF = findViewById(R.id.tF);
        tC = findViewById(R.id.tC);
        btnCtoF = findViewById(R.id.toF);
        btnFtoC = findViewById(R.id.toC);
        btnReset = findViewById(R.id.clear);

        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double c = Integer.parseInt(tC.getText().toString());
                Double F= (9.0/5)*c + 32;
                tF.setText(F.toString());

            }

        });
        btnFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double f = Integer.parseInt(tF.getText().toString());
                Double C= (5.0/9)*(f-32);
                tC.setText(C.toString());
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tC.setText("");
                tF.setText("");
            }
        });
    }
}