package com.app.jurnalkelas.util.api;

public class UtilsApi {


    public static final String BASE_URL = "http://kirana-web.000webhostapp.com/";
    public static final String BASE_URL_API = BASE_URL +  "restapi/";
    public static final String BASE_URL_WEBVIEW = BASE_URL + "webview/";

    // Mendeklarasikan Interface BaseApiService
    //@org.jetbrains.annotations.NotNull
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
