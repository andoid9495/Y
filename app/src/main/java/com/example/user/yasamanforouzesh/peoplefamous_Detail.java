package com.example.user.yasamanforouzesh;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 7/14/2015.
 */
public class peoplefamous_Detail extends Activity {
    Intent intent;
    String net;
    String name;
    String Biography;
    int imageResource;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        intent=getIntent();
        name=intent.getStringExtra("name");
        Biography=intent.getStringExtra("bio");
        net=intent.getStringExtra("http");
        imageResource=intent.getIntExtra("imageR",0);
        if(getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE){
           setContentView(R.layout.forlandcase);
            TextView Tx=(TextView)findViewById(R.id.LT);
            Tx.setText(name);
            final ImageView Im=(ImageView)findViewById(R.id.LI);
            Im.setImageResource(imageResource);
            Tx=(TextView)findViewById(R.id.LT1);
            Tx.setText(Biography);
            TextView T=(TextView)findViewById(R.id.LT2);
            T.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse(net));
                    startActivity(intent1);
                }
            });
//            layout.setOrientation(LinearLayout.HORIZONTAL);
       }
        else {
            setContentView(R.layout.activity_detail);
            TextView Tx=(TextView)findViewById(R.id.T1);
            Tx.setText(name);
            final ImageView Im=(ImageView)findViewById(R.id.im1);
            Im.setImageResource(imageResource);
            Tx=(TextView)findViewById(R.id.T2);
            Tx.setText(Biography);
            TextView T=(TextView)findViewById(R.id.T);
            T.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse(net));
                    startActivity(intent1);
                }
            });
            Im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(peoplefamous_Detail.this, forshowpic.class);
                    intent1.putExtra("image",imageResource);
                    startActivity(intent1);
                }
            });
        }
            //layout.setOrientation(LinearLayout.VERTICAL);
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
//        Toast mg=Toast.makeText(this,name,Toast.LENGTH_SHORT);
//        mg.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast n=Toast.makeText(this,"main page",Toast.LENGTH_SHORT);
            n.show();
         finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
     MenuItem item=menu.add(R.string.about_app);
      MenuItem item1=menu.add(R.string.about_Me);
      item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
          @Override
          public boolean onMenuItemClick(MenuItem item) {
              Intent intent1;
            //  switch (item.getItemId()){
                //  case R.id.aboutapp:
                      intent1=new Intent(peoplefamous_Detail.this,forapp.class);
                      startActivity(intent1);
                   //   break;
//                  case R.id.aboutme:
//                      intent1=new Intent(peoplefamous_Detail.this,forme.class);
//                      startActivity(intent1);
//                       break;
           //   }
              return false;
          }
      });
        item1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent1;
                //  switch (item.getItemId()){
                //  case R.id.aboutapp:
 //               intent1=new Intent(peoplefamous_Detail.this,forapp.class);
   //             startActivity(intent1);
                //   break;
//                  case R.id.aboutme:
                   intent1=new Intent(peoplefamous_Detail.this,forme.class);
                      startActivity(intent1);
//                       break;
                //   }
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        intent=getIntent();
        name=intent.getStringExtra("name");
        Biography=intent.getStringExtra("bio");
        net=intent.getStringExtra("http");
        imageResource=intent.getIntExtra("imageR",0);
        if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
Toast.makeText(this,"landscape",Toast.LENGTH_SHORT).show();
           setContentView(R.layout.forlandcase);

            TextView Tx=(TextView)findViewById(R.id.LT);
            Tx.setText(name);

            final ImageView Im=(ImageView)findViewById(R.id.LI);
            Im.setImageResource(imageResource);

            Tx=(TextView)findViewById(R.id.LT1);
            Tx.setText(Biography);

            TextView T=(TextView)findViewById(R.id.LT2);
            T.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse(net));
                    startActivity(intent1);
                }
            });
            Toast.makeText(this,name,Toast.LENGTH_SHORT).show();

        }
        else {
            setContentView(R.layout.activity_detail);
            TextView Tx=(TextView)findViewById(R.id.T1);
            Tx.setText(name);
            final ImageView Im=(ImageView)findViewById(R.id.im1);
            Im.setImageResource(imageResource);
            Tx=(TextView)findViewById(R.id.T2);
            Tx.setText(Biography);
            TextView T=(TextView)findViewById(R.id.T);
            T.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse(net));
                    startActivity(intent1);
                }
            });
            Im.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(peoplefamous_Detail.this, forshowpic.class);
                    intent1.putExtra("image",imageResource);
                    startActivity(intent1);
                }
            });
            Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
        }
    }
}

