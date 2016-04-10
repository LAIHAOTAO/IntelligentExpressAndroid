package com.eric_lai.intelligentexpress.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.eric_lai.intelligentexpress.R;
import com.eric_lai.intelligentexpress.common.StatusConstant;
import com.eric_lai.intelligentexpress.util.MD5Util;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LoginActivity extends Activity {

    private final String DEBUG = "LoginActivity";

    private int loginCrl = StatusConstant.LOG_INIT;

    @Bind(R.id.userName)
    EditText userNameEdt;

    @Bind(R.id.password)
    EditText passwordEdt;

    @Bind(R.id.loginBtn)
    Button loginBtn;

    @Bind(R.id.signBtn)
    Button signBtn;

    @Bind(R.id.loginTv)
    TextView loginTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        String entrance = this.getIntent().getStringExtra("entrance");
        if (entrance.equals("poster")) {
            loginTv.setText("邮递员登录");
            loginCrl = StatusConstant.LOG_POSTER;
        }
        if (entrance.equals("user")) {
            loginTv.setText("普通用户登录");
            loginCrl = StatusConstant.LOG_USER;
        }
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameEdt.getText().toString();
                String password = passwordEdt.getText().toString();
                password = MD5Util.getMD5String(password);
                Log.d(DEBUG, "userName: " + userName + "password: " + password);
                //TODO: volley与后台接口对比验证密码
                if (loginCrl == StatusConstant.LOG_POSTER) {

                }
                if (loginCrl == StatusConstant.LOG_USER) {

                }
            }
        });
        signBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
