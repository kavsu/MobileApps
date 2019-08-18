package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fob_fy_ss_humanR extends AppCompatActivity {
    Button btnhumantute;
    DownloadManager dm1;
    Button getBtnhumantute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fob_fy_ss_human_r);

        getBtnhumantute=(Button)findViewById(R.id.btnhumantute);
        getBtnhumantute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                dm1=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FBusiness%2FfirstYear%2Fsecondsemester%2FTUTORIAL%2001%20-%20Introduction%20to%20Human%20Resource%20Management.pdf?alt=media&token=8420faef-4998-422a-9920-9d00a4a1f938");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long referance=dm1.enqueue(request);

            }
        });
    }

}
