package com.example.videoeditingproject;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;


@SuppressLint("NewApi") public class MainActivity extends Activity {

	String uri = "/storage/emulated/O/WhatsAPP/Media/WhatsAPP Video/VID-20150927-WA00.mp4";

	 @TargetApi(Build.VERSION_CODES.GINGERBREAD_MR1) @SuppressLint("NewApi") @Override
	 protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_main);
	  try {
		
	
	  ImageView capturedImageView = (ImageView)findViewById(R.id.VideoImageview);

	  MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();

	  mediaMetadataRetriever.setDataSource(uri);
	  Bitmap bmFrame = mediaMetadataRetriever.getFrameAtTime(5000000); //unit in microsecond
	  capturedImageView.setImageBitmap(bmFrame);
	  } catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	 }//end of oncreate
   
}//end of Activity
