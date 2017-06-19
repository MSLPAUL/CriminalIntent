package com.bignerdranch.android.criminalintent;

import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by 1500185 on 2017. 6. 14..
 */

public class CrimeListActivity extends SingleFragmentActivity {
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
    }
}
