package madproject.sliit.com.sliittp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class IpAssigmentActivity extends AppCompatActivity {

    private Button ips,ipc,ipp;

    private final static int FILE_SELECT_CODE =1;

    private StorageReference mStorageref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip_assigment);

        ips=(Button) findViewById(R.id.ips);
        ipp=(Button)findViewById(R.id.ipp);
        ipc=(Button)findViewById(R.id.ipc);

        mStorageref= FirebaseStorage.getInstance().getReference();

        ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFileSelector();
            }

        });



    }
    private void openFileSelector() {
        Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);

        try{
            startActivityForResult(Intent.createChooser(intent,"Select a file to upload"),FILE_SELECT_CODE);
        }catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(this,"Please install a file manager",
                    Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        if (requestCode==FILE_SELECT_CODE && requestCode==RESULT_OK){
            Uri fileUri=data.getData();

            Toast.makeText(this,"You are select a file",Toast.LENGTH_LONG).show();
        }

        super.onActivityResult(requestCode, resultCode, data);
    }










}
