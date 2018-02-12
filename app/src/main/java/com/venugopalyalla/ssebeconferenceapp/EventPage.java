package com.venugopalyalla.ssebeconferenceapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Venugopal Yalla on 12-09-2017.
 */
public class EventPage extends Fragment {

    View myView;
    Button but;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.activity_event_page, container, false);
        String value = getArguments().getString("EventName");
        TextView tv = (TextView) myView.findViewById(R.id.eventname);
        tv.setText(value);
        but = (Button) myView.findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                ThankYouFragment ldf = new ThankYouFragment ();
                getFragmentManager().beginTransaction().replace(R.id.content_frame, ldf).commit();
            }
        });
        return myView;
    }
}
