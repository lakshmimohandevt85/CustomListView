package com.sdsu.cs646.lakshmi.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.my_list);
        List<String> myData=new ArrayList<String>(); // got data
        myData.add("KV");
        myData.add("Monuttan");
        // need custom adapter
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), myData);
        listView.setAdapter(customAdapter);
    }
}
