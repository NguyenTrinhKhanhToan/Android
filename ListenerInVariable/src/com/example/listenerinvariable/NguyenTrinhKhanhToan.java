package com.example.listenerinvariable;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NguyenTrinhKhanhToan extends Activity {

	EditText c, f;
	Button toC, toF, Cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nguyen_trinh_khanh_toan);
        c=(EditText) findViewById(R.id.C);
        f=(EditText) findViewById(R.id.F);
        toC=(Button) findViewById(R.id.ChuyenC);
        toF=(Button) findViewById(R.id.ChuyenF);
        Cl=(Button) findViewById(R.id.Clear);
        toC.setOnClickListener(myVarListener);
        toF.setOnClickListener(myVarListener);
        Cl.setOnClickListener(myVarListener);

    }
    private OnClickListener myVarListener=new OnClickListener() {
    	public void onClick(View v) {
    		if(v==toC){
    			try{
    	    		double df = Double.parseDouble(f.getText().toString());
    	        	c.setText((df - 32)*5/9 + "") ;
    	    	}
    	    	catch(Exception e)
    	    	{
    	    		c.setText("Lỗi dữ liệu nhập") ;
    	    	}
    		}
    		if(v==toF){
    			try{
    	    		double dc = Double.parseDouble(c.getText().toString());
    	        	f.setText(dc*9/5 + 32 + "") ;
    	    	}
    	    	catch(Exception e)
    	    	{
    	    		f.setText("Lỗi dữ liệu nhập") ;
    	    	}
    		}
    		if(v==Cl){
    			f.setText("") ;
    	    	c.setText("") ;
    	    	f.requestFocus();
    		}
    	}
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nguyen_trinh_khanh_toan, menu);
        return true;
    }
    
}
