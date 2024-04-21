package edu.uph.nopungli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import edu.uph.nopungli.Model.DataReport;
import edu.uph.nopungli.Model.DataTP;
import io.realm.Realm;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;

public class Report extends AppCompatActivity {
    ImageButton gotoHome;
    EditText edtNama, edtNoTelp, edtKota, edtKecamatan, edtKeluhan;
    Button btnSubmit;
    String Nama ="";
    String NoTelp="";
    String Kota="";
    String Kecamatan="";
    String Keluhan="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        gotoHome = (ImageButton) findViewById(R.id.btnBekReport);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNoTelp = (EditText) findViewById(R.id.edtNoTelp);
        edtKota = (EditText) findViewById(R.id.edtKota);
        edtKecamatan = (EditText) findViewById(R.id.edtKecamatan);
        edtKeluhan = (EditText) findViewById(R.id.edtKeluhan);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        gotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Report.this, Home.class);
                startActivity(intent);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nama = (String) edtNama.getText().toString();
                NoTelp = (String) edtNoTelp.getText().toString();
                Kota = (String) edtKota.getText().toString();
                Kecamatan = (String) edtKecamatan.getText().toString();
                Keluhan = (String) edtKeluhan.getText().toString();
                Log.d("TAG","Nama" + Nama + "No.Telp" + NoTelp + "Kota" + Kota + "Kecamatan" + Kecamatan + "Keluhan" + Keluhan);
                tambahDataReport(Nama, NoTelp, Kota, Kecamatan, Keluhan);

                Intent intent = new Intent(Report.this, Result.class);
                startActivity(intent);
            }
        });
    }
    public void tambahDataReport(String Nama, String NoTelp, String Kota, String Kecamatan, String Keluhan) {
        Realm realm = Realm.getDefaultInstance();
        // Penyimpanan Data
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                    DataReport report1 = realm.createObject(DataReport.class);
                    report1.setNama(Nama);
                    report1.setNoTelp(NoTelp);
                    report1.setKota(Kota);
                    report1.setKecamatan(Kecamatan);
                    report1.setKeluhan(Keluhan);
            }
        });
    }
}