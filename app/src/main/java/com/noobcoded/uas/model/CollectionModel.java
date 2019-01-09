package com.noobcoded.uas.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class CollectionModel {

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    @SerializedName("poster_path")
    private String posterPath;

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

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

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getPosterPath() {
        return posterPath;
    }

    @Override
    public String toString() {
        return
                "CollectionModel{" +
                        "backdrop_path = '" + backdropPath + '\'' +
                        ",name = '" + name + '\'' +
                        ",id = '" + id + '\'' +
                        ",poster_path = '" + posterPath + '\'' +
                        "}";
    }
}
