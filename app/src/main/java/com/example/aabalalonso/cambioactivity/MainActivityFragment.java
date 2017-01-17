package com.example.aabalalonso.cambioactivity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View vista =inflater.inflate(R.layout.fragment_main, container, false);
        Button botonNext = (Button)vista.findViewById(R.id.boton_next);
        botonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Main2Activity.class);
                startActivity(i);
            }
        });



        return vista;

    }
}
