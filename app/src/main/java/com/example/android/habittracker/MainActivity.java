package com.example.android.habittracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public Cursor readFromDatabase() {
        DatabaseOpener opener = new DatabaseOpener(this);
        SQLiteDatabase db = opener.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + HabitContract.HabitEntry.TABLE_NAME, null);
        return cursor;
    }
    public void insert(){
        DatabaseOpener opener = new DatabaseOpener(this);
        SQLiteDatabase db = opener.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(HabitContract.HabitEntry.COLUMN_NAME_STATUS, HabitContract.HabitEntry.STATUS_DONE);
        values.put(HabitContract.HabitEntry.COLUMN_NAME_HABIT, "Walk with dog");
        values.put(HabitContract.HabitEntry.COLUMN_NAME_HOUR, "18");
        values.put(HabitContract.HabitEntry.COLUMN_NAME_ID, 1);
        long newRowId = db.insert(HabitContract.HabitEntry.TABLE_NAME, null, values);
    }

}
