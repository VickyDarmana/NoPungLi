package edu.uph.nopungli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import edu.uph.nopungli.Adapter.TPAdapter;
import edu.uph.nopungli.Model.DataTP;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;


public class JuruParkir extends AppCompatActivity {

    ListView listview2;
    ArrayList<DataTP> dataTPArrayList;
    private static TPAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juru_parkir);

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
        simpanDataJuru("Udin", "Anggur, Kec. Medan Timur", R.drawable.tp1);
        simpanDataJuru("Andi", "Jeruk, Kec. Medan Barat", R.drawable.tp2);
        simpanDataJuru("Tono", "Apel, Kec. Medan Perjuangan", R.drawable.tp3);
        simpanDataJuru("Yanto", "Longan, Kec. Medan Kota", R.drawable.tp4);

        simpanDataJuru("Asep", "Durian, Kec. Medan Denai", R.drawable.tp5);
        simpanDataJuru("Agus", "Salak, Kec. Medan Deli", R.drawable.tp6);
        simpanDataJuru("Abeng", "Papaya, Kec. Medan Area", R.drawable.tp7);
        simpanDataJuru("Jamal", "Pear, Kec. Medan Marelan", R.drawable.tp8);
    }

    public void simpanDataJuru(String NamaJuru, String DaerahJuru, int gambarJuru) {
        Realm realm = Realm.getDefaultInstance();

        // Menyimpan Data
        realm.executeTransaction(realm1 -> {
            DataTP dataTP = realm1.createObject(DataTP.class);
            dataTP.setNamaJuru(NamaJuru);
            dataTP.setDaerahJuru(DaerahJuru);
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
