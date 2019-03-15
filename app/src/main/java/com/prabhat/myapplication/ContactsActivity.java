package com.prabhat.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ContactsActivity extends AppCompatActivity {

    Button mButtonPolice;
    Button mButtonFireBrigade;
    Button mButtonAmbulance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        mButtonPolice = findViewById(R.id.button_police);
        mButtonFireBrigade = findViewById(R.id.button_firebrigade);
        mButtonAmbulance = findViewById(R.id.button_ambulance);

        mButtonPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPoliceDialog();
            }
        });
        mButtonFireBrigade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFireBrigadeDialog();
            }
        });
        mButtonAmbulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAmbulanceDialog();
            }
        });

    }

    public void openPoliceDialog() {
        PoliceDialog policeDialog = new PoliceDialog();
        policeDialog.show(getSupportFragmentManager(), "Police Contact");
    }

    public void openFireBrigadeDialog() {
        FireBrigadeDialog fireBrigadeDialogDialog = new FireBrigadeDialog();
        fireBrigadeDialogDialog.show(getSupportFragmentManager(), "Fire Brigade Contact");
    }

    public void openAmbulanceDialog() {
        AmbulanceDialog ambulanceDialog = new AmbulanceDialog();
        ambulanceDialog.show(getSupportFragmentManager(), "Ambulance Contact");
    }
}
