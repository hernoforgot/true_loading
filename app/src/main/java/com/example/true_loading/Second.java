package com.example.true_loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button23 = (Button)findViewById(R.id.button3);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Second.this,"不好意思，不能注册,页面也是假的",
                        Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}
