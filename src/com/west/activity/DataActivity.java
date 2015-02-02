package com.west.activity;

import com.west.interfaces.OnTimeChangedListener;
import com.west.utils.WestTimer;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 *
 * DataActivity
 * @author chendong
 * 2015��1��30�� ����2:16:28
 * @version 1.0.0
 *
 */
public class DataActivity extends Activity implements OnTimeChangedListener{

	private WestTimer mWestTimer = null;
	
	private TextView timeText = null;
	
	private static final String TAG = "DataActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.timertext);
		
		timeText = (TextView)findViewById(R.id.main_clock_time);
		
		mWestTimer = WestTimer.getTimer();
		mWestTimer.registerTimer(this);
		mWestTimer.start();
	}

	@Override
	public void change(String time) {
		timeText.setText(time);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy");
		if(mWestTimer != null)
			mWestTimer.stop();
	}
	
}
