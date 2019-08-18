package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FocFirstYearActivity extends AppCompatActivity {

    Button btnmit, btnip, btnics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foc_first_year);

        btnics = (Button)findViewById(R.id.btnICS);
        btnip = (Button)findViewById(R.id.btnIP);
        btnmit = (Button)findViewById(R.id.ooc);
    }

    public void onClickip(View view){
        Intent intent = new Intent(this, FocFirstYearFirstSemIpActivity.class);
        startActivity(intent);
    }
    public void onClickics(View view){
        Intent intent = new Intent(this, FocFirstYFirstSemIcsActivity.class);
        startActivity(intent);
    }
    public void onClickmit(View view){
        Intent intent = new Intent(this, FocFirstYearFirstSemMitActivity.class);
        startActivity(intent);
    }
}
