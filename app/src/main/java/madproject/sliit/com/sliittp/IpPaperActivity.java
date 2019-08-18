package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IpPaperActivity extends AppCompatActivity {
    Button btniptu;
    DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip_paper);

        btniptu=(Button)findViewById(R.id.btnmit_tute);
        btniptu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/ER%20Diagram(ITP_2018_K_G10).pdf?alt=media&token=2b406e65-0761-425a-8226-5d7c4d96408c");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =downloadManager.enqueue(request);


            }
        });

    }
}
