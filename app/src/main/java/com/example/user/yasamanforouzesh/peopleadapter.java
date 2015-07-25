package com.example.user.yasamanforouzesh;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
* Created by User on 7/15/2015.
*/
public class peopleadapter extends ArrayAdapter<people> {
    private Context context;
    private  List<people> object;
    public peopleadapter(Context context,int resource,List<people> object){
        super(context,resource,object);
        this.context=context;
        this.object=object;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        people People=object.get(position);
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.foradapter,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView2);
        imageView.setImageResource(People.imageResource);
        TextView tv=(TextView)view.findViewById(R.id.TextView2);
        tv.setText(People.name);
        return view;
    }
}
