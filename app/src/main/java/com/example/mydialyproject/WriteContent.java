package com.example.mydialyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WriteContent extends AppCompatActivity {
    EditText edtWriteContent, edtTitle;
    Button btnSaveContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_content);
        btnSaveContent =(Button)findViewById(R.id.btnSaveContentent);
        edtWriteContent=(EditText) findViewById(R.id.edtWrite);
        edtTitle =( EditText) findViewById(R.id.edtTitle);

        btnSaveContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Title = edtTitle.getText().toString();
                String Content = edtWriteContent.getText().toString();
                Intent intent = new Intent(WriteContent.this, ShowCustomerDialyList.class);
                intent.putExtra("Title", Title);
                intent.putExtra("Content", Content);
                startActivity(intent);
            }
        });
    }
}
