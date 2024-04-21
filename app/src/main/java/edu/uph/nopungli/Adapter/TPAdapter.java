package edu.uph.nopungli.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

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

    private static class MyViewHolder {
        ImageView gambarJuru;
        TextView txtNamaJuru, txtDaerahJuru, txtDeskripsiJuru;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DataTP dataTP = getItem(position);
        final View result;

        MyViewHolder myViewHolder;

        if (convertView == null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.data_list_layout, parent, false);

            myViewHolder.gambarJuru = (ImageView) convertView.findViewById(R.id.gambarJuru);
            myViewHolder.txtNamaJuru = (TextView) convertView.findViewById(R.id.txtNamaJuru);
            myViewHolder.txtDaerahJuru = (TextView) convertView.findViewById(R.id.txtDaerahJuru);
            myViewHolder.txtDeskripsiJuru = (TextView) convertView.findViewById(R.id.txtDeskripsiJuru);

            convertView.setTag(myViewHolder);
        }
        else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        result = convertView;

        myViewHolder.gambarJuru.setImageResource(dataTP.getGambarJuru());
        myViewHolder.txtNamaJuru.setText(dataTP.getNamaJuru());
        myViewHolder.txtDaerahJuru.setText("Daerah: Jln. " + dataTP.getDaerahJuru());
        myViewHolder.txtDeskripsiJuru.setText("Deskripsi: Telah menjadi " +dataTP.getDesJuru());

        return result;
    }


}
