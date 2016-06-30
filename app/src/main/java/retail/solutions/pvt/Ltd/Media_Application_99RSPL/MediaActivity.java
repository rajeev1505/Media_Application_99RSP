package retail.solutions.pvt.Ltd.Media_Application_99RSPL;

/**
 * Created by rspl-rajeev on 5/4/16.
 */

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.InputType;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.net.ssl.HttpsURLConnection;


public class MediaActivity extends Activity  {

    //develeoped by 99 retail solutions pvt. ltd.
    //all copy right reserved
    //malay dixit
    //madhavi mishra

    ArrayList<Video_Data> videodata = new ArrayList<Video_Data>();
    VideoView videoView;
    TextView textView_scrolling;
    ImageView imageView;
    TextView customerId;
    String Ad_Play, Store_id, Store_Media_Id, startdate, enddate,
            starttime, endtime, Str_store_id, Str_store_media_id, Cust_id, Ad_Play_Click;

    int videoIncrement, imageIncrement = 0;
    ArrayList<Uri> main_ad_video = new ArrayList<Uri>();
    SimpleDateFormat timeFormat;
    SimpleDateFormat Addatetime, Addatetimeforclick;
    private LinearLayout horizontalOuterLayout;
    private HorizontalScrollView horizontalScrollview;
    private int scrollMax;
    private int scrollPos = 0;
    private TimerTask clickSchedule;
    private TimerTask scrollerSchedule;
    private TimerTask faceAnimationSchedule;
    private Timer scrollTimer = null;
    private Timer clickTimer = null;
    private Timer faceTimer = null;
    int clickcount = 0;
    String touch_Count,CustomerMobNumber;
    String videoname;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);


        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(new yourAdapter(this, new String[]{"1", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "11", "12", "13", "14", "15","16","17","18","19","20",
                "21","22","23","24","25","26","27","28","29","30"}));


        //call funtion, create video and image folder in external storage of POS device
        creatFoldervideo1();
        creatFolderimage();


        horizontalScrollview = (HorizontalScrollView) findViewById(R.id.horiztonal_scrollview_id);
        horizontalOuterLayout = (LinearLayout) findViewById(R.id.horiztonal_outer_layout_id);
        horizontalScrollview.setHorizontalScrollBarEnabled(false);
        ViewTreeObserver viewTreeObserver = horizontalOuterLayout.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                horizontalOuterLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                getScrollMaxAmount();
                startAutoScrolling();
                LockScroll();

            }
        });


        Video_DataBase_Helper databasehandler = new Video_DataBase_Helper(getApplicationContext());

        Admainvideo();



        try {

            //Blinking Image code Here.....................................
            imageView = (ImageView) findViewById(R.id.blinking_image_id);
            File imagedir = new File(Environment.getExternalStorageDirectory() + "/1464772267" + "/CLogo");
            Log.e("####******########", imagedir.toString());
            imagedir.mkdir();
            File imageList[] = imagedir.listFiles();
            Bitmap b = BitmapFactory.decodeFile(imageList[imageIncrement].getAbsolutePath());
            imageView.setImageBitmap(b);
            imageView = (ImageView) findViewById(R.id.blinking_image_id);
        }
        catch (Exception e){
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"Company Logo not Found",Toast.LENGTH_SHORT).show();

        }


        try {

            //all retail_ad_ticker call here and set here......................
            final ArrayList array_list = databasehandler.getAllAdTicker();
            Log.e("###############", array_list.toString().replace("[", "").replace("]", "").replace(",", "----"));
            textView_scrolling = (TextView) findViewById(R.id.scrolling_text_id);
            textView_scrolling.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView_scrolling.setSelected(true);
            textView_scrolling.setSingleLine(true);
            textView_scrolling.setText(array_list.toString().replace("[", "").replace("]", "").replace(",", "."));
            Typeface roboto = Typeface.createFromAsset(getApplicationContext().getAssets(),
                    "font/Roboto-Bold.ttf"); //use this.getAssets if you are calling from an Activity
            textView_scrolling.setTypeface(roboto);

        }

        catch (Exception e){

            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"News Stream Not Found",Toast.LENGTH_SHORT).show();
        }

        try{

            //all retail_cust_id call here and set here......................
            final ArrayList array_list_custid = databasehandler.getAllCust_Id();
            Log.e("###############", array_list_custid.toString());
            Cust_id = array_list_custid.get(0).toString();
            customerId = (TextView) findViewById(R.id.SecScr_show_customer_id);
            customerId.setText(Cust_id.toString().replace("[", "").replace("]", "").replace(",", ""));


        }

        catch (Exception e){
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"Customer id not found",Toast.LENGTH_SHORT).show();


        }

    }//onCreate end here.......................






    public void validatevideoname() {

        File videodir = new File(Environment.getExternalStorageDirectory() + "/1464772267" + "/MainAd");

        // File videodir = new File(Environment.getExternalStorageDirectory() + "/99Retail");

        Log.e("####******########", videodir.toString());
        final File[] filest = videodir.listFiles();
        if (videodir.exists() && videodir.isDirectory()) {
            final File[] files = videodir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file != null) {
                        if (file.isDirectory()) {  // it is a folder...
                        } else {  // it is a file...
                            main_ad_video.add(Uri.fromFile(file));
                        }
                    }
                }
            }

        }

        try
        {
            String uriString = String.valueOf(main_ad_video.get(videoIncrement));
            URI uri = new URI(uriString);

            URL videoUrl = uri.toURL();
            File tempFile = new File(videoUrl.getFile());
            videoname = tempFile.getName();
            Log.e("^^^",videoname);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        if(videoname.startsWith("A")){
            //  Toast.makeText(getApplicationContext(),"video's start with A",Toast.LENGTH_LONG).show();
            videoView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    Addatetimeforclick = new SimpleDateFormat("yyyyMMDDHHmmss");

                    final Calendar cal1233 = Calendar.getInstance();

                    Ad_Play_Click = Addatetimeforclick.format(cal1233.getTime());

                    Log.e("%%%%%", Ad_Play_Click.toString());

                    Store_Media_Id = Str_store_media_id;

                    CustomDialogClass cdd = new CustomDialogClass(MediaActivity.this);
                    cdd.show();

                    clickcount = clickcount + 1;
                    if (clickcount == 1) {

                        //  Toast.makeText(getApplicationContext(), "Click : 1", Toast.LENGTH_LONG).show();

                    } else {
                        // Toast.makeText(getApplicationContext(), "Click :" + clickcount, Toast.LENGTH_LONG).show();
                        touch_Count = String.valueOf(clickcount);
                    }


                    return false;
                }
            });
        }


        else {


            videoView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    // do nothing here......
                    return true;
                }
            });


        }



    }


    public void checkWIFIstate() {


        ConnectivityManager connManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mWifi = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        if (mWifi.isConnected()) {
            // Toast.makeText(getApplication(),"WI-fi Enable",Toast.LENGTH_LONG).show();
        } else {

            Toast.makeText(getApplication(), "WI-fi Disable", Toast.LENGTH_LONG).show();


        }
    }



    //create video and image folder in external storage of POS device(Main ad video)
    public void creatFoldervideo1() {

        //  main_ad_video folder Name Specify Here
        File videodir = new File(Environment.getExternalStorageDirectory() + "/1464772267" + "/MainAd");
        Log.e("####******########", videodir.toString());
        if (videodir.exists() && videodir.isDirectory()) {
            final File[] files = videodir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file != null) {
                        if (file.isDirectory()) {  // it is a folder...
                        } else {  // it is a file...
                            main_ad_video.add(Uri.fromFile(file));
                        }
                    }
                }
            }

        } else {
            videodir.mkdir();
        }


    }






    //create image folder in external storage of POS device(company logo)
    public void creatFolderimage() {

        File imagedir = new File(Environment.getExternalStorageDirectory() + "/1464772267"+"/CLogo");
        Log.e("####******########", imagedir.toString());
        imagedir.mkdir();
    }


    //inseet main ad video details into data base here................
    public void Admainvideo() {
        Video_DataBase_Helper databasehandler = new Video_DataBase_Helper(getApplicationContext());

        videodata = new ArrayList<Video_Data>();
        videodata = databasehandler.getVideosDetails();
        Log.e("####", "#####size:" + videodata.size());

        ArrayList<Video_Data> mediaclick = new ArrayList<Video_Data>();
        mediaclick = databasehandler.getAllMediaClick();
        Log.e("####", "#####size:" + mediaclick.size());

        Date date = new Date();
        final CharSequence s = DateFormat.format("yyyy-MM-dd ", date.getTime());
        final Calendar c1 = Calendar.getInstance();
        timeFormat = new SimpleDateFormat("HH:mm:ss");
        Addatetime = new SimpleDateFormat("yyyyMMDDHHmmssmm");

        final List<String> storeidlist = databasehandler.getStoreid();
        Log.e("###############", storeidlist.get(0).toString().replace("[", "").replace("]", ""));
        Str_store_id = storeidlist.get(0).toString().replace("[", "").replace("]", "");


        final List<String> storemediaid = databasehandler.getMediaid();
        Log.e("###############", storemediaid.get(0).toString().replace("[", "").replace("]", ""));
        Str_store_media_id = storemediaid.get(0).toString().replace("[", "").replace("]", "");


        // attach videos to videoview xml and MainAd Video.............
        videoView = (VideoView) findViewById(R.id.videoView1);
        videoView.setVideoURI(main_ad_video.get(videoIncrement));

        videoView.start();
        startdate = s.toString();
        starttime = timeFormat.format(c1.getTime());
        Ad_Play = Addatetime.format(c1.getTimeInMillis());
        Store_id = Str_store_id;
        Store_Media_Id = Str_store_media_id;

        validatevideoname();

        // call setOnPreparedListener for set default mute option........
      /*  videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mp) {

                mp.setVolume(0, 0);
            }
        });*/


        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Calendar c2 = Calendar.getInstance();
                enddate = s.toString();
                Ad_Play = Addatetime.format(c2.getTime());
                endtime = timeFormat.format(c2.getTimeInMillis());
                Video_DataBase_Helper databasehandler = new Video_DataBase_Helper(getApplicationContext());
                databasehandler.getWritableDatabase();

                //video details insert from here...
                databasehandler.insertVideoData(Ad_Play, Store_id, Store_Media_Id, videoname, startdate, enddate, starttime, endtime);

                uploadVideoDetails();




                videoIncrement++;
                if (videoIncrement < main_ad_video.size()) {
                    videoView = (VideoView) findViewById(R.id.videoView1);
                    videoView.setVideoURI(main_ad_video.get(videoIncrement));
                    videoView.start();
                    Calendar c3 = Calendar.getInstance();
                    startdate = s.toString();
                    Ad_Play = Addatetime.format(c3.getTimeInMillis());
                    starttime = timeFormat.format(c3.getTime());
                    enddate = s.toString();
                    endtime = timeFormat.format(c3.getTime());
                    validatevideoname();


                } else {
                    videoIncrement = 0;
                    videoView = (VideoView) findViewById(R.id.videoView1);
                    videoView.setVideoURI(main_ad_video.get(videoIncrement));
                    videoView.start();
                    Calendar c4 = Calendar.getInstance();
                    startdate = s.toString();
                    Ad_Play = Addatetime.format(c4.getTimeInMillis());
                    starttime = timeFormat.format(c4.getTime());
                    enddate = s.toString();
                    endtime = timeFormat.format(c4.getTime());
                }
            }
        });





    }


    public class CustomDialogClass extends Dialog implements
            View.OnClickListener {

        public Activity c;
        public Dialog d;
        public Button customer_ok, customer_cal;
        public EditText Edit_mobile_no;

        public CustomDialogClass(Activity a) {
            super(a);
            // TODO Auto-generated constructor stub
            this.c = a;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.custom_popup);

            customer_ok = (Button) findViewById(R.id.button_cutomer_ok);
            customer_cal = (Button) findViewById(R.id.button_customer_cancel);
            Edit_mobile_no = (EditText) findViewById(R.id.edit_customermobile);


            customer_ok.setOnClickListener(this);
            customer_cal.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_cutomer_ok:
                    Video_DataBase_Helper helper = new Video_DataBase_Helper(getApplicationContext());

                    if (Edit_mobile_no.getText().toString().length() > 10 || Edit_mobile_no.getText().toString().length() != 10) {
                        Edit_mobile_no.setError("Invalid Number");
                        Edit_mobile_no.setInputType(InputType.TYPE_CLASS_PHONE);


                        KeyListener keyListener = DigitsKeyListener.getInstance("1234567890");
                        Edit_mobile_no.setKeyListener(keyListener);
                        return;
                    }

                    if (helper.CheckIsDataAlreadyInDBorNot(Edit_mobile_no.getText().toString()))

                    {
                        Toast toast1 = Toast.makeText(MediaActivity.this, "MOBILE NUMBER ALREADY REGISTERED", Toast.LENGTH_SHORT);
                        toast1.show();
                        return;
                    } else if (helper.InsertdataintoRetail_click(Edit_mobile_no.getText().toString(), Str_store_media_id, Ad_Play, touch_Count))

                    {
                        CustomerMobNumber=Edit_mobile_no.getText().toString();
                        Toast toast = Toast.makeText(MediaActivity.this, "Thank You", Toast.LENGTH_SHORT);
                        toast.show();
                        uploadMediaClickDetails();
                    }

                    dismiss();

                    break;
                case R.id.button_customer_cancel:
                    dismiss();
                    break;
                default:
                    break;
            }
            dismiss();
        }
    }

    public void getScrollMaxAmount() {
        int actualWidth = (horizontalOuterLayout.getMeasuredWidth() - 2048);
        scrollMax = actualWidth;
    }

    /*for Locking Scroll upper side company images*/
    public void LockScroll() {
        ((LockableScrollView) findViewById(R.id.horiztonal_scrollview_id)).setScrollingEnabled(false);
    }


    public void startAutoScrolling() {
        if (scrollTimer == null) {
            scrollTimer = new Timer();
            final Runnable Timer_Tick = new Runnable() {
                public void run() {
                    moveScrollView();
                }
            };

            if (scrollerSchedule != null) {
                scrollerSchedule.cancel();
                scrollerSchedule = null;
            }
            scrollerSchedule = new TimerTask() {
                @Override
                public void run() {
                    runOnUiThread(Timer_Tick);
                }
            };

            scrollTimer.schedule(scrollerSchedule, 10, 10);
        }
    }

    public void moveScrollView() {
        scrollPos = (int) (horizontalScrollview.getScrollX() + 1.0);
        if (scrollPos >= scrollMax) {
            scrollPos = 0;
        }
        horizontalScrollview.scrollTo(scrollPos, 0);

    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void onPause() {
        super.onPause();
        finish();
    }

    public void onDestroy() {
        clearTimerTaks(clickSchedule);
        clearTimerTaks(scrollerSchedule);
        clearTimerTaks(faceAnimationSchedule);
        clearTimers(scrollTimer);
        clearTimers(clickTimer);
        clearTimers(faceTimer);
        clickSchedule = null;
        scrollerSchedule = null;
        faceAnimationSchedule = null;
        scrollTimer = null;
        clickTimer = null;
        faceTimer = null;
        super.onDestroy();
    }

    private void clearTimers(Timer timer) {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    private void clearTimerTaks(TimerTask timerTask) {
        if (timerTask != null) {
            timerTask.cancel();

        }
    }

    private void uploadVideoDetails() {

        class Update extends AsyncTask<Void, Void, String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
              //  loading = ProgressDialog.show(MediaActivity.this, "Updating...", "Wait...", false, false);
              //  loading=ProgressDialog.show(false,false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
               // loading.dismiss();
                //Toast.makeText(MediaActivity.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                HashMap<String, String> hashMap = new HashMap<>();

                hashMap.put(Config.VIDEODATA_ADPLAY,Ad_Play);
                hashMap.put(Config.VIDEODATA_STOREID,Store_id);
                hashMap.put(Config.VIDEODATA_MEDIAID,Store_Media_Id);
                hashMap.put(Config.VIDEODATA_VIDEONAME,videoname);
                hashMap.put(Config.VIDEODATA_STARTDATE,startdate);
                hashMap.put(Config.VIDEODATA_ENDDATE,enddate);
                hashMap.put(Config.VIDEODATA_STARTTIME,starttime);
                hashMap.put(Config.VIDEODATA_ENDTIME,endtime);


                JSONParser jsonParser = new JSONParser();
                String s = jsonParser.sendPostRequest(Config.Link_Upload, hashMap);

                return s;
            }
        }

        Update update = new Update();
        update.execute();
    }



    private void uploadMediaClickDetails() {


        class Update extends AsyncTask<Void, Void, String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
              //  loading = ProgressDialog.show(MediaActivity.this, "Click Updating...", "Wait...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                //loading.dismiss();
                //Toast.makeText(MediaActivity.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                HashMap<String, String> hashMap = new HashMap<>();

                hashMap.put(Config.MEDIACLICK_ADPLAYID,Ad_Play_Click);

                hashMap.put(Config.MEDIACLICK_STOREMEDIAID,Store_Media_Id);
                hashMap.put(Config.MEDIACLICK_MOBILENUMBER,CustomerMobNumber);
                hashMap.put(Config.MEDIACLICK_NUMBEROFCLICK,touch_Count);
                Log.e("mediaclick data",hashMap.toString());

                JSONParser jsonParser = new JSONParser();
                String s = jsonParser.sendPostRequest(Config.Link_Upload_Media_Click, hashMap);

                return s;
            }
        }

        Update update = new Update();
        update.execute();
    }


}