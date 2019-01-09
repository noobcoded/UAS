package com.noobcoded.uas.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class NowPlayingModel {

    @SerializedName("dates")
    private DateModel dates;

    @SerializedName("page")
    private int page;

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("results")
    private List<ItemResultModel> results;

    @SerializedName("total_results")
    private int totalResults;

    public void setDates(DateModel dates) {
        this.dates = dates;
    }

    public DateModel getDates() {
        return dates;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setResults(List<ItemResultModel> results) {
        this.results = results;
    }

    public List<ItemResultModel> getResults() {
        return results;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalResults() {
        return totalResults;
    }

    @Override
    public String toString() {
        return
                "NowPlayingModel{" +
                        "dates = '" + dates + '\'' +
                        ",page = '" + page + '\'' +
                        ",total_pages = '" + totalPages + '\'' +
                        ",results = '" + results + '\'' +
                        ",total_results = '" + totalResults + '\'' +
                        "}";
    }
}
