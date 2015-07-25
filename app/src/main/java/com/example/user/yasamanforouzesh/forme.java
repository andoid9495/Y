package com.example.user.yasamanforouzesh;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 7/16/2015.
 */
public class forme extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionmenu);
        TextView T=(TextView)findViewById(R.id.Ta);
        T.setText("\t\t\t\t\t\t\t\t\t\t\tGod \nmy name is yasaman forouzesh.I study software in the south university." +
                "now I start learn android. this application is first app I write." +
                "I learn more and can write better than." +
                "thanx for see my first app.\n Have a good job");
        ImageView imageView=(ImageView)findViewById(R.id.I);
        imageView.setImageResource(R.drawable.backgroung);

        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
