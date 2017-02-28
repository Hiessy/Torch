package net.dnns.giessy.torch.persistance.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import net.dnns.giessy.torch.persistance.ImperiumReaderHelper;
import net.dnns.giessy.torch.model.Shop;
import net.dnns.giessy.torch.persistance.contract.ImperiumDatabase;

/**
 * Created by Tincho on 2/27/2017.
 */

public class ShopDao {

    ImperiumReaderHelper imperiumReaderHelper;

    public ShopDao(Context context){
        this.imperiumReaderHelper = new ImperiumReaderHelper(context);
    }

    public Shop addNewShop(Shop shop){
        SQLiteDatabase db = this.imperiumReaderHelper.getWritableDatabase();
// TODO read input data
        ContentValues values = new ContentValues();
        values.put(ImperiumDatabase.ShopTable.COLUMN_NAME_SHOP_NAME, shop.getShopName());
        values.put(ImperiumDatabase.ShopTable.COLUMN_NAME_STREET, shop.getStreet());
        values.put(ImperiumDatabase.ShopTable.COLUMN_NAME_CITY, shop.getCity());
        values.put(ImperiumDatabase.ShopTable.COLUMN_NAME_PROVINCE, shop.getProvince());
        values.put(ImperiumDatabase.ShopTable.COLUMN_NAME_COUNTRY, shop.getCountry());
        values.put(ImperiumDatabase.ShopTable.COLUMN_NAME_LAT_LON , shop.getLatLon());

        long newRowId = db.insert(ImperiumDatabase.ShopTable.TABLE_NAME, null, values);
        shop.setId(newRowId);

        db.close();
        return shop;
    }
}
