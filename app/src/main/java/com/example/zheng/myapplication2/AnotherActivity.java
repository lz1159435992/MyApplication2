package com.example.zheng.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                Toast.makeText(AnotherActivity.this,intent.getStringExtra("warnning"), Toast.LENGTH_LONG).show();
                intent.putExtra("result",intent.getStringExtra("warnning")+"don't come back");
                setResult(0,intent);
                finish();
            }
        });
    }
}
