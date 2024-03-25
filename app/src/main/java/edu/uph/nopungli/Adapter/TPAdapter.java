package edu.uph.nopungli.Adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import edu.uph.nopungli.Model.DataTP;
import edu.uph.nopungli.R;

public class TPAdapter extends ArrayAdapter<DataTP> {
    private ArrayList<DataTP> dataTPArrayList;
    Context context;

    public TPAdapter(ArrayList<DataTP> dataTPArrayList, Context context) {
        super(context, R.layout.data_list_layout, dataTPArrayList);
        this.dataTPArrayList = dataTPArrayList;
        this.context = context;
    }
}
