package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocFirstYearSemActivity extends AppCompatActivity {

    Button btnSem1, btnSem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_first_year_sem);

        btnSem1 = (Button)findViewById(R.id.ooc);
        btnSem2 = (Button)findViewById(R.id.btnSem2);

    }

    public void onClickFFSem1(View view){
        Intent intent = new Intent(this, FocFirstYearActivity.class);
        startActivity(intent);
    }
    public void onClickFFSem2(View view){
        Intent intent = new Intent(this, Foc_fy_SSemActivity.class);
        startActivity(intent);
    }
}
