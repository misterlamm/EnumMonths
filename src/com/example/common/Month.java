package com.example.common;


/**
 * Created by alamm7 on 7/25/17.
 */
public enum Month {



    JANUARY("january"),
    FEBRUARY("february"),
    MARCH("march"),
    APRIL("april"),
    MAY("may"),
    JUNE("june"),
    JULY("july"),
    AUGUST("august"),
    SEPTEMBER("september"),
    OCTOBER("october"),
    NOVEMBER("november"),
    DECEMBER("december");


    private String englishName;

    Month(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishName() {
        return this.englishName;
    }
}





