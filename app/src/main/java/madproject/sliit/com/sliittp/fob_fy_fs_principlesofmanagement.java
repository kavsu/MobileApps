package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fob_fy_fs_principlesofmanagement extends AppCompatActivity {
    Button btnpriman;
    DownloadManager dm1;
    Button getBtnpriman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fob_fy_fs_principlesofmanagement);

        getBtnpriman=(Button)findViewById(R.id.btnacctute);
        getBtnpriman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                dm1=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FBusiness%2FfirstSemester%2FTutorial%2007%20%E2%80%93%20Reward%20Management%20and%20Grievance%20Handling.pdf?alt=media&token=f8c91801-83db-47a6-9355-50e82a7cb372");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long referance=dm1.enqueue(request);

            }
        });

    }
}
