package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocSecondyearSecondsemestertwoCn extends AppCompatActivity {

    Button cnTute,cnpp;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_secondyear_secondsemestertwo_cn);

            cnTute =(Button)findViewById(R.id.cnTute);
            cnTute.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view1) {
                    downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FComputing%2FsecondYear%2FsecondSem%2Fcn%2Ftutes%2FCN%20Tutes.zip?alt=media&token=198d76fb-2479-4219-8625-f4d6d05b8106");
                    DownloadManager.Request request = new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    Long reference =downloadManager.enqueue(request);
                }
            });




            cnpp = (Button)findViewById(R.id.cnpp);
            //Btnicstu = (Button)findViewById(R.id.btnicstute);
        }/*
    public void onClickcnpp(View view){

        Intent intent=new Intent(this,IcsPaperActivity.class);
        startActivity(intent);
    }
*/
    }
