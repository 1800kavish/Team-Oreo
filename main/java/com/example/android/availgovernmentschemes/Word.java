package com.example.android.availgovernmentschemes;

public class Word {
    @Override
    public String toString() {
        return "Word{" +
                "mTextCategory='" + mTextCategory + '\'' +
                ", mImageResourceId=" + mImageResourceId +'}';
    }

    private String mTextCategory;
    private int mImageResourceId;

    private static final int neverImage = -1;
    public Word(String textCategory, int imageResourceId){
        mTextCategory = textCategory;

        mImageResourceId = imageResourceId;
   }
    public String getTextCategory(){return mTextCategory;}
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != neverImage;
    }

}