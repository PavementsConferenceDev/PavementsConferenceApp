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
public class Session3Fragment extends Fragment{

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.session_3_fragment, container, false);
        Button session1 = (Button) myView.findViewById(R.id.rec_materials_btn);
        session1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Recycled Materials");
            }
        });
        Button session2 = (Button) myView.findViewById(R.id.cold_rec_btn);
        session2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Cold Recycling within ADOT: lessons learned and future implementation");
            }
        });
        Button session3 = (Button) myView.findViewById(R.id.use_of_rcm_btn);
        session3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Use of RCM/CCA in Base/Sub-Base Applications");
            }
        });
        Button session4 = (Button) myView.findViewById(R.id.feasibility_btn);
        session4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btnClickFunction("Feasibility of using Recycled Asphalt Pavement(RAP) in Phoenix");
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
