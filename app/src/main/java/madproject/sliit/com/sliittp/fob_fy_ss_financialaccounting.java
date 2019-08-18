package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fob_fy_ss_financialaccounting extends AppCompatActivity {
    Button btnfinancialtute;
    DownloadManager dm1;
    Button getBtnfinancial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fob_fy_ss_financialaccounting);

        getBtnfinancial=(Button)findViewById(R.id.btnfinancialtute);
        getBtnfinancial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                dm1=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FBusiness%2FfirstYear%2Fsecondsemester%2FTutorial%209.pdf?alt=media&token=192776e9-5ae8-4b68-80bd-8fcd833793ba");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long referance =dm1.enqueue(request);
            }
        });


    }

}
