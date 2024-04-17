package edu.uph.nopungli;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class PayFragment extends Fragment {
    ImageButton gotoHome;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pay, container, false);

        gotoHome = (ImageButton) view.findViewById(R.id.btnBek);
        gotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment payFrag = new HomeFragment();
                FragmentTransaction pf = getActivity().getSupportFragmentManager().beginTransaction();
                pf.replace(R.id.container,payFrag).commit();
            }
        });
        return view;
    }
}