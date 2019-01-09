package com.noobcoded.uas.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class ItemGenreModel {

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "ItemGenreModel{" +
                        "name = '" + name + '\'' +
                        ",id = '" + id + '\'' +
                        "}";
    }
}
