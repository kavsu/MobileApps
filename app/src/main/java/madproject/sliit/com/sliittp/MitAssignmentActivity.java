package madproject.sliit.com.sliittp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.OpenableColumns;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;

import java.io.File;

public class MitAssignmentActivity extends AppCompatActivity {

    Button btnmit_tute;
    DownloadManager dm1;
    private Button mits,mitp,mitc;

    private final static int FILE_SELECT_CODE =1;

    private StorageReference mStorageRef;
    private StorageTask mstoragetask;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mit_assignment);

        btnmit_tute =(Button)findViewById(R.id.btnmit_tute);
        btnmit_tute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                dm1 =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/sliittp.appspot.com/o/Faculty%2FComputing%2FsecondYear%2FfirstSem%2Fse%2Fpastpapers%2FSE%20PastPapers.zip?alt=media&token=09fb13ec-1bfd-4754-a04c-3ca951e52434");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference =dm1.enqueue(request);
            }
        });



        mits=(Button) findViewById(R.id.mits);
        mitp=(Button)findViewById(R.id.mitp);
        mitc=(Button)findViewById(R.id.mitc);


        mStorageRef = FirebaseStorage.getInstance().getReference();

        mits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFileSelector();
            }

        });
        mitp.setOnClickListener(new View.OnClickListener() {


            String btnText=mitp.getText().toString();

            public void onClick(View view) {
                if (btnText.equals("Pause Upload")) {
                    mstoragetask.pause();
                    mitp.setText("Resum Upload");
                }
                else{
                    mstoragetask.resume();
                    mitp.setText("Pause Upload");
                }
            }
        });
        mitc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mstoragetask.cancel();
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

            String uriString=fileUri.toString();

            File myfile = new File(uriString);
            String path= myfile.getAbsolutePath();

            String displayName=null;

            if (uriString.startsWith("content://")){
                Cursor cursor = null;
                try {
                  cursor = MitAssignmentActivity.this.getContentResolver().query(fileUri,null,null,null,null);
                  if (cursor != null && cursor.moveToFirst()){
                      displayName = cursor.getString(cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME));
                  }
                }finally {
                    cursor.close();
                }
                }else if (uriString.startsWith("file://")){
                    displayName = myfile.getName();
            }



            StorageReference riversRef = mStorageRef.child("files/"+displayName);

            mstoragetask=riversRef.putFile(fileUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            // Get a URL to the uploaded content
                            Uri downloadUrl = taskSnapshot.getDownloadUrl();

                            Toast.makeText(MitAssignmentActivity.this,"File Upload",
                             Toast.LENGTH_SHORT).show();

                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception exception) {
                            // Handle unsuccessful uploads
                            // ...

                            Toast.makeText(MitAssignmentActivity.this,"There was an error in upload",
                                    Toast.LENGTH_SHORT).show();
                        }
                    });
        }

        super.onActivityResult(requestCode, resultCode, data);
    }





}
