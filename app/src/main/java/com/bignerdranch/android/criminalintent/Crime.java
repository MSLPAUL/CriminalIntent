package com.bignerdranch.android.criminalintent;

import java.util.UUID;
import java.util.Date;
/**
 * Created by 1500185 on 2017. 6. 13..
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        // 겹치지않고 유니크한 아이디 부여
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mData) {
        this.mDate = mData;
    }

    public boolean isSolved(){
        return mSolved;
    }

    public void setSolved(boolean solved){
        mSolved = solved;
    }
}
