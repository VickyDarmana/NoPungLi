package edu.uph.nopungli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Transfer1 extends AppCompatActivity {
    ImageButton gotoTf;
    Button gotoTf2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer1);

        gotoTf = (ImageButton) findViewById(R.id.btnBekTf1);
        gotoTf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Transfer1.this, Transfer.class);
                startActivity(intent);
            }
        });

        gotoTf2 = (Button) findViewById(R.id.btnTransfer);
        gotoTf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Transfer1.this, Transfer2.class);
                startActivity(intent);
            }
        });
    }
}