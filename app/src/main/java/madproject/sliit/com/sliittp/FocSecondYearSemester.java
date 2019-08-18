package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FocSecondYearSemester extends AppCompatActivity {

    Button btnFSem, btnSSem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_scondyear_semester);

        btnFSem = (Button)findViewById(R.id.btnY2Sem1);
        btnSSem = (Button)findViewById(R.id.btnY2Sem2);
    }

    public void onClickSem1(View view){
        Intent intent = new Intent(this, FocSecondYearSemesterOne.class);
        startActivity(intent);
    }

    public void onClickSem2(View view){
        Intent intent = new Intent(this, FocSecondYearSemesterTwo.class);
        startActivity(intent);
    }
}
