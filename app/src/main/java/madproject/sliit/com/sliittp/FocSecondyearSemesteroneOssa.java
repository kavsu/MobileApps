package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocSecondyearSemesteroneOssa extends AppCompatActivity {

    Button ossaTute,ossapp;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_secondyear_semesterone_ossa);

        ossaTute =(Button)findViewById(R.id.ossaTute);
        ossaTute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FComputing%2FfirstYear%2FsemesterOne%2Fics%2Ftutes%2FTutorials.zip?alt=media&token=d8351255-c942-405e-b6c7-fca8a92ac325");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);
            }
        });




        ossapp = (Button)findViewById(R.id.ossapp);
        ossaTute = (Button)findViewById(R.id.ossaTute);
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

