package com.example.newfragment_task2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText nameEdit,mobileEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.submitBtn);
        nameEdit = findViewById(R.id.nameEdit);
        mobileEdit = findViewById(R.id.mobileEdit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDataFragment();
            }
        });

    }

    private void sendDataFragment(){
        String name, mobile = "";

        name = nameEdit.getText().toString();
        mobile = mobileEdit.getText().toString();

        Fragment frag = new FragmentOne();

        Bundle bundle = new Bundle();

        bundle.putString("username",name);
        bundle.putString("usermobile",mobile);
        frag.setArguments(bundle);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container,frag).commit();
    }

}

