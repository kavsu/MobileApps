package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocFirstYearFirstSemMitActivity extends AppCompatActivity {

    Button mitt,mitp,mitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_first_year_first_sem_mit);

        mitp=(Button)findViewById(R.id.btnmit_tute);
        mitp=(Button)findViewById(R.id.btnippp);
    }
    public void clickmt(View view1){
        Intent intent1=new Intent(this,MitTuteActivity.class);
        startActivity(intent1);
    }
    public void clickmp(View view2){
        Intent intent2 =new Intent(this,MitPaperActivity.class);
        startActivity(intent2);
    }

    public void clickmitas(View view){
        Intent intent=new Intent(this,MitAssignmentActivity.class);
        startActivity(intent);
    }



}
