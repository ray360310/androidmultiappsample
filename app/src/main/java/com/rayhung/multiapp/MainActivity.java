package com.rayhung.multiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView packageNameTxw;
    private String packageNameStr = "";

    private Button checkDetailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
    }

    private void initialView(){
        packageNameTxw = findViewById(R.id.main_packagename_txw);
        checkDetailBtn = findViewById(R.id.main_checkdetail_btn);
        checkDetailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,DetailActivity.class);
                startActivity(intent);
            }
        });
        getPackageNameFunction();
    }

    private void getPackageNameFunction(){
        packageNameStr = getApplicationContext().getPackageName();
        packageNameTxw.setText("PackageName：" + packageNameStr);
    }

}
