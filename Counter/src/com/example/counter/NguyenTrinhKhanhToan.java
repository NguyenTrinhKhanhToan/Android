package com.example.counter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class NguyenTrinhKhanhToan extends Activity {
	 	TextView    HT;
	 	RadioButton T, L;
	 	Button      bC;
	 	int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nguyen_trinh_khanh_toan);
        HT = (TextView)    findViewById(R.id.tvHienthi);
        T = (RadioButton) findViewById(R.id.radioTien);
        L = (RadioButton) findViewById(R.id.radioLui);
        bC = (Button) findViewById(R.id.btnDem);
        HT.setText(String.valueOf(count));
        bC.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if (T.isChecked()) { // Counting up
		               count++;
		            } else if (L.isChecked()) { // Counting down
		               count--;
		            }
		            HT.setText(String.valueOf(count));
		     }
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nguyen_trinh_khanh_toan, menu);
        return true;
    }
    
}
