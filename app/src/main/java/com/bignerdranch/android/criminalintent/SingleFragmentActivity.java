package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 1500185 on 2017. 6. 14..
 */

public abstract class SingleFragmentActivity extends AppCompatActivity{

    protected abstract Fragment createFragment();

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment); // Fragment를 엑티비티위에 띄운다.

        FragmentManager fm = getSupportFragmentManager();
        // fragment layout 가져오기
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = createFragment(); // here is the connection between the activity and the fragment
            // fragment transaction starts
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
