package com.example.android.miwok;

/**
 * Created by enach on 8/27/2017.
 */

public class ReportCard {

    private String mName;
    private int mEnglishGrade;
    private int mChemistryGrade;
    private int mMathGrade;
    private int mHistoryGrade;
    private int mPhysicsGrade;

    public ReportCard(String name, int english, int chemistry, int math, int history, int physics){
        mName = name;
        mEnglishGrade = english;
        mChemistryGrade = chemistry;
        mMathGrade = math;
        mHistoryGrade = history;
        mPhysicsGrade = physics;
    }

    public String getName(){
        return mName;
    }

    public void setName(String name){
        mName = name;
    }

    public int getEnglishGrade(){
        return mEnglishGrade;
    }

    public void setEnglishGrade(int english){
        mEnglishGrade = english;
    }

    public int getChemistryGrade(){
        return mChemistryGrade;
    }

    public void setChemistryGrade(int chemistry){
        mChemistryGrade = chemistry;
    }

    public int getMathGrade(){
        return mMathGrade;
    }

    public void setMathGrade(int math){
        mMathGrade = math;
    }

    public int getHistoryGrade(){
        return mHistoryGrade;
    }

    public void setHistoryGrade(int history){
        mHistoryGrade = history;
    }

    public int getPhysicsGrade(){
        return mPhysicsGrade;
    }

    public void setPhysicsGrade(int physics){
        mPhysicsGrade = physics;
    }


    @Override
    public String toString(){
        return "Name: " + getName() + ";" +
                "\nEnglish Grade = " + getEnglishGrade() + ";" +
                "\nChemistry Grade = " + getChemistryGrade() + ";" +
                "\nMath Grade = " + getMathGrade() + ";" +
                "\nHistory Grade = " + getHistoryGrade() + ";" +
                "\nPhysics Grade = " + getPhysicsGrade() + ";";
    }
}
