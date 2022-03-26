package com.example.newfragment_task2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    TextView details;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,container, false);

        details = view.findViewById(R.id.details);

        Bundle bundle = this.getArguments();
        details.setText("Name :" +bundle.getString("username")
                + "\nMobile :" + bundle.getString("usermobile"));
        return view;
    }
}
