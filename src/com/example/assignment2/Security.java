package com.example.assignment2;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Security extends Activity implements OnClickListener{
	
	Button bSubmit;
	EditText UsernameET,PasswordET;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secure_entry);
		
	//	final Database dbUtil = new Database(this);
	//	dbUtil.open();
	//	dbUtil.createWaiter("pio", "pio");
		//dbUtil.close();
		UsernameET = (EditText) findViewById(R.id.etUserName);
		PasswordET = (EditText) findViewById(R.id.etPassword);
		bSubmit = (Button)findViewById(R.id.bResults);
		
		final Intent intentGetMessage = new Intent(this, restaurantTables.class);
		
		bSubmit.setOnClickListener(new View.OnClickListener() {
							@Override
							public void onClick(View v) {
				// TODO Auto-generated method stub
										try{
											
							//			dbUtil.createWaiter("pio", "pio");
										String username = UsernameET.getText().toString();
										String password = PasswordET.getText().toString();
										
									//	Database entry = new Database(Security.this);
									//	entry.open();
							//			boolean valid = dbUtil.checkIfValid(username,password);
										
									//	entry.close();
										if(username.equals("pio") && 
												password.equals("pio"))
									//	if (valid)
											{
													System.out.println("HI");
													startActivityForResult(intentGetMessage,9);
											}
				
							}catch(Exception e){
								
							}finally{
				//				dbUtil.close();
								System.out.println("Anyways");
							}
							
										}
		});
		
		
		
			
		
		
		
		
		
	}

	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	


	
	
}
