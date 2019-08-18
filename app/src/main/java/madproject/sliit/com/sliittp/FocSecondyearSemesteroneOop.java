package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocSecondyearSemesteroneOop extends AppCompatActivity {

    Button oopTute;
    DownloadManager downloadManager;
    Button dbpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_secondyear_semesterone_oop);

        oopTute=(Button)findViewById(R.id.oopTute);
        oopTute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FComputing%2FsecondYear%2FfirstSem%2Foop%2Ftutes%2FOOP%20Tutes.rar?alt=media&token=275cea73-a268-4f76-b0c1-28eaf92ef215");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);
            }
        });
        oopTute=(Button)findViewById(R.id.oopTute);
        oopTute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FComputing%2FsecondYear%2FfirstSem%2Foop%2Ftutes%2FOOP%20Tutes.rar?alt=media&token=275cea73-a268-4f76-b0c1-28eaf92ef215");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);
            }
        });


        oopTute = (Button)findViewById(R.id.dbmsTutes);
        dbpp = (Button)findViewById(R.id.dbpp);

    }

    public void onClickdbpp(View view){

        Intent intent=new Intent(this,IcsPaperActivity.class);
        startActivity(intent);
    }/*
    public void onclickicstu(View view){


        Intent intent = new Intent(this,IcsTuteActivity.class);
        startActivity(intent);
    }

        oopTute = (Button)findViewById(R.id.dbmsTutes);
        dbpp = (Button)findViewById(R.id.dbpp);

    }

    public void onClickdbpp(View view){

        Intent intent=new Intent(this,IcsPaperActivity.class);
        startActivity(intent);
    }/*
    public void onclickicstu(View view){


        Intent intent = new Intent(this,IcsTuteActivity.class);
        startActivity(intent);
    }
*/
}


