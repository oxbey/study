package com.company.studyClassNull;

public class Puzzle4b{
    public int ivar;
//    int input1;
    public int doStuff ( int factor){
        if ( ivar > 100){
            return ivar*factor;
        } else {
            return ivar*(5-factor);
        }
    }
}