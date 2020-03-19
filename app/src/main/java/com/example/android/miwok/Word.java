package com.example.android.miwok;

public class Word {

    private String mDefaultTraslation;

    private String mMiwokTraslation;

    public Word(String defaultTranslation, String miwokTranslation){

        mDefaultTraslation = defaultTranslation;
        mMiwokTraslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTraslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTraslation;
    }
}
