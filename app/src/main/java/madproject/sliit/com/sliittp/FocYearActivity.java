package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocYearActivity extends AppCompatActivity {

    Button btnFYear, btnSYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_year);

        btnFYear = (Button)findViewById(R.id.btnfocfirstYear);
        btnSYear = (Button)findViewById(R.id.btnfocsecyear);
    }

    public void onClickFyear(View view){
        Intent intent = new Intent(this, FocFirstYearSemActivity.class);
        startActivity(intent);
    }

    public void onClickSyear(View view){
        Intent intent = new Intent(this, FocSecondYearSemester.class);
        startActivity(intent);
    }
}
