package edu.uph.nopungli;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Transfer extends AppCompatActivity {
    ImageButton gotoHome;
    LinearLayout gotoTransfer1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        gotoHome = (ImageButton) findViewById(R.id.btnBekTf);
        gotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Transfer.this, Home.class);
                startActivity(intent);
            }
        });

        gotoTransfer1 = (LinearLayout) findViewById(R.id.btnTransfer);
        gotoTransfer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Transfer.this, Transfer1.class);
                startActivity(intent);
            }
        });
    }
}