package com.example.android.habittracker;

import android.provider.BaseColumns;

/**
 * Created by 1 on 01.05.2017.
 */

public final class HabitContract {

    public abstract class HabitEntry implements BaseColumns {
        public static final String TABLE_NAME = "habit_tracker";
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_HABIT = "habit";
        public static final String COLUMN_NAME_HOUR = "hour";
        public static final String COLUMN_NAME_STATUS = "status";

        /*
        Possible values for column STATUS
         */

        public static final int STATUS_DONE = 0;
        public static final int STATUS_NOT_DONE = 1;
        public static final int STATUS_POSPONED = 2;
    }
}
