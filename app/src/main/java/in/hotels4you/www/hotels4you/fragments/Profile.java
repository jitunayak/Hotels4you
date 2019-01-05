package in.hotels4you.www.hotels4you.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import in.hotels4you.www.hotels4you.OtpActivity;
import in.hotels4you.www.hotels4you.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Profile extends Fragment {


    public Profile() {
        // Required empty public constructor
    }


    Button logout_btn;
    FirebaseAuth myAuth;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_profile, container, false);

        myAuth = FirebaseAuth.getInstance();
        logout_btn = v.findViewById(R.id.logOutBtn);
        logout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             myAuth.signOut();
                Intent intent = new Intent(getActivity().getApplicationContext(), OtpActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return v;
    }

}
