package com.prabhat.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OnUpEventActivity extends AppCompatActivity {

    String[] listviewTitle = new String[]{
            "गुढीपाडवा", "रामनवमी", "नागपंचमी", "पोळा",
            "रक्षाबंधन", "गणेशचतुर्थी", "होळी", "दिवाळी",
    };


    int[] listviewImage = new int[]{
            R.drawable.gudipadawa, R.drawable.ramnavami, R.drawable.nagpanchami, R.drawable.bailpola,
            R.drawable.rakshabndhan, R.drawable.ganeshchaturthi, R.drawable.holi, R.drawable.diwali,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_up_event);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 8; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title"};
        int[] to = {R.id.listview_image, R.id.listview_item_title};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_layout, from, to);
        ListView androidListView = findViewById(R.id.listview);
        androidListView.setAdapter(simpleAdapter);
    }
}
