package com.example.schoolview.DataBaseHelp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by 子寒 on 2015/10/16.
 */
public class DbHelper extends SQLiteOpenHelper {

    private static final String INFO_TABLE_NAME = "personal_information";
    private static final String ID = "id";
    private static final String NAME = "nickname";
    private static final String PICTURE = "avatar";
    private static final String PICTURE_big = "avatar_big";

    private static final String CREATE_TABLE_INFO = "create table " + INFO_TABLE_NAME + " ( " +
            ID + " integer primary key autoincrement," +
            "openid text," +
            NAME + " text," +
            PICTURE+" BLOB," +
            PICTURE_big+" BLOB)";

    private  static  final String CREATE_TABLE_VIEW="create table prettyview_info (" +
            "ID integer primary key ," +
            "_ID text," +
            "title text," +
            "PICTURE BLOB)";

    public DbHelper(Context context,String name,SQLiteDatabase.CursorFactory factory,int version){
        super(context,name,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_INFO);
//        db.execSQL(CREATE_TABLE_VIEW);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
