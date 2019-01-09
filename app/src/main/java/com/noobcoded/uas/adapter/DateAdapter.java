package com.noobcoded.uas.adapter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class DateAdapter {

    private static String formatDate(String date, String format) {
        String result = "";

        DateFormat old = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date oldDate = old.parse(date);
            DateFormat newFormat = new SimpleDateFormat(format);
            result = newFormat.format(oldDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static String getShortDate(String date) {
        return formatDate(date, "dd MMMM yyyy");
    }

    public static String getLongDate(String date) {
        return formatDate(date, "EEEE, MMM d, yyyy");
    }
}
