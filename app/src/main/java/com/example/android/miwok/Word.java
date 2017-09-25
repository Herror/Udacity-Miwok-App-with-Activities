package com.example.android.miwok;

import android.media.MediaPlayer;

/**
 * Created by enach on 8/6/2017.
 */

public class Word {
    //Default translation for the word
    private String mMiwokTranslation;
    //Miwok translation for the word
    private String mDefaultTranslation;
    //Image associated with each word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mSoundResourceId;

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }

    /**
     *Constructor specific for the Phrases activity
     */

    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId){
        /**
         * Default translation for the word
         */
        mDefaultTranslation = defaultTranslation;

        /**
         * Miwok translation for the word
         */
        mMiwokTranslation = miwokTranslation;

        mSoundResourceId = soundResourceId;
    }

    /**Create a second constructor that uses the Image also, as the Phrases activity
     * doesn't use an Image
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId){
        /**
         * Default translation for the word
         */
        mDefaultTranslation = defaultTranslation;

        /**
         * Miwok translation for the word
         */
        mMiwokTranslation = miwokTranslation;

        /**
         * Image associated with each word
         */
        mImageResourceId = imageResourceId;

        mSoundResourceId = soundResourceId;
    }


    /**
     *Get the default translation
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     *Get the Miwok translation
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }

}
