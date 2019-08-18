package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FocSecondYearSemesterOne extends AppCompatActivity {
    Button syrse,syrdbms,syrossa,syroop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_secondyear_semesterone);

        syrse=(Button)findViewById(R.id.se);
        syrdbms=(Button)findViewById(R.id.oopTute);
        syrossa=(Button)findViewById(R.id.ossa);
        syroop=(Button)findViewById(R.id.oop);

    }
    public void clickse(View view){
        Intent intent=new Intent(this,FocSecondyearSemesteroneSe.class);
        startActivity(intent);
    }

    public void clickdbms(View view){
        Intent intent=new Intent(this,FocSecondyearSemesteroneDbms.class);
        startActivity(intent);
    }
    public void clickossa(View view){
        Intent intent=new Intent(this,FocSecondyearSemesteroneOssa.class);
        startActivity(intent);
    }
    public void clickoop(View view){
        Intent intent=new Intent(this,FocSecondyearSemesteroneOop.class);
        startActivity(intent);
    }

}
