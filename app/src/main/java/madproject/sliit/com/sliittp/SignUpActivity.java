package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class SignUpActivity extends AppCompatActivity  implements OnClickListener{

    private FirebaseAuth mAuth;

    EditText musername, mpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mAuth = FirebaseAuth.getInstance();

        musername = (EditText)findViewById(R.id.email);
        mpassword = (EditText)findViewById(R.id.pwd);

        findViewById(R.id.userSignUp).setOnClickListener(this);
        findViewById(R.id.txtLogin).setOnClickListener(this);



    }

    public void registerUser(){
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
            mpassword.setError("Minimum length of password is should be 6");
            mpassword.requestFocus();
            return;
        }



        if(password.isEmpty()){
            mpassword.setError("Password is Required!!");
            mpassword.requestFocus();
            return;
        }


        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Intent intent1 = new Intent(SignUpActivity.this, LoginActivity.class);
                        intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent1);
                    }
                    else{
                        if(task.getException() instanceof FirebaseAuthUserCollisionException){
                            Toast.makeText(getApplicationContext(), "You are already registered.",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(getApplicationContext(), task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
            }

        });

    }

    @Override
    public void onClick(View viewsi) {
        switch (viewsi.getId()){
            case R.id.userSignUp:
                registerUser();
                break;

            case R.id.txtLogin:
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }

    }
}
