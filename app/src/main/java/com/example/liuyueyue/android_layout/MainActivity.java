package com.example.liuyueyue.android_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView title_tv;
    private Button button;
    private ViewStub stub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title_tv = (TextView) findViewById(R.id.title);
        title_tv.setText("自定义布局优化");
        button = (Button) findViewById(R.id.button);
        stub = (ViewStub) findViewById(R.id.stub);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stub.inflate();
            }
        });
    }
}
