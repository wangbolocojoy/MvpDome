package com.dhuilang.unir.mvpdome.presenter;
import com.dhuilang.unir.mvpdome.MainActivity;
import com.dhuilang.unir.mvpdome.contract.GoodsInfoContract;

/**
* Created by Administrator on 2017/05/18
*/

public class GoodsInfoPresenterImpl implements GoodsInfoContract.Presenter{
    private MainActivity mainActivity;

    public GoodsInfoPresenterImpl(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void clean() {
        mainActivity.doclean();
    }

    @Override
    public void doLogin(String username, String password) {
        if ("wangbo".equals(username) && "123".equals(password)) {
            mainActivity.loginResult(true, "user:" + username + ",pass:" + password);
        }else {
            mainActivity.loginResult(false, "user:" + username + ",pass:" + password);
        }
    }

}