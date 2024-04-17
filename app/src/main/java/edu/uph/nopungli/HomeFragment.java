package edu.uph.nopungli;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeFragment extends Fragment {
    ImageButton gotoInbox, gotoTopup, gotoTransfer, gotoJuru, gotoMap, gotoHistory;
    FloatingActionButton gotoReport;

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
                Intent intent = new Intent(getActivity(), Inbox.class);
                startActivity(intent);
            }
        });

        return view;
    }
}