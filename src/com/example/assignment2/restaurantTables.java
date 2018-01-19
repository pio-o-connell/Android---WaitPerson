package com.example.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;

public class restaurantTables extends Activity{

	Button tableButton1,tableButton2,tableButton3,tableButton4;
	Switch onOffSwitch1,onOffSwitch2,onOffSwitch3,onOffSwitch4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.restaurant);
		final Intent intentGetMessage = new Intent(this, MainActivity.class);

		
	   tableButton2 = (Button) findViewById(R.id.Button02);
	   tableButton2.setEnabled(false); 
	    tableButton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivityForResult(intentGetMessage,2);

						}
	    		});
	    
	     onOffSwitch1 = (Switch)  findViewById(R.id.switch1); 
	     onOffSwitch1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
	    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	    	        if(isChecked)
	    	        	tableButton2.setEnabled(true); 
	    	        else
	    	        	tableButton2.setEnabled(false);
	    	        
	    	    }
	    	});    
  
	    
	    
	    
	    
	    
	    tableButton1 = (Button) findViewById(R.id.Button01);
	    tableButton1.setEnabled(false);  
	    tableButton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivityForResult(intentGetMessage,2);

						}
	    		});
	    
	    onOffSwitch2 = (Switch)  findViewById(R.id.Switch01); 
	     onOffSwitch2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
	    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	    	        if(isChecked)
	    	        	tableButton1.setEnabled(true); 
	    	        else
	    	        	tableButton1.setEnabled(false);
	    	        
	    	    }
	    	});  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    tableButton3 = (Button) findViewById(R.id.Button03);
	    tableButton3.setEnabled(false); 
	    tableButton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivityForResult(intentGetMessage,2);

						}
	    		});
	    
	    onOffSwitch3 = (Switch)  findViewById(R.id.Switch02); 
	     onOffSwitch3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
	    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	    	        if(isChecked)
	    	        	tableButton3.setEnabled(true); 
	    	        else
	    	        	tableButton3.setEnabled(false);
	    	        
	    	    }
	    	});  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    tableButton4 = (Button) findViewById(R.id.Button04);
	    tableButton4.setEnabled(false);
	    tableButton4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivityForResult(intentGetMessage,2);

						}
	    		});
	    onOffSwitch4 = (Switch)  findViewById(R.id.Switch03); 
	     onOffSwitch4.setOnCheckedChangeListener(new OnCheckedChangeListener() {
	    	    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	    	        if(isChecked)
	    	        	tableButton4.setEnabled(true); 
	    	        else
	    	        	tableButton4.setEnabled(false);
	    	        
	    	    }
	    	});  
	    
	    
	    
	    
	
	}

}
