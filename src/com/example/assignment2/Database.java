package com.example.assignment2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



public class Database{

	public static final String KEY_ROWID = "_id";
	public static final String KEY_NAME = "personsname"; 
	public static final String KEY_PASSWORD = "personspassword";
	private static final String DATABASE_NAME = "Users";
	private static final String DATABASE_TABLE = "Waiters";
	private static final int DATABASE_VERSION = 1;
	private static final String TAG = "DatabaseUtil";
	

			   
	private DBHelper ourHelper;
	private final Context ourContext;
	private SQLiteDatabase ourDatabase;
	

	private static class DBHelper extends SQLiteOpenHelper
	{
		
		DBHelper(Context context)
		{
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			 Log.i(TAG, "Creating DataBase: " + DATABASE_TABLE);
			db.execSQL("CREATE TABLE "+ DATABASE_TABLE + " ("+
					KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
					KEY_NAME + " TEXT NOT NULL, "+
					KEY_PASSWORD + " TEXT NOT NULL);"
					);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS "+DATABASE_TABLE);
			onCreate(db);
		}
	}
	
	
	/* public Database(Context c){
		//	 ourContext = c;
		 
		 }*/
			
		public Database(Context context) {
		// TODO Auto-generated constructor stub
			ourContext = context;
	}

		public Database open() throws SQLException{
			ourHelper = new DBHelper(ourContext);
			ourDatabase = ourHelper.getWritableDatabase();
			return this;	
		}
	
		public void close(){
			ourHelper.close();
		}

	/*	public boolean checkIfValid(String username, String password) {
			// TODO Auto-generated method stub
			return false;
		}*/
		
		
		public long createWaiter(String username,String password){
			ContentValues initValues=new ContentValues();
			initValues.put(KEY_NAME, username);
			initValues.put(KEY_PASSWORD, password);
			return ourDatabase.insert(DATABASE_TABLE,null,initValues);
			
			
		}
		
		public boolean deleteWaiter(long rowId){
			return ourDatabase.delete(DATABASE_TABLE,KEY_ROWID + "+" +rowId,null)>0;
		}
		
		
		public boolean checkIfValid(String username,String password){
		
		String FETCH_WAITER =
					"SELECT COUNT(*) FROM"+DATABASE_TABLE+
					"WHERE "+KEY_NAME +" like '"+username+"'AND KEY_PASSWORD like '"+password+"'";
		
	//	ourDatabase1 = ourDatabase.execSQL(FETCH_WAITER);*/
		Cursor cursor = ourDatabase.rawQuery(FETCH_WAITER + DATABASE_TABLE, null);

		// ensure there is at least one row and one column
		cursor.moveToFirst();
		if (cursor.getCount() > 0 && cursor.getColumnCount() > 0) {
		    return true;
		} else {
		    return false;
		}		
			
		}
		
		
		
		

}