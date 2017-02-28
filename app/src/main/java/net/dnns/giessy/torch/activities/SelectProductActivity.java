package net.dnns.giessy.torch.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.dnns.giessy.torch.R;

public class SelectProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_product);
    }

    public void addSelectedProduct(View view) {
        Intent intent = new Intent(this, ShopActivity.class);

        startActivity(intent);
    }

    public void addNewProduct(View view) {
        Intent intent = new Intent(this, AddProductActivity.class);

        startActivity(intent);
    }


}
