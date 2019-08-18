package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fob_fy_fs_accounting extends AppCompatActivity {

    Button Btnacctute;
    DownloadManager dm1;
    Button getBtnacctute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fob_fy_fs_accounting);

        getBtnacctute=(Button)findViewById(R.id.btnacctute);
        getBtnacctute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                dm1=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri= Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FBusiness%2FfirstSemester%2FTutorial%202%20-%20FM.pdf?alt=media&token=0d62675d-c246-48ea-b845-733ff32ef9d7");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                long referance =dm1.enqueue(request);


            }
        });

    }

}
