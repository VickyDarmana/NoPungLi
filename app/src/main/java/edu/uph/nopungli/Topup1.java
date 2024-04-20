package edu.uph.nopungli;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Topup1 extends AppCompatActivity {
    ImageButton gotoTopup;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topup1);

        gotoTopup = findViewById(R.id.btnBekTop);
        gotoTopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Topup1.this, Topup.class);
                startActivity(intent);
            }
        });

    }
}