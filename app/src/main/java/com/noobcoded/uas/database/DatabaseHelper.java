package com.noobcoded.uas.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by noobcoded on 1/7/2019.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static int DATABASE_VERSION = 1;
    public static String DATABASE_NAME = "the_movie_db";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE_MOVIE = "create table " + FavoriteColumn.TABLE_NAME + " (" +
                FavoriteColumn.COLUMN_ID + " integer primary key autoincrement, " +
                FavoriteColumn.COLUMN_TITLE + " text not null, " +
                FavoriteColumn.COLUMN_BACKDROP + " text not null, " +
                FavoriteColumn.COLUMN_POSTER + " text not null, " +
                FavoriteColumn.COLUMN_RELEASE_DATE + " text not null, " +
                FavoriteColumn.COLUMN_VOTE + " text not null, " +
                FavoriteColumn.COLUMN_OVERVIEW + " text not null " +
                ");";

        sqLiteDatabase.execSQL(CREATE_TABLE_MOVIE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE MOVIE IF EXISTS " + FavoriteColumn.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
