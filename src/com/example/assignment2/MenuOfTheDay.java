package com.example.assignment2;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuOfTheDay extends Activity{
	private List<MenuItemOfTheDay> todaysMenu = new ArrayList<MenuItemOfTheDay>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.choicesoftheday);
		
		populateMenuList();
		populateListView();
		registerClickCallBacks();
		
		
	}
	

	private void populateMenuList() {
		todaysMenu.add(new MenuItemOfTheDay("BlackBeanGreenPeppers",R.drawable.beefgreenpepper));
		todaysMenu.add(new MenuItemOfTheDay("IrishStew",R.drawable.irishstew));
		todaysMenu.add(new MenuItemOfTheDay("Pizza",R.drawable.pizza));
		todaysMenu.add(new MenuItemOfTheDay("Continental",R.drawable.continental));
		todaysMenu.add(new MenuItemOfTheDay("FullIrish",R.drawable.fullirish));
		todaysMenu.add(new MenuItemOfTheDay("Omlette",R.drawable.omelette));
		todaysMenu.add(new MenuItemOfTheDay("Pasta",R.drawable.pasta));
		todaysMenu.add(new MenuItemOfTheDay("SteakAndChips",R.drawable.steakchips));
		todaysMenu.add(new MenuItemOfTheDay("DonerKebab",R.drawable.donerkebab));	
	}
	
	private void populateListView() {
		ArrayAdapter<MenuItemOfTheDay> adapter = new MyListAdapter();
		ListView list = (ListView) findViewById(R.id.choicesListView);
		list.setAdapter(adapter);

	}
	
	private void registerClickCallBacks() {
		ListView list = (ListView)findViewById(R.id.choicesListView);
		
		
		// on-click 
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
				
				MenuItemOfTheDay currentItem = todaysMenu.get(position);
				String message = "You clicked position"+currentItem;
				Toast.makeText(MenuOfTheDay.this,message,Toast.LENGTH_LONG).show();
			}
			
			
		});
				
		
		
		
	}

	private class MyListAdapter extends ArrayAdapter<MenuItemOfTheDay>{

		public MyListAdapter() {
			super(MenuOfTheDay.this,R.layout.itemoftheday,todaysMenu);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View itemView = convertView;
			if(itemView == null)
				itemView = getLayoutInflater().inflate(R.layout.itemoftheday,parent,false);
			
			MenuItemOfTheDay currentItem = todaysMenu.get(position);
			
			ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
			imageView.setImageResource(currentItem.getIconID());
			
			TextView makeText = (TextView)itemView.findViewById(R.id.item_textdescption);
			makeText.setText(currentItem.getFoodItem());
			
			return itemView;
		}
		
		
			
			
		
		
	}

}
