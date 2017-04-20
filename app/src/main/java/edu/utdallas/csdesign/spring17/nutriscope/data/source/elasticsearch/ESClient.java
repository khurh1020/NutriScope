package edu.utdallas.csdesign.spring17.nutriscope.data.source.elasticsearch;

import android.util.Log;

import java.io.IOException;

import edu.utdallas.csdesign.spring17.nutriscope.data.source.ndb.AutoSuggestService;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kenneth Hurh on 4/20/2017.
 */

public class ESClient {
    private static final String TAG = "ESClient";

    ESService service;

    public ESClient(){

        OkHttpClient.Builder client = new OkHttpClient.Builder();
        //add query parameters like credentials
        client.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                HttpUrl originalHttpUrl = original.url();
                Log.d(TAG, originalHttpUrl.encodedPath());

                HttpUrl url = originalHttpUrl.newBuilder()
                        .build();

                Log.d(TAG, url.toString());

                Request.Builder requestBuilder = original.newBuilder()
                        .url(url);

                Request request = requestBuilder.build();
                return chain.proceed(request);

            }
        });
//logs response
        client.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();

                Log.d(TAG, original.url().toString());


                Response response = chain.proceed(original);
                Log.d(TAG, response.body().string());
                return response;
            }
        });

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        client.addNetworkInterceptor(interceptor);

        OkHttpClient httpClient = client.build();

        Retrofit retrofit = new Retrofit.Builder().client(httpClient).baseUrl("https://search-ndb-wgyzllq2pfef5gh7jmuusfgfvm.us-east-1.es.amazonaws.com/").addConverterFactory(GsonConverterFactory.create()).build();

        service = retrofit.create(ESService.class);
    }



}
