package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fob_FirstY_FSemActivity extends AppCompatActivity {

    Button sem1, sem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fob__firsty_firstsem);

        sem1 = (Button)findViewById(R.id.btnFsem);
        sem2 = (Button)findViewById(R.id.btnSem02);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fob_FirstY_FSemActivity.this, fob_fy_fs_subjects.class);
                startActivity(intent);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Fob_FirstY_FSemActivity.this, fob_fy_ss_subjects.class);
                startActivity(intent2);
            }
        });
    }

}
