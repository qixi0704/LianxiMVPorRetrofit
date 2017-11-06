package yuzhendong.bwie.com.lianximvporretrofit.presenter;



import java.util.List;

import yuzhendong.bwie.com.lianximvporretrofit.bean.MyBean;
import yuzhendong.bwie.com.lianximvporretrofit.model.IModel;
import yuzhendong.bwie.com.lianximvporretrofit.model.ListModel;
import yuzhendong.bwie.com.lianximvporretrofit.model.OnRequestListener;
import yuzhendong.bwie.com.lianximvporretrofit.view.IView;

/**
 * Created by Zhang on 2017/11/6.
 */

public class ListPresenter implements IPresenter {

    private IView iView;
    private IModel iModel;

    public ListPresenter(IView iView) {
        this.iView = iView;
        iModel = new ListModel();
    }

    //model层与view层交互
    @Override
    public void loadList(String url) {
        iModel.RequestData(url, new OnRequestListener() {
            @Override
            public void OnSuccess(List<MyBean.SongListBean> list) {
                iView.showList(list);
            }

            @Override
            public void OnError(String e) {
                iView.showError(e);
            }
        });
    }
}
