package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Foc_fy_SSemActivity extends AppCompatActivity {

    Button btniwt,btnooc,btnps,btnisdmm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_fy_ssem);
        btniwt = (Button)findViewById(R.id.iwt);
        btnooc = (Button)findViewById(R.id.ooc);
        btnps = (Button)findViewById(R.id.ps);
        btnisdmm = (Button)findViewById(R.id.isdm);

    }
    public void onclickiwt(View view){
        Intent intent=new Intent(this,Foc_fy_ss_iwtActivity.class);
        startActivity(intent);
    }
    public void onclickooc(View view){
        Intent intent=new Intent(this,Foc_fy_ss_oocActivity.class);
        startActivity(intent);

    }
    public void onclickps(View view){
        Intent intent = new Intent(this,Foc_fy_ss_psActivity.class);
        startActivity(intent);
    }
    public void onclickisdm(View view){
        Intent intent = new Intent(this,Foc_fy_ss_spmActivity.class);
        startActivity(intent);
    }
}
