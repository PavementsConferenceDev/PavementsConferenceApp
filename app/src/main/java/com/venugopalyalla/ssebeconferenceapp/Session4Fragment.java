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
public class Session4Fragment extends Fragment{

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.session_4_fragment, container, false);
        Button session1 = (Button) myView.findViewById(R.id.cold_weather_btn);
        session1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Cold Weather Maintenance");
            }
        });
        Button session2 = (Button) myView.findViewById(R.id.winter_highway_btn);
        session2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Winter highway maintenance in Northern Arizona");
            }
        });
        Button session3 = (Button) myView.findViewById(R.id.foundation_quality_btn);
        session3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Pavement Foundation Quality Assurance Opportunities");
            }
        });
        Button session4 = (Button) myView.findViewById(R.id.city_flagstaff_btn);
        session4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("City of Flagstaff: City perspective on Cold Weather Maintenance");
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
