package com.example.android.miwok;

public class Word {

    private String mDefaultTraslation;

    private String mMiwokTraslation;

    private Integer mImageResourceID;

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

    public Integer getImageResourceID() {
        return mImageResourceID;
    }
}
