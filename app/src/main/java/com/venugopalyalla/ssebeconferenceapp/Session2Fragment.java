package com.venugopalyalla.ssebeconferenceapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by user on 12/31/15.
 */
public class Session2Fragment extends Fragment{

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.session_2_fragment, container, false);
        Button session1 = (Button) myView.findViewById(R.id.safety_pvts_btn);
        session1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Safety in Pavements");
            }
        });
        Button session2 = (Button) myView.findViewById(R.id.hfst_btn);
        session2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("High Friction Surface Treatment (HFST) Installation and " +
                        "Constructability");
            }
        });
        Button session3 = (Button) myView.findViewById(R.id.road_safety_btn);
        session3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("MCDOT Road Safety Management Program");
            }
        });
        Button session4 = (Button) myView.findViewById(R.id.road_surface_btn);
        session4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Road Surface Characteristics and Accidents");
            }
        });
        return myView;
    }
    public void btnClickFunction(String str) {
        EventPage ldf = new EventPage ();
        Bundle args = new Bundle();
        args.putString("EventName", str);
        args.putString("user", getArguments().getString("user"));
        ldf.setArguments(args);
        getFragmentManager().beginTransaction().replace(R.id.content_frame, ldf).commit();
    }
}
