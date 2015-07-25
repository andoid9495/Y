package com.example.user.yasamanforouzesh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by User on 7/16/2015.
 */
public class forshowpic extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionmenu);
        RelativeLayout layout=(RelativeLayout)findViewById(R.id.l);
        Intent intent=getIntent();
    ImageView imageView=(ImageView)findViewById(R.id.I1);
       int ima=intent.getIntExtra("image",0);
       imageView.setImageResource(ima);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
