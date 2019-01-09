package com.noobcoded.uas.service;

import com.noobcoded.uas.model.DetailModel;
import com.noobcoded.uas.model.NowPlayingModel;
import com.noobcoded.uas.model.SearchModel;
import com.noobcoded.uas.model.UpcomingModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by noobcoded on 1/7/2019.
 */

public interface APIHub {

    @GET("movie/now_playing")
    Call<NowPlayingModel> getNowPlayingMovie(@Query("language") String language);

    @GET("movie/{movie_id}")
    Call<DetailModel> getDetailMovie(@Path("movie_id") String movie_id, @Query("language") String language);

    @GET("movie/upcoming")
    Call<UpcomingModel> getUpcomingMovie(@Query("language") String language);

    @GET("search/movie")
    Call<SearchModel> getSearchMovie(@Query("query") String query, @Query("language") String language);
}
