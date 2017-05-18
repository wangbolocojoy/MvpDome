package com.dhuilang.unir.mvpdome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dhuilang.unir.mvpdome.contract.GoodsInfoContract;
import com.dhuilang.unir.mvpdome.presenter.GoodsInfoPresenterImpl;

public class MainActivity extends AppCompatActivity implements GoodsInfoContract.View, View.OnClickListener {

    private EditText editText_user;
    private EditText editText_pass;
    private Button button_clean;
    private Button button_login;
    private GoodsInfoPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        presenter=new GoodsInfoPresenterImpl(this);

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_clean:
                presenter.clean();
                break;
            case R.id.button_login:
                presenter.doLogin(editText_user.getText().toString(), editText_pass.getText().toString());
                break;
        }
    }

    @Override
    public void doclean() {
        editText_user.setText("");
        editText_pass.setText("");
    }

    @Override
    public void loginResult(boolean isSuccess, String messing) {
        if (isSuccess) {
            Toast.makeText(MainActivity.this, "登陆成功：" + messing, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "登陆失败", Toast.LENGTH_SHORT).show();
        }
    }

    private void initView() {
        editText_user = (EditText) findViewById(R.id.editText_user);
        editText_pass = (EditText) findViewById(R.id.editText_pass);
        button_clean = (Button) findViewById(R.id.button_clean);
        button_login = (Button) findViewById(R.id.button_login);

        button_clean.setOnClickListener(this);
        button_login.setOnClickListener(this);
    }

    private void submit() {
        // validate
        String user = editText_user.getText().toString().trim();
        if (TextUtils.isEmpty(user)) {
            Toast.makeText(this, "Username", Toast.LENGTH_SHORT).show();
            return;
        }

        String pass = editText_pass.getText().toString().trim();
        if (TextUtils.isEmpty(pass)) {
            Toast.makeText(this, "Password", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
