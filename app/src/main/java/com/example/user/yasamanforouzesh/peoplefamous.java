package com.example.user.yasamanforouzesh;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class peoplefamous extends ListActivity {
private List<people> peoples=new peopleData().getPeoples();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast ms=Toast.makeText(this,"welcome",Toast.LENGTH_LONG);
        ms.show();
        setContentView(R.layout.activity_peoplefamous);
       peopleadapter adapter=new peopleadapter(this,R.layout.foradapter,peoples);
   // ArrayAdapter<people> adapter=new ArrayAdapter<people>(this,android.R.layout.simple_list_item_1,peoples);
       setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        people People=peoples.get(position);
        Intent intent=new Intent(this,peoplefamous_Detail.class);
        intent.putExtra("name",People.name);
        intent.putExtra("bio",People.Biography);
        intent.putExtra("imageR",People.imageResource);
        intent.putExtra("http",People.I);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_peoplefamous, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
switch (item.getItemId()){
    case R.id.aboutme:
        intent=new Intent(this,forme.class);
        startActivity(intent);
        break;
    case R.id.aboutapp:
intent=new Intent(this,forapp.class);
       startActivity(intent);
        break;
    case R.id.alb:
    case R.id.alf:
    case R.id.aung:
    case  R.id.charli:



}
        return super.onOptionsItemSelected(item);
    }
}
