package com.example.android.miwok;

public class Word {

    private String mDefaultTraslation;

    private String mMiwokTraslation;

    public Word(String defaultTraslation, String miwokTraslation){

        mDefaultTraslation = defaultTraslation;
        mMiwokTraslation = miwokTraslation;
    }

    public String getDefaultTraslation(){
        return mDefaultTraslation;
    }

    public String getMiwokTraslation(){
        return mMiwokTraslation;
    }
}
