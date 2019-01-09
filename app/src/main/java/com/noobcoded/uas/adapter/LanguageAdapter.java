package com.noobcoded.uas.adapter;

import java.util.Locale;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class LanguageAdapter {

    public static String getCountry() {
        String country = Locale.getDefault().getCountry().toLowerCase();

        switch (country) {
            case "id":
                break;

            default:
                country = "en";
                break;
        }

        return country;
    }
}
