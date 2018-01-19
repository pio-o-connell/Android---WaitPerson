package com.example.assignment2;




import java.lang.reflect.Array;
import java.util.ArrayList;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity implements OnItemSelectedListener  {
	
	
	
	NotificationManager nm;
	static final int UniqueID = 12345;
	
	public static final int MENUSIZE = 11;
	public static final int EXTRAS =6;
	private static ProgressBar mprogressBar;
	int percent_done=0;
	final Handler mHandler = new Handler();
	final Runnable mUpdateResults = new Runnable(){

		@Override
		public void run() {
			int size=20000;
			double tmp;
			for(int i=0;i<1000;i++){
				for(int j=0;j<1000;j++){
					tmp = 10 * Math.log(i+1)/Math.log(j+1);
					
				}
			}
			
			mprogressBar.setProgress(percent_done);
			
		}
		
	};
	private double[] itemPrices = {1.00,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0};
	private String[] itemNames = {"Steak","Steak","Beef","Chicken","Continental","Doner","Irish","Omelette","Pizza","Pasta","Stew"};
	

	private itemDetails[] menuItem;
	private double[] pizzaPrices = {1.00,2.0,3.0};
	private String[] toppings = { "Extra","Mushrooms","Tomatoes","Olives","Pineapple","Peppers"};
	private double[] toppingPrices ={1.0,0.1,0.2,0.3,0.4,0.5};
	private double[] carbsStaples={0.1,0.2,0.3};
	private PizzaItem pizzaItem = new PizzaItem(pizzaSize.LARGE, false, false,false,false, false,false, "Pizza", 0);
	private CheckBox checkBox0701,checkBox0702,checkBox0703,checkBox0704,checkBox0705;
	private Spinner spinner07;
//	private Array[] spinner= new Array[12];
	private String[] pizzaValues = {"Large","Medium","Small"};

	private NumberPicker numberPicker01,numberPicker07;
	private TextView Total,SubTotal01,SubTotal07;
	
	private  RadioGroup radioGroup01,radioGroup07;
	private RadioButton radio010;
	private Button bCalculateButton; 
	
	
	private NotificationManager mNManager;
	private static final int NOTIFY_ID=1100;
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.cancel(UniqueID);
        
      //  initalize();
        menuItem = new itemDetails[MENUSIZE];
        Staples theDay = Staples.PASTA;
		for(int i=0;i<=MENUSIZE-1 ;i++){
		//	menuItem[i] = new itemDetails(Staples.PASTA,0,0.00,itemNames[i-1],itemPrices[i-1]);	
			 menuItem[i] = new itemDetails(Staples.PASTA,0,0.00,itemNames[i],itemPrices[i]);
		}
		
		
        
        
        
        
       
        PizzaItem pizzaItem;
        pizzaSize size= pizzaSize.SMALL;
         
 //       Preference customPreference = (Preference)findPreference("name");
      

         
         pizzaItem = new PizzaItem(size, false,false,false,false, false,false,"Pizza", 0) ;
        
        
		
		
        
        mprogressBar= (ProgressBar) findViewById(R.id.progressbar) ;
        Total = (TextView)findViewById(R.id.textView972);
        Total.setText("0.00");
        
        
        bCalculateButton = (Button)findViewById(R.id.bCalculate);
        bCalculateButton.setOnClickListener(new View.OnClickListener() {
			
			@SuppressWarnings("null")
			@Override
			public void onClick(View v) {
			
				double total7= Double.parseDouble((String) SubTotal07.getText());
			
				percent_done = 0;
				mHandler.post(mUpdateResults);
	
				percent_done = 20;
				mHandler.post(mUpdateResults);
			
				
				percent_done = 40;
				mHandler.post(mUpdateResults);
				
				
				percent_done = 60;
				mHandler.post(mUpdateResults);
				
				percent_done = 80;
				mHandler.post(mUpdateResults);
				
				
				percent_done = 100;
				mHandler.post(mUpdateResults);
				
			}		
		});
        
        
        
        
        
        
        
        // ROW 1 OF TABLE  
     //   menuItem[1] = new itemDetails();
        menuItem[1] = new itemDetails(Staples.PASTA,0,0.00,itemNames[0],itemPrices[0]);
        
        radioGroup01 = (RadioGroup) findViewById(R.id.radioGroup01);


        radioGroup01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
           {
               public void onCheckedChanged(RadioGroup group, int checkedId) {
            	   
            	   
            	  
                 
                   RadioButton rb=(RadioButton)findViewById(checkedId);
                
                
                   Staples theDay = Staples.PASTA; 
				
         
                   switch(checkedId){
       					case R.id.radio010:
       					//	menuItem[1].setItemExtra("Chips");
       						menuItem[1].setItemExtra( Staples.CHIPS);
       						
       					    
       						break;
       					case R.id.radio011:
       						menuItem[1].setItemExtra( Staples.PASTA);
       						break;
       					case R.id.radio012:
       						menuItem[1].setItemExtra( Staples.RICE);
       						break;
       			
       		}
                   
                   
               }
           });


        
        
        SubTotal01 = (TextView)findViewById(R.id.textView012);
        SubTotal01.setText("0.00");
        
        numberPicker01 = (NumberPicker) findViewById(R.id.numberPicker01);
        numberPicker01.setMaxValue(5);
        numberPicker01.setMinValue(0);
        numberPicker01.setWrapSelectorWheel(false);
        numberPicker01.setOnValueChangedListener(new OnValueChangeListener() {
			
    		@Override
    		public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
    			menuItem[1].setItemQuantity(newVal);
    			SubTotal01.setText(String.format( "%.2f",(newVal*itemPrices[0])));
    		}
    	});
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // ROW 07 of table at the end
        
        menuItem[7] = new itemDetails();
        
        
        
        @SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayAdapter<String> adapter07 = new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,pizzaValues);
        spinner07 = (Spinner)findViewById(R.id.spinner07);
        
        spinner07.setAdapter(adapter07);
        spinner07.setOnItemSelectedListener(this);
        
        SubTotal07 = (TextView)findViewById(R.id.textView072);
        SubTotal07.setText("0.00");
        numberPicker07 = (NumberPicker) findViewById(R.id.numberPicker07);
        numberPicker07.setMaxValue(5);
        numberPicker07.setMinValue(0);
        numberPicker07.setWrapSelectorWheel(false);
        numberPicker07.setOnValueChangedListener(new OnValueChangeListener() {
			
    		@Override
    		public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
    			SubTotal07.setText(String.format( "%.2f",(newVal*itemPrices[6])));
    			menuItem[7].setItemQuantity(newVal);
    		}
    	});
        
        checkBox0701 = (CheckBox) findViewById(R.id.checkBox0701);
        checkBox0702 = (CheckBox) findViewById(R.id.checkBox0702);
        checkBox0703 = (CheckBox) findViewById(R.id.checkBox0703);
        checkBox0704 = (CheckBox) findViewById(R.id.checkBox0704);
        checkBox0705 = (CheckBox) findViewById(R.id.checkBox0705);
        checkBox0701.setOnCheckedChangeListener(new OnCheckedChangeListener() {
        	 								public void onClick(View v) {
        	 										if (((CheckBox) v).isChecked()) {
        	 											Toast.makeText(MainActivity.this,"Bro, try Android :)", Toast.LENGTH_LONG).show();
        	 										}
       
        	 								}

        	 													@Override
        	 								public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
        	 														Toast.makeText(MainActivity.this,"Bro, try Android :)", Toast.LENGTH_LONG).show();
			
        	 								}
      	});
        checkBox0702.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				public void onClick(View v) {
						if (((CheckBox) v).isChecked()) {
							Toast.makeText(MainActivity.this,"Bro, try Android :)", Toast.LENGTH_LONG).show();
						}

				}

									@Override
				public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
										Toast.makeText(MainActivity.this,"Bro, try Android :)", Toast.LENGTH_LONG).show();

				}
});
        checkBox0703.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onClick(View v) {
					if (((CheckBox) v).isChecked()) {
						Toast.makeText(MainActivity.this,"Bro, try Android :)", Toast.LENGTH_LONG).show();
					}

			}

								@Override
			public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
									Toast.makeText(MainActivity.this,"Bro, try Android :)", Toast.LENGTH_LONG).show();

			}
});      
        checkBox0704.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onClick(View v) {
					if (((CheckBox) v).isChecked()) {
						Toast.makeText(MainActivity.this,"Bro, try Android :)", Toast.LENGTH_LONG).show();
					}

			}

								@Override
			public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
									Toast.makeText(MainActivity.this,"Bro, try Android :)", Toast.LENGTH_LONG).show();

			}
});      
        
        checkBox0705.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onClick(View v) {
					if (((CheckBox) v).isChecked()) {
						Toast.makeText(MainActivity.this,"Bro, try Android :)", Toast.LENGTH_LONG).show();
					}

			}

								@Override
			public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
									Toast.makeText(MainActivity.this,"Bro, try Android :)", Toast.LENGTH_LONG).show();

			}
});       
        
        
        
    }



	private void initalize() {
	    double[] itemPrices = {1.00,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
	    String[] itemNames = {"Steak","Beef","Chicken","Continental","Doner","Irish","Omelette","Pizza","Pasta","Stew"};
	    String[] toppings = { "Extra","Mushrooms","Tomatoes","Olives","Pineapple","Peppers"};
		
		Staples theDay = Staples.PASTA;
		for(int i=1;i<=MENUSIZE-1 ;i++){
		//	menuItem[i] = new itemDetails(Staples.PASTA,0,0.00,itemNames[i-1],itemPrices[i-1]);	
			 menuItem[i] = new itemDetails();
			 System.out.println();
		}
		
	   
			
	}
		
	



	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		int position1 = spinner07.getSelectedItemPosition();
		switch (parent.getId()) {
			case R.id.spinner07:
				switch(position1) {
					case 0:
						SubTotal07.setText(String.format( "%.2f",(pizzaPrices[2])));
					break;
					case 1:
						SubTotal07.setText(String.format( "%.2f",(pizzaPrices[1])));
					break;
					case 2:
						SubTotal07.setText(String.format( "%.2f",(pizzaPrices[0])));
					break;
				}
			}
	}





	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}


	/*@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		//super.onKeyDown(keyCode, event);
		return true;
	}





	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
	//	super.onBackPressed();
		return ;
	}*/





	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	super.onCreateOptionsMenu(menu);
      //  getMenuInflater().inflate(R.menu.pizza_menu, menu);
    	getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId()){
        	case R.id.aboutUs:
        		Intent i = new Intent("com.example.assignment2.ABOUTUS");
        		startActivity(i);
        		break;
        	case R.id.menuforday:
                //		Intent i = new Intent("com.example.assignment2.PREFS");
                //		startActivity(i);
                		Intent intentGetMessage = new  Intent(this,Foodforday.class);
                    	startActivityForResult(intentGetMessage,6);
                		break;	
        		
        		
        		
        	case R.id.preferences1:
        //		Intent i = new Intent("com.example.assignment2.PREFS");
        //		startActivity(i);
        		Intent intentGetMessage1 = new  Intent(this,Prefs.class);
            	startActivityForResult(intentGetMessage1,2);
        		break;
        	case R.id.quit:
        		Intent intent= new Intent(this,MainActivity.class);
        		PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent, 0);
        		String body = "Order taken for table";
        		String title ="Message from cook";
        		Notification n = new Notification(R.drawable.chef,body,System.currentTimeMillis());
        		n.setLatestEventInfo(this, title, body, pIntent);
        		n.defaults = Notification.DEFAULT_ALL;
        		nm.notify(UniqueID,n);
        		finish();
        		break;
        }
      
        return super.onOptionsItemSelected(item);
    }
    
    @Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==2){
    			 String message=data.getStringExtra("MESSAGE");
    			 if(message.equals("logout")){
    				 System.out.println("Here");
    				 finish(); 
    			 }
    			 if(message.equals("backbutton"))
    				 System.out.println("Here");
				 	
    	}
    }



	
	/*public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		
	}*/
	/*public void onCheckedChanged(RadioGroup arg0,int arg1){
		switch(arg1){
			case R.id.radio010:
				break;
			case R.id.radio011:
				break;
			case R.id.radio012:
				break;
			
		}
	}



	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		
	}

*/






		
		
		
		
		
		
		
	}
    
    
    
  
    
    
    
    
    

