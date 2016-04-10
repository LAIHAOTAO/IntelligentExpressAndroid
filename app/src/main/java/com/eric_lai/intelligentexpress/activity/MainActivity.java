package com.eric_lai.intelligentexpress.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.eric_lai.intelligentexpress.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @OnClick(R.id.posterEntrance)
    void toLoginPost() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        intent.putExtra("entrance", "poster");
        startActivity(intent);
    }

    @OnClick(R.id.userEntrance)
    void toLoginUser() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        intent.putExtra("entrance", "user");
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
