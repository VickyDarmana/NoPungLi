package edu.uph.nopungli;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

import edu.uph.nopungli.Adapter.TPAdapter;
import edu.uph.nopungli.Model.DataTP;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;


public class JuruParkir extends AppCompatActivity {
    ImageButton gotoHome;
    ListView listview2;
    ArrayList<DataTP> dataTPArrayList;
    private static TPAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juru_parkir);

        gotoHome = findViewById(R.id.btnBackJuru);
        gotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JuruParkir.this, Home.class);
                startActivity(intent);
            }
        });

        initRealm();


        listview2 = (ListView) findViewById(R.id.listview2);
        dataTPArrayList = new ArrayList<>();
        dataTPArrayList = getAllDataTP();

        adapter = new TPAdapter(dataTPArrayList, getApplicationContext());
        listview2.setAdapter(adapter);

    }

    public void initRealm(){
        // Konfigurasi Realm

        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .allowWritesOnUiThread(true)
                .build();
        Realm.setDefaultConfiguration(config);

        clearAllDataJuru();

        // Init Data
        simpanDataJuru("Udin", "Anggur, Kec. Medan Timur", "juru parkir resmi selama 1 tahun", R.drawable.juruparkir);
        simpanDataJuru("Andi", "Jeruk, Kec. Medan Barat", "juru parkir resmi selama 8 bulan", R.drawable.juruparkir);
        simpanDataJuru("Tono", "Apel, Kec. Medan Perjuangan", "juru parkir resmi selam 2 tahun", R.drawable.juruparkir);
        simpanDataJuru("Yanto", "Longan, Kec. Medan Kota", "juru perkir resmi selama 5 bulan", R.drawable.juruparkir);

        simpanDataJuru("Asep", "Durian, Kec. Medan Denai", "juru parkir resmi selama 1 bulan", R.drawable.juruparkir);
        simpanDataJuru("Agus", "Salak, Kec. Medan Deli", "juru parkir resmi selama 10 bulan", R.drawable.juruparkir);
        simpanDataJuru("Abeng", "Papaya, Kec. Medan Area", "juru parkir resmi selama 2 tahun", R.drawable.juruparkir);
        simpanDataJuru("Jamal", "Pear, Kec. Medan Kota", "juru parkie resmi selama 1.5 tahun", R.drawable.juruparkir);
    }

    public void simpanDataJuru(String NamaJuru, String DaerahJuru, String DesJuru , int gambarJuru) {
        Realm realm = Realm.getDefaultInstance();

        // Menyimpan Data
        realm.executeTransaction(realm1 -> {
            DataTP dataTP = realm1.createObject(DataTP.class);
            dataTP.setNamaJuru(NamaJuru);
            dataTP.setDaerahJuru(DaerahJuru);
            dataTP.setDesJuru(DesJuru);
            dataTP.setGambarJuru(gambarJuru);
        });

        // Tutup koneksi ke database
        realm.close();
    }

    public ArrayList<DataTP> getAllDataTP() {
        Realm realm = Realm.getDefaultInstance();
        RealmResults<DataTP> juru = realm.where(DataTP.class).findAll();
        ArrayList<DataTP> juruList = new ArrayList<>(juru);
        return juruList;
    }

    public void clearAllDataJuru() {
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.deleteAll();
        realm.commitTransaction();
        realm.close();
    }
}
