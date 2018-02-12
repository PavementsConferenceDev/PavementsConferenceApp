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
public class OpeningSessionFragment extends Fragment{

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.opening_session_fragment, container, false);
        Button openingsession = (Button) myView.findViewById(R.id.openingsessionbtn);
        openingsession.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Welcome to Arizona State University");
            }
        });
        Button adotagency = (Button) myView.findViewById(R.id.adotagencyissuesoverview);
        adotagency.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("ADOT Agency Issues Overview");
            }
        });
        Button federalhw = (Button) myView.findViewById(R.id.federalhighwayadministration);
        federalhw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Federal Highway Administration: Update on new administration, " +
                        "new initiatives, status of infrastructure bill");
            }
        });
        Button mcdot = (Button) myView.findViewById(R.id.mcdotprovidingconns);
        mcdot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("MCDOT: Providing Connections - An Innovative Look at our Future");
            }
        });
        Button ethics = (Button) myView.findViewById(R.id.ethicspracticalguide);
        ethics.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Ethics: A Practical Guide to Doing Right");
            }
        });
        return myView;
    }
    public void btnClickFunction(String str) {
        EventPage ldf = new EventPage ();
        Bundle args = new Bundle();
        args.putString("EventName", str);
        ldf.setArguments(args);
        getFragmentManager().beginTransaction().replace(R.id.content_frame, ldf).commit();
    }
}
