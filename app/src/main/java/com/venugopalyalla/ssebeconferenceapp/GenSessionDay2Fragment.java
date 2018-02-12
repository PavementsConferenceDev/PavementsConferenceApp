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
public class GenSessionDay2Fragment extends Fragment{

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.gen_session_day2_fragment, container, false);
        Button session1 = (Button) myView.findViewById(R.id.inv_cm_btn);
        session1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Innovations in concrete materials");
            }
        });
        Button session2 = (Button) myView.findViewById(R.id.strong_carbon_btn);
        session2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Super strong carbon fiber composites for use in bridge " +
                        "structural enhancements");
            }
        });
        Button session3 = (Button) myView.findViewById(R.id.perf_mixes_btn);
        session3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Performance Engineered mixes");
            }
        });
        Button session4 = (Button) myView.findViewById(R.id.ultra_high_perf_btn);
        session4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Ultra high performance concrete materials");
            }
        });
        Button session5 = (Button) myView.findViewById(R.id.fhwa_mobile_btn);
        session5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("The FHWA Mobile Concrete trailer - Bringing new technologies " +
                        "to your doorstep");
            }
        });
        Button session6 = (Button) myView.findViewById(R.id.fhwa_mobile_btn);
        session6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Autonomous Vehicle technologies and the Future of Transportation");
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
