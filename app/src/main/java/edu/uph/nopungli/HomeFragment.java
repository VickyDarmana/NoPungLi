package edu.uph.nopungli;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeFragment extends Fragment {
    ImageButton gotoInbox, gotoTopup, gotoTransfer, gotoJuru, gotoMap, gotoHistory, gotoResult;
    FloatingActionButton gotoReport;
    LinearLayout gotoProfile;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        gotoMap = (ImageButton) view.findViewById(R.id.imgMap);
        gotoMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Map.class);
                startActivity(intent);
            }
        });

        gotoJuru  = (ImageButton)  view.findViewById(R.id.imgJuru);
        gotoJuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), JuruParkir.class);
                startActivity(intent);
            }
        });

        gotoInbox  = (ImageButton)  view.findViewById(R.id.imgInbox);
        gotoInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Notif.class);
                startActivity(intent);
            }
        });

        gotoTopup = (ImageButton) view.findViewById(R.id.imgTopup);
        gotoTopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Topup.class);
                startActivity(intent);
            }
        });

        gotoTransfer = (ImageButton) view.findViewById(R.id.imgTransfer);
        gotoTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Transfer.class);
                startActivity(intent);
            }
        });

        gotoHistory = (ImageButton) view.findViewById(R.id.imgHistory);
        gotoHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), History.class);
                startActivity(intent);
            }
        });

        gotoReport = (FloatingActionButton) view.findViewById(R.id.fabReport);
        gotoReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Report.class);
                startActivity(intent);
            }
        });

        gotoResult = (ImageButton) view.findViewById(R.id.imgResult);
        gotoResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Result.class);
                startActivity(intent);
            }
        });

        gotoProfile = (LinearLayout) view.findViewById(R.id.btnProfile);
        gotoProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment proFrag = new ProfileFragment();
                FragmentTransaction pf = getActivity().getSupportFragmentManager().beginTransaction();
                pf.replace(R.id.container, proFrag).commit();
            }
        });

        return view;
    }
}