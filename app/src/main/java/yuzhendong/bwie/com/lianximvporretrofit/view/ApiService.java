package yuzhendong.bwie.com.lianximvporretrofit.view;



import retrofit2.http.GET;
import rx.Observable;
import yuzhendong.bwie.com.lianximvporretrofit.bean.MyBean;

/**
 * Created by Zhang on 2017/11/6.
 */

public interface ApiService {

    @GET("v1/restserver/ting?method=baidu.ting.billboard.billList&type=1&size=30&offset=0")
    Observable<MyBean> getdatas();
}
