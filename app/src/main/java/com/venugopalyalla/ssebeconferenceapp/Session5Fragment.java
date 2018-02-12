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
public class Session5Fragment extends Fragment{

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.session_5_fragment, container, false);
        Button session1 = (Button) myView.findViewById(R.id.economics_btn);
        session1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Economics of Binders");
            }
        });
        Button session2 = (Button) myView.findViewById(R.id.asphalt_binders_btn);
        session2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Asphalt binders - supply, availability, pricing, market situation");
            }
        });
        Button session3 = (Button) myView.findViewById(R.id.fly_ash_btn);
        session3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Updates on the Future for Fly Ash");
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
