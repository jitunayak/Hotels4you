package in.hotels4you.www.hotels4you.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import in.hotels4you.www.hotels4you.MainActivity;
import in.hotels4you.www.hotels4you.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Hotels extends Fragment {


    public Hotels() {
        // Required empty public constructor
    }


    ImageView imageView;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hotels, container, false);
        imageView = v.findViewById(R.id.recycler_imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }

}
