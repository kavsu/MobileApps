package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FobYearActivity extends AppCompatActivity {

    Button btnbmy1, btnbmy2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fob_year);
    }

    public void onClickY1(View view){
        btnbmy1 = (Button)findViewById(R.id.btnBMY2Sem1);
        Intent intent = new Intent(this, Fob_FirstY_FSemActivity.class);
        startActivity(intent);
    }
    public void onClickY2(View view){
        btnbmy1 = (Button)findViewById(R.id.btnBMY2Sem2);
        Intent intent = new Intent(this, Fob_FirstY_SSemActivity.class);
        startActivity(intent);
    }
}
