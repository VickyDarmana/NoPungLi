package edu.uph.nopungli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Topup2 extends AppCompatActivity {
    Button gotoHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topup2);

        gotoHome = (Button) findViewById(R.id.btnTopupDone);
        gotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Topup2.this, Home.class);
                startActivity(intent);
            }
        });
    }
}