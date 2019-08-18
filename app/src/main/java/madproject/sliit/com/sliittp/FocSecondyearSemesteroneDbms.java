package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocSecondyearSemesteroneDbms extends AppCompatActivity {

    Button dbmsTute;
    DownloadManager dm7;
    Button dbtute,dbpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_secondyear_semesterone_dbms);

        dbmsTute=(Button)findViewById(R.id.dbmsTutes);
        dbmsTute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                dm7 =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FComputing%2FsecondYear%2FfirstSem%2Fdbms%2FDBMS%20Tutes.rar?alt=media&token=21c935e6-0bbd-47ff-8503-39ef9bad51d4");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =dm7.enqueue(request);
            }
        });


        dbtute = (Button)findViewById(R.id.dbmsTutes);
        dbpp = (Button)findViewById(R.id.dbpp);

    }
/*
    public void onClickdbpp(View view){

        Intent intent=new Intent(this,IcsPaperActivity.class);
        startActivity(intent);
    }
    public void onclickicstu(View view){


        Intent intent = new Intent(this,IcsTuteActivity.class);
        startActivity(intent);
    }*/

}
