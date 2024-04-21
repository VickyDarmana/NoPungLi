package edu.uph.nopungli.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import edu.uph.nopungli.Model.DataReport;
import edu.uph.nopungli.Model.DataTP;
import edu.uph.nopungli.R;

public class ReportAdapter extends ArrayAdapter<DataReport> {
    private ArrayList<DataReport> dataReportArrayList;
    Context context;
    public ReportAdapter(ArrayList<DataReport> dataReportArrayList, Context context) {
        super(context, R.layout.activity_report, dataReportArrayList);
        this.dataReportArrayList = dataReportArrayList;
        this.context = context;
    }

    private static class MyViewHolder1{
        EditText edtNama, edtNoTelp, edtKota, edtKecamatan, edtKeluhan;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DataReport dataReport = getItem(position);
        final View result;

        MyViewHolder1 myViewHolder1;

        if (convertView == null) {
            myViewHolder1 = new MyViewHolder1();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activity_report, parent, false);

            myViewHolder1.edtNama = (EditText) convertView.findViewById(R.id.edtNama);
            myViewHolder1.edtNoTelp = (EditText) convertView.findViewById(R.id.edtNoTelp);
            myViewHolder1.edtKota = (EditText) convertView.findViewById(R.id.edtKota);
            myViewHolder1.edtKecamatan = (EditText) convertView.findViewById(R.id.edtKecamatan);
            myViewHolder1.edtKeluhan = (EditText) convertView.findViewById(R.id.edtKeluhan);

            convertView.setTag(myViewHolder1);
        }
        else {
            myViewHolder1 = (ReportAdapter.MyViewHolder1) convertView.getTag();
        }
        result = convertView;

        myViewHolder1.edtNama.setText(dataReport.getNama());
        myViewHolder1.edtNoTelp.setText(dataReport.getNoTelp());
        myViewHolder1.edtKota.setText(dataReport.getKota());
        myViewHolder1.edtKecamatan.setText(dataReport.getKecamatan());
        myViewHolder1.edtKeluhan.setText(dataReport.getKeluhan());

        return result;

    }
}
