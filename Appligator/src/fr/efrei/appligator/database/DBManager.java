package fr.efrei.appligator.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBManager extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 2;
    private static final String CREATE_TABLE = "CREATE TABLE";
;
    
    // Constructor
    DBManager(Context context) {
        super(context, "APPLIGATOR", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}	
}
