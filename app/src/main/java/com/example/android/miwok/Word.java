package com.example.android.miwok;

public class Word {

    private String mDefaultTraslation;

    private String mMiwokTraslation;

    private Integer mImageResourceID;

    public Word(String defaultTranslation, String miwokTranslation){

        mDefaultTraslation = defaultTranslation;
        mMiwokTraslation = miwokTranslation;
    }

    public Word(String defaultTraslation, String miwokTraslation, int imageResourceID) {

        mDefaultTraslation = defaultTraslation;
        mMiwokTraslation = miwokTraslation;
        mImageResourceID = imageResourceID;
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
