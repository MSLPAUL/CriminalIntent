package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by 1500185 on 2017. 6. 14..
 */

public abstract class SingleFragmentActivity extends FragmentActivity{

    protected abstract Fragment createFragment();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = createFragment(); // here is the connection between the activity and the fragment
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

}
