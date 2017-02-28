package net.dnns.giessy.torch.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.dnns.giessy.torch.R;
import net.dnns.giessy.torch.persistance.ImperiumReaderHelper;
import net.dnns.giessy.torch.persistance.dao.ShopDao;

import static java.security.AccessController.getContext;

public class SelectMarketActivity extends AppCompatActivity {

    private ShopDao shopDao;
    private boolean newMarket = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_market);
        //TODO Crear spinner que lees los mercados de la base de datos
    }

    public void goShopping(View view) {
        Intent intent = new Intent(this, ShopActivity.class);

        //TODO verificar si es mercado nuevo y si es nuevo, verificar que no exista en la base actualmente, agregar a la base de datos
        startActivity(intent);
    }
}
