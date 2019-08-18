package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fob_fy_fs_itforbussiness extends AppCompatActivity {
    Button btnitforbm;
    DownloadManager dm1;
    Button getBtnitforbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fob_fy_fs_itforbussiness);

        getBtnitforbm = (Button) findViewById(R.id.btnitforbm);
        getBtnitforbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                dm1 = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FBusiness%2FfirstSemester%2FTutorial%2005%20-%20Performance%20Management.pdf?alt=media&token=96b2c6b8-ee9e-4533-b4b2-741ff422280c");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long referance = dm1.enqueue(request);

            }
        });

    }


}
