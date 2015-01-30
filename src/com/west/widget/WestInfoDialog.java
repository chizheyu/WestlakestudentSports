package com.west.widget;

import android.app.AlertDialog;
import android.content.Context;

public class WestInfoDialog {

	public static void show(Context context,String title,String msg){
		if(title == null)
			title = "��ʾ";
		new AlertDialog.Builder(context).setTitle(title).setMessage(msg).setPositiveButton("ȷ��", null)
		.setIcon(android.R.drawable.ic_dialog_alert).show();
	}
	
	
	public static void showInfo(Context context,String title,String msg){
		if(title == null)
			title = "��ʾ";
		new AlertDialog.Builder(context).setTitle(title).setMessage(msg).setPositiveButton("ȷ��", null)
		.setIcon(android.R.drawable.ic_dialog_info).show();
	}
}
