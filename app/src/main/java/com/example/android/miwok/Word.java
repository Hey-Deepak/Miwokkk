package com.example.android.miwok;

public class Word {

    private String mDefaultTraslation;

    private String mMiwokTraslation;

    private Integer mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation){

        mDefaultTraslation = defaultTranslation;
        mMiwokTraslation = miwokTranslation;
    }

    public Word(String defaultTraslation, String miwokTraslation, int imageResourceId) {

        mDefaultTraslation = defaultTraslation;
        mMiwokTraslation = miwokTraslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation(){

        return mDefaultTraslation;
    }

    public String getMiwokTranslation(){

        return mMiwokTraslation;
    }

    public Integer getImageResourceId() {
        return mImageResourceId;
    }
}
