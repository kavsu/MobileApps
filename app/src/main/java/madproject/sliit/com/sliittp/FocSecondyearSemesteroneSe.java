package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocSecondyearSemesteroneSe extends AppCompatActivity {

    Button seTute,sepp;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_secondyear_semesterone_se);

        seTute =(Button)findViewById(R.id.seTute);
        seTute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FComputing%2FsecondYear%2FfirstSem%2Fossa%2Ftutes%2FOSSA%20Tutes.zip?alt=media&token=d3546c30-3d9a-4878-afdc-c7ea23e4ac9e");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);
            }
        });

        sepp =(Button)findViewById(R.id.sepp);
        sepp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FComputing%2FsecondYear%2FfirstSem%2Fse%2Fpastpapers%2FSE%20PastPapers.zip?alt=media&token=09fb13ec-1bfd-4754-a04c-3ca951e52434");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);
            }
        });




        sepp = (Button)findViewById(R.id.sepp);
        //Btnicstu = (Button)findViewById(R.id.btnicstute);
    }/*
    public void onClickicspp(View view){

        Intent intent=new Intent(this,IcsPaperActivity.class);
        startActivity(intent);
    }
*/
}

