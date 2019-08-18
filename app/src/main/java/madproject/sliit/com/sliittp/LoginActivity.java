package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;
    EditText musername, mpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();

        musername = (EditText)findViewById(R.id.email);
        mpassword = (EditText)findViewById(R.id.pwd);

        findViewById(R.id.textViewSignUp).setOnClickListener(this);
        findViewById(R.id.userLogin).setOnClickListener(this);

    }


    public void userLogin(){
        String email = musername.getText().toString().trim();
        String password = mpassword.getText().toString().trim();

        if(email.isEmpty()){
            musername.setError("Email is required!!");
            musername.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            musername.setError("Please enter valid email");
            musername.requestFocus();
            return;
        }

        if (password.length()<6){
            mpassword.setError("Minimum length of password is 6");
            mpassword.requestFocus();
            return;
        }



        if(password.isEmpty()){
            mpassword.setError("Password is Required!!");
            mpassword.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                        Intent intent = new Intent(LoginActivity.this, FacultyActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View viewwww) {
        switch (viewwww.getId()) {
            case R.id.textViewSignUp:
               startActivity(new Intent(LoginActivity.this,SignUpActivity.class));

                break;

            case R.id.userLogin:
                userLogin();
                break;



        }
    }
}