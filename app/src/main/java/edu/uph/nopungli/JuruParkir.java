package edu.uph.nopungli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import edu.uph.nopungli.Adapter.TPAdapter;
import edu.uph.nopungli.Model.DataTP;

public class JuruParkir extends AppCompatActivity {

    ListView listview;
    ArrayList<DataTP> dataTPArrayList;
    private static TPAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juru_parkir);

        listview.findViewById(R.id.listview);
        dataTPArrayList = new ArrayList<>();


        adapter = new TPAdapter(dataTPArrayList, getApplicationContext());
        listview.setAdapter(adapter);
    }
}