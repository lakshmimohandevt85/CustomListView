package com.sdsu.cs646.lakshmi.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lakshmimohandev on 7/13/16.
 */
public class CustomAdapter extends BaseAdapter
{


   // private final Context Context;
    Context context;
    List<String> myData=new ArrayList<String>();

    // what custom adapter should do(duties)?
    public  CustomAdapter(Context contextFromActivity, List<String> myData)
    {
        // it should provide the current state of the activity
         // context = this.context1;
        this.context = contextFromActivity;
        this.myData.addAll(myData);

    }
    @Override
    public int getCount() {
       int count = myData.size();
        return count;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    //this method get excecuted again and again as many number of times we want
    {
        // Inflator is needed to get image and text , both
   // To know the current status of inflator.

        LayoutInflater inflator = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        inflator.inflate(R.layout.custom_layout,viewGroup,false);
        if( view == null ){
            //We must create a View:
            view = inflator.inflate(R.layout.custom_layout, viewGroup, false);
        }
        TextView textView = (TextView)view.findViewById(R.id.textView);
        textView.setText(myData.get(position));
        ImageView image = (ImageView)view.findViewById(R.id.imageView);
        image.setImageResource(R.mipmap.ic_launcher);
        return view;

    }


}
