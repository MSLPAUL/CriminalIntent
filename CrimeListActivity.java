package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by 1500185 on 2017. 6. 14..
 */

public class CrimeListActivity extends SingleFragmentActivity {
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
