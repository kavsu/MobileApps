package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FacultyActivity extends AppCompatActivity {

    Button btnfoc, btnfob;

    @Override
    protected void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_faculty);

        btnfoc = (Button)findViewById(R.id.ooc);
        btnfob = (Button)findViewById(R.id.btnBM);

    }

    public void onClickfoc(View view){
        Intent intent = new Intent(this, FocYearActivity.class);
        startActivity(intent);
    }
    public void onClickfob(View view){
        Intent intent = new Intent(this, FobYearActivity.class);
        startActivity(intent);
    }



}
