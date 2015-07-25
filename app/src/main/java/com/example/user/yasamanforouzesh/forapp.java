package com.example.user.yasamanforouzesh;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by User on 7/16/2015.
 */
public class forapp extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionmenu);
        TextView T=(TextView)findViewById(R.id.Ta);
        T.setText("\t\t\t\t\t\t\t\tGod \nHi my friend tnx a lot for see my app. my app about famous people and you can touch the  picture and see the alone picture" +
                "and you can touch the more.. and go to the site for read more than I write.\n " +
                "I promise develop the app until you enjoy it.");
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
