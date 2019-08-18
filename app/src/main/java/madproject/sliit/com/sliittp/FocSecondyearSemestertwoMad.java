package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocSecondyearSemestertwoMad extends AppCompatActivity {

    Button madTute,madpp;
    DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_secondyear_semestertwo_mad);

        madTute =(Button)findViewById(R.id.madTute);
        madTute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                downloadManager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FComputing%2FsecondYear%2FsecondSem%2Fmad%2Ftutes%2FMAD%20Tute.zip?alt=media&token=a914e51d-a6e3-44ea-87b5-be86c84e1725");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);
            }
        });




        madpp = (Button)findViewById(R.id.madpp);
        madTute = (Button)findViewById(R.id.madTute);
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
