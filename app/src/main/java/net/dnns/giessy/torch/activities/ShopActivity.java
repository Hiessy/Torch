package net.dnns.giessy.torch.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import net.dnns.giessy.torch.R;

public class ShopActivity extends AppCompatActivity {

    private Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        //leo de la base de datos y muestro
        updateValue();

    }

    public void addNewProduct(View view) {
        Intent intent = new Intent(this, SelectProductActivity.class);
        startActivity(intent);
    }

    private void updateValue() {
        EditText totalEditText = (EditText) findViewById(R.id.total_value);
        String value = getIntent().getStringExtra("price");
        String value2 = getIntent().getStringExtra("totalPrice");

        float price = Float.valueOf((value == null) ? "0" : value);
        float priceText = Float.valueOf((value2 == null) ? "0" : value2);

        totalEditText.setText(String.valueOf((price + priceText)));

    }
}
