package com.example.android.habittracker;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.habittracker.HabitContract.HabitEntry;

/**
 * Created by 1 on 01.05.2017.
 */

public class DatabaseOpener extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "HabitTracker.db";

    public DatabaseOpener(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + HabitEntry.TABLE_NAME + " (" +
                        HabitEntry._ID + " INTEGER PRIMARY KEY," +
                        HabitEntry.COLUMN_NAME_HABIT + " TEXT," +
                        HabitEntry.COLUMN_NAME_HOUR + " TEXT," +
                        HabitEntry.COLUMN_NAME_STATUS + " INTEGER)";

        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }
}
