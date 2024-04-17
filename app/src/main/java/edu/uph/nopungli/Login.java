package edu.uph.nopungli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.annotations.Required;

public class Login extends AppCompatActivity {
    Button btnLogin;
    @Required
    EditText editTextName;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextName = findViewById(R.id.edtTextName);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new HomeFragment();
                FragmentTransaction homeFrag = getSupportFragmentManager().beginTransaction();
                homeFrag.replace(R.id.container,fragment).commit();

                showToast();
            };
        });
    }

    public void showToast() {
        String nama = editTextName.getText().toString();

        String message = "Halo, Selamat Datang ke NoPungLi: " + nama;

        Toast toast = Toast.makeText(Login.this, message, Toast.LENGTH_SHORT);
        View toastView = toast.getView();

        toastView.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        toast.show();

    }
}