package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by 1500185 on 2017. 6. 14..
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context){
        if(sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            Crime cr = new Crime();
            cr.setmTitle("Crime Number: " + i);
            cr.setSolved(i % 2 == 0); // randomly pick for now
            mCrimes.add(cr);
        }
    }

    public List<Crime> getCrimes(){

        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for(Crime crime : mCrimes)
            if(crime.getmId().equals(id))
                return crime;
        return null;
    }
}
