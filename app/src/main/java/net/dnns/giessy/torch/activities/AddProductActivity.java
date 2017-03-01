package net.dnns.giessy.torch.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import net.dnns.giessy.torch.R;
import net.dnns.giessy.torch.model.Product;
import net.dnns.giessy.torch.model.Shop;

import java.util.prefs.Preferences;

public class AddProductActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner typeSpinner;
    private Bundle bundle = new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        typeSpinner = (Spinner) findViewById(R.id.type_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.type_spinner_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeSpinner.setAdapter(adapter);
        typeSpinner.setOnItemSelectedListener(this);


    }

    public void addProduct(View view) {

        Intent intent = new Intent(this, ShopActivity.class);

        String name = ((EditText)findViewById(R.id.name_edit_text)).getText().toString();
        String brand = ((EditText)findViewById(R.id.brand_edit_text)).getText().toString();
        String model = ((EditText)findViewById(R.id.model_edit_text)).getText().toString();
        String amount = ((EditText)findViewById(R.id.amount_edit_text)).getText().toString();
        String price = ((EditText)findViewById(R.id.price_edit_text)).getText().toString();
        String weight = ((EditText)findViewById(R.id.weight_edit_text)).getText().toString();
        String code  = ((EditText)findViewById(R.id.code_edit_text)).getText().toString();



       Product product = new Product(name,brand,model,amount,price,weight,code);
        //guardar en el local storage


        intent.putExtras(bundle);

        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        typeSpinner.setSelection(position);
        String selectionType = (String) typeSpinner.getSelectedItem();
        bundle.putString("type",selectionType);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
