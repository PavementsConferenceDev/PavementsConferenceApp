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
public class Session6Fragment extends Fragment{

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.session_6_fragment, container, false);
        Button session1 = (Button) myView.findViewById(R.id.quality_utility_btn);
        session1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Maintaining Quality/Utility Cuts");
            }
        });
        Button session2 = (Button) myView.findViewById(R.id.pvt_manhole_btn);
        session2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Pavement and Manhole Ring and Cover Conditions Study");
            }
        });
        Button session3 = (Button) myView.findViewById(R.id.trenchless_tech_btn);
        session3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Trenchless Technology");
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
