package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Prefs extends PreferenceActivity{

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.prefs);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
	   super.onCreateOptionsMenu(menu);
	   
	   getMenuInflater().inflate(R.menu.pizza_menu, menu);
	   MenuItem item = menu.findItem(R.id.preferences);
	   item.setVisible(false);
	   return true;
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		//super.onKeyDown(keyCode, event);
		
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intentMessage=new Intent();
	    //    Intent i=new Intent(CreateGroup.this,UserPage.class);
			intentMessage.putExtra("MESSAGE","backbutton");
	   //     startActivity(intentMessage);
			setResult(2,intentMessage);
	        finish();
	    }
	    return true;
		
	}





	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
	//	super.onBackPressed();
		Intent intentMessage=new Intent();
		String message= "backbutton";
   	 	intentMessage.putExtra("MESSAGE",message);
   	 	setResult(2,intentMessage);
   	 	finish();
		
		
		
		return ;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		 switch(item.getItemId()){
     	case R.id.aboutUs:
     		Intent i = new Intent("com.example.assignment2.ABOUTUS");
    		startActivity(i);
     		break;
     	
     	case R.id.quit:
     		 Intent intentMessage=new Intent();
     		 String message= "logout";
	    	 intentMessage.putExtra("MESSAGE",message);
	    	 setResult(2,intentMessage);
	    	 finish();
     		break;
     }
		return super.onOptionsItemSelected(item);
	}


	

}
