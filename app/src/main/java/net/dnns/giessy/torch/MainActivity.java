package net.dnns.giessy.torch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.dnns.giessy.torch.activities.SelectMarketActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selectMarket(View view) {
        Intent intent = new Intent(this, SelectMarketActivity.class);

        startActivity(intent);
    }

    public void sendData(View view) {
        //Should send data from phone to the websearvice listening
        // Do something in response to button
    }
}
