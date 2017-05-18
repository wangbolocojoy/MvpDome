package com.dhuilang.unir.mvpdome.contract;

/**
 * Created by 王波
 * on 2017/5/18 17:28.
 */

public class GoodsInfoContract {
    
public interface View{
    public void doclean();
    public void loginResult(boolean isSuccess,String messing);
}

public interface Presenter{
    public void clean();

    public void doLogin(String username, String password);

}

public interface Model{
}


}