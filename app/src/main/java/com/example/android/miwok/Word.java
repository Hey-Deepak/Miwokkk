package com.example.android.miwok;

public class Word {

    private String mDefaultTraslation;

    private String mMiwokTraslation;

    private int mAudioResourceId;

    private Integer mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){

        mDefaultTraslation = defaultTranslation;
        mMiwokTraslation = miwokTranslation;
        mAudioResourceId =  audioResourceId;
    }

    public Word(String defaultTraslation, String miwokTraslation, int imageResourceId, int audioResourceId) {

        mDefaultTraslation = defaultTraslation;
        mMiwokTraslation = miwokTraslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){

        return mDefaultTraslation;
    }

    public String getMiwokTranslation(){

        return mMiwokTraslation;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

    public int getAudioResourceId(){
        return  mAudioResourceId;
    }

}
