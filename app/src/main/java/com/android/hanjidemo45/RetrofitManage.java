package com.android.hanjidemo45;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/9/17.
 */
public class RetrofitManage {


    /**
     *  建立 一个单例的模式
     */
    private  RetrofitManage() {
    }
    public  static RetrofitManage getInstance(){
        return  RetrofitManager.retrofitmanage;

    }
    private static class RetrofitManager{
        private static final RetrofitManage retrofitmanage = new RetrofitManage();
    }
    public void  sendRequest(String url){
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(url)
               // .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }



}
