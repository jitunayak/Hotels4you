package in.hotels4you.www.hotels4you.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.hotels4you.www.hotels4you.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HelpLine extends Fragment {


    public HelpLine() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_help_line, container, false);
    }

}
