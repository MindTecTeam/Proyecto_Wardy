package com.invictos.ssid.wardy_user;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class InicioActivity extends AppCompatActivity {

    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ingresar = (Button) findViewById(R.id.button_ingresar);

        ingresar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ingresar = new Intent(InicioActivity.this, MainActivity.class);
                startActivity(ingresar);
            }
        });
    }
}
