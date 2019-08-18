package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FocSecondYearSemesterTwo extends AppCompatActivity {

    Button btnmad, btndsa, btncn;

    @Override
    protected void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_foc_second_year_semestertwo);

        btnmad = (Button)findViewById(R.id.btnMad);
        btndsa = (Button)findViewById(R.id.btnDsa);
        btncn = (Button)findViewById(R.id.btnCn);

    }

    public void onClickdsa(View view){
        Intent intent = new Intent(this, FocSecondyearSemestertwoMad.class);
        startActivity(intent);
    }
    public void onClickmad(View view){
        Intent intent = new Intent(this, FocSecondyearSemestertwoMad.class);
        startActivity(intent);
    }

    public void onClickcn(View view){
        Intent intent = new Intent(this, FocSecondyearSecondsemestertwoCn.class);
        startActivity(intent);
    }

}
