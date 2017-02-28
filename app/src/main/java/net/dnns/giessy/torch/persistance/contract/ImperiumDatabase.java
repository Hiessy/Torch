package net.dnns.giessy.torch.persistance.contract;

import android.provider.BaseColumns;

/**
 * Created by Tincho on 2/27/2017.
 */

public final class ImperiumDatabase {

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + ShopTable.TABLE_NAME + " (" +
                    ShopTable._ID + " INTEGER PRIMARY KEY," +
                    ShopTable.COLUMN_NAME_SHOP_NAME + " TEXT," +
                    ShopTable.COLUMN_NAME_STREET + " TEXT," +
                    ShopTable.COLUMN_NAME_CITY + " TEXT," +
                    ShopTable.COLUMN_NAME_PROVINCE + " TEXT," +
                    ShopTable.COLUMN_NAME_COUNTRY + " TEXT," +
                    ShopTable.COLUMN_NAME_LAT_LON + " TEXT)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ShopTable.TABLE_NAME;

    private ImperiumDatabase() {
    }

    /* Inner class that defines the table contents */
    public static class ShopTable implements BaseColumns {
        public static final String TABLE_NAME = "shop";
        public static final String COLUMN_NAME_SHOP_NAME = "shop_name";
        public static final String COLUMN_NAME_STREET = "street";
        public static final String COLUMN_NAME_CITY = "city";
        public static final String COLUMN_NAME_PROVINCE = "province";
        public static final String COLUMN_NAME_COUNTRY = "country";
        public static final String COLUMN_NAME_LAT_LON = "lat_lon";
    }

}
