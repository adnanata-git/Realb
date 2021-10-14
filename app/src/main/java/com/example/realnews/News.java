package com.example.realnews;

public class News {


        private String mTitle;
        private String mSectionName;
        private String mWebUrl;


    public News(String s, String title, String sectionName, String webUrl) {
        mTitle = title;
        mSectionName= sectionName;
        mWebUrl = webUrl;
    }


    public String getTitle() {
        return mTitle;
    }


    public String getSectionName() {
        return mSectionName;
    }


    public String getWebUrl() {
        return mWebUrl;
    }

}
