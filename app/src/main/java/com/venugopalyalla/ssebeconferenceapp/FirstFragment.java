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
public class FirstFragment extends Fragment{

    View myView;
    Button but;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.first_layout, container, false);
        but = (Button) myView.findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                OpeningSessionFragment ldf = new OpeningSessionFragment ();
                getFragmentManager().beginTransaction().replace(R.id.content_frame, ldf).commit();
            }
        });
        return myView;
    }
}
