package net.dnns.giessy.torch.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import net.dnns.giessy.torch.R;
import net.dnns.giessy.torch.model.Province;
import net.dnns.giessy.torch.persistance.dao.ShopDao;

public class SelectMarketActivity extends AppCompatActivity {

    private ShopDao shopDao;
    private boolean newMarket = true;
    private String market = "";
    private String province = "";


    private Spinner marketSpinner;
    private Spinner provinceSpinner;
    private Spinner countrySpinner;

    String[] answerseconds = { "Unlimited", "1 second", "2 seconds", "3 seconds",
            "4 seconds", " 5 seconds" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_select_market);
        //TODO Crear spinner que lees los mercados de la base de datos

        ArrayAdapter<String> adapterAnswer = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, answerseconds);

        marketSpinner = (Spinner) findViewById(R.id.stored_market_spinner);
        marketSpinner.setAdapter(adapterAnswer);
        marketSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });


        provinceSpinner = (Spinner) findViewById(R.id.province_state_spinner);
        ArrayAdapter<CharSequence> adapterCountry = ArrayAdapter.createFromResource(this, R.array.country_spinner_array, android.R.layout.simple_spinner_item);

        countrySpinner = (Spinner) findViewById(R.id.country_spinner);
        countrySpinner.setAdapter(adapterCountry);

        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                ArrayAdapter<String> adapterProvince = null;
                switch ((String) parentView.getItemAtPosition(position)) {
                    case "AR":
                        adapterProvince = new ArrayAdapter<String>(parentView.getContext(), android.R.layout.simple_spinner_item, Province.AR);
                        break;
                    case "BR":
                        adapterProvince = new ArrayAdapter<String>(parentView.getContext(), android.R.layout.simple_spinner_item, Province.BR);
                        break;
                    case "CA":
                        adapterProvince = new ArrayAdapter<String>(parentView.getContext(), android.R.layout.simple_spinner_item, Province.CA);
                        break;
                    case "FR":
                        adapterProvince = new ArrayAdapter<String>(parentView.getContext(), android.R.layout.simple_spinner_item, Province.FR);
                        break;
                    case "IT":
                        adapterProvince = new ArrayAdapter<String>(parentView.getContext(), android.R.layout.simple_spinner_item, Province.IT);
                        break;
                    case "JP":
                        adapterProvince = new ArrayAdapter<String>(parentView.getContext(), android.R.layout.simple_spinner_item, Province.JP);
                        break;
                    case "UK":
                        adapterProvince = new ArrayAdapter<String>(parentView.getContext(), android.R.layout.simple_spinner_item, Province.UK);
                        break;
                    case "US":
                        adapterProvince = new ArrayAdapter<String>(parentView.getContext(), android.R.layout.simple_spinner_item, Province.US);
                        break;
                }

                provinceSpinner.setAdapter(adapterProvince);
                provinceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parentView) {
                        // your code here
                    }

                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });



    }

    public void goShopping(View view) {
        Intent intent = new Intent(this, ShopActivity.class);

        // TODO si se selecciono del spinner ignorar busqueda y seguir
/*if(newMarket)
        System.out.println("this was a new market");
        else
    System.out.println("this was a new market");*/
        //TODO verificar si es mercado nuevo y si es nuevo, verificar que no exista en la base actualmente, agregar a la base de datos
        startActivity(intent);
    }

}
