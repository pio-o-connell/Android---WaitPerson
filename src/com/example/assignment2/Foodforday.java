package com.example.assignment2;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Foodforday extends Activity{
	ListView list_View;
	List<String> list= new ArrayList<String>();
	ArrayAdapter<String> adapter;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.food);
		list_View = (ListView) findViewById(R.id.list_view);
        list.add("BlackBeanGreenPeppers");
        list.add("IrishStew");
        list.add("Pizza");
        list.add("Chicken");
        list.add("Continental");
        list.add("FullIrish");
        list.add("Omlette");
        list.add("Pasta");
        list.add("SteakAndChips");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,list);
        list_View.setAdapter(adapter);
        registerForContextMenu(list_View);
    }

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater inflater= getMenuInflater();
		inflater.inflate(R.menu.contextmenu,menu);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		AdapterContextMenuInfo info= (AdapterContextMenuInfo) item.getMenuInfo();
		switch(item.getItemId())
		{
		case R.id.delete_id:
			System.out.println("\n\n ..trying to delete");
			list.remove(info.position);
			adapter.notifyDataSetChanged();
			return true;
		default:
			return super.onContextItemSelected(item);
		}
		
		
	}
	
	
	
	
}