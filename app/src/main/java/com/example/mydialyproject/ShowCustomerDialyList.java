package com.example.mydialyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowCustomerDialyList extends AppCompatActivity {
    Button btnComeBack;
    private TextView texttitle;
    private TextView textcontent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_customer_Dialy_list);

        btnComeBack=(Button) findViewById(R.id.backHome);
        texttitle = (TextView)findViewById(R.id.title);
        textcontent = (TextView)findViewById(R.id.content);

        //getExtras() nhan data
        Intent intent= getIntent();
        Bundle getTitle = intent.getExtras();
        Bundle getContent = intent.getExtras();

        if(getTitle!=null || getContent!=null)
        {
            String j =(String) getTitle.get("Title");
            texttitle.setText(j);
            String P =(String) getContent.get("Content");
            textcontent.setText(P);
        }

        btnComeBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowCustomerDialyList.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
