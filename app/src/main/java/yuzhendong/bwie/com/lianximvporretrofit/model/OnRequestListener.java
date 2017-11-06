package yuzhendong.bwie.com.lianximvporretrofit.model;



import java.util.List;

import yuzhendong.bwie.com.lianximvporretrofit.bean.MyBean;

/**
 * Created by Zhang on 2017/11/6.
 */

public interface OnRequestListener {
    void OnSuccess(List<MyBean.SongListBean> list);
    void OnError(String e);
}
