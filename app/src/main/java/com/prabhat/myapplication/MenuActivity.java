package com.prabhat.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button mButtonAbtCity;
    Button mButtonContacts;
    Button mButtonLocations;
    Button mButtonElectedWings;
    Button mButtonWhether;
    Button mButtonEvents;
    Button mButtonComplaints;
    Button mButtonAnnouncements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mButtonAbtCity = findViewById(R.id.button_abtcity);
        mButtonContacts = findViewById(R.id.button_contacts);
        mButtonLocations = findViewById(R.id.button_locations);
        mButtonElectedWings = findViewById(R.id.button_elected_wings);
        mButtonWhether = findViewById(R.id.button_whether);
        mButtonEvents = findViewById(R.id.button_events);
        mButtonComplaints = findViewById(R.id.button_complaints);
        mButtonAnnouncements = findViewById(R.id.button_annoucements);

        mButtonAbtCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about_city_intent = new Intent(MenuActivity.this, AboutCityActivity.class);
                startActivity(about_city_intent);
            }
        });

        mButtonContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contacts_intent = new Intent(MenuActivity.this, ContactsActivity.class);
                startActivity(contacts_intent);

            }
        });

        mButtonLocations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent location_intent = new Intent(MenuActivity.this, LocationActivity.class);
                startActivity(location_intent);

            }
        });

        mButtonElectedWings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent electedwings_intent = new Intent(MenuActivity.this, ElectedWingsActivity.class);
                startActivity(electedwings_intent);

            }
        });

        mButtonWhether.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whether_intent = new Intent(MenuActivity.this, WhetherActivity.class);
                startActivity(whether_intent);

            }
        });

        mButtonEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent events_intent = new Intent(MenuActivity.this, OnUpEventActivity.class);
                startActivity(events_intent);

            }
        });

        mButtonComplaints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent complaints_intent = new Intent(MenuActivity.this, ComplaintsActivity.class);
                startActivity(complaints_intent);

            }
        });

        mButtonAnnouncements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent announcement_intent = new Intent(MenuActivity.this, AnnouncementActivity.class);
                startActivity(announcement_intent);

            }
        });
    }
}
