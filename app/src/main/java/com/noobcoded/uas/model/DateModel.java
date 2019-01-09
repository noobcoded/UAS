package com.noobcoded.uas.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class DateModel {

    @SerializedName("maximum")
    private String maximum;

    @SerializedName("minimum")
    private String minimum;

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public String getMinimum() {
        return minimum;
    }

    @Override
    public String toString() {
        return
                "DateModel{" +
                        "maximum = '" + maximum + '\'' +
                        ",minimum = '" + minimum + '\'' +
                        "}";
    }
}
