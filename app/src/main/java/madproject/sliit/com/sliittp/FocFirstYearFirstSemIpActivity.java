package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocFirstYearFirstSemIpActivity extends AppCompatActivity {
    Button ipp,ipt,ipas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_first_year_first_sem_ip);

        ipp=(Button)findViewById(R.id.btnippp);
        ipt=(Button)findViewById(R.id.btnmit_tute);
        ipas=(Button)findViewById(R.id.ipas);
    }

    public void clickp(View view){
        Intent intent= new Intent(this,IpPaperActivity.class);
        startActivity(intent);

    }
    public void clickt(View view){
        Intent intent = new Intent(this,IpTuteActivity.class);
        startActivity(intent);
    }
    public void clickas(View view12){
        Intent intent = new Intent(this,IpAssigmentActivity.class);
        startActivity(intent);
    }

}
