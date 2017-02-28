package net.dnns.giessy.torch.persistance;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static net.dnns.giessy.torch.persistance.contract.ImperiumDatabase.SQL_CREATE_ENTRIES;
import static net.dnns.giessy.torch.persistance.contract.ImperiumDatabase.SQL_DELETE_ENTRIES;

/**
 * Created by Tincho on 2/27/2017.
 */

public class ImperiumReaderHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Imperium.db";

    public ImperiumReaderHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    }
