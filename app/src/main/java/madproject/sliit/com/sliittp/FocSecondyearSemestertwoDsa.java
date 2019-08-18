package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FocSecondyearSemestertwoDsa extends AppCompatActivity {

    Button dsaTute,dsapp;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_foc_secondyear_semestertwo_dsa);

        dsaTute =(Button)findViewById(R.id.dsaTute);
        dsaTute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FComputing%2FsecondYear%2FsecondSem%2Fdsa%2Ftutes%2FDSA%20Tutes.zip?alt=media&token=8c4ee2c4-e4a1-4664-993f-2d9a79140f9d");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);
            }
        });




        dsapp = (Button)findViewById(R.id.dsapp);
        dsaTute = (Button)findViewById(R.id.dsaTute);
    }
    public void onClickicspp(View view){

        Intent intent=new Intent(this,IcsPaperActivity.class);
        startActivity(intent);
    }
    public void onclickicstu(View view){


        Intent intent = new Intent(this,IcsTuteActivity.class);
        startActivity(intent);
    }
}

