package yuzhendong.bwie.com.lianximvporretrofit.view;



import java.util.List;

import yuzhendong.bwie.com.lianximvporretrofit.bean.MyBean;

/**
 * Created by Zhang on 2017/11/6.
 */

public interface IView {
    void showList(List<MyBean.SongListBean> list);
    void showError(String e);
}
