package edu.uph.nopungli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Topup extends AppCompatActivity {
    LinearLayout gotoTopup1;
    ImageButton gotoHome;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topup);

        gotoTopup1 = findViewById(R.id.btnABC);
        gotoTopup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Topup.this, Topup1.class);
                startActivity(intent);
            }
        });

        gotoHome = findViewById(R.id.btnBekHome);
        gotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Topup.this, Home.class);
                startActivity(intent);
            }
        });
    }
}