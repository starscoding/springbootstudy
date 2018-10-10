package com.azxx.demon.utils;

import com.azxx.demon.modal.TodayWeather;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Test;


public class HttpUtilsTest {

    @Test
    public void testGet(){
        String url = "http://api.help.bj.cn/apis/weather6d/?id=101280601";
//        String result = "{\"data\":\"abc\"}";
        String result = HttpUtils.httpGet(url,null);
//        String result = "{\"data\":{\"yesterday\":{\"date\":\"9日 星期二\",\"temphigh\":\"30\",\"wind\":\"无持续风向\",\"templow\":\"24\",\"windforce\":\"<![CDATA[<3级]]>\",\"weather\":\"多云\"},\"city\":\"深圳\",\"aqi\":\"92\",\"forecast\":[{\"date\":\"10日 星期三\",\"temphigh\":\"28\",\"windforce\":\"<![CDATA[<3级]]>\",\"templow\":\"23\",\"wind\":\"无持续风向\",\"weather\":\"阵雨\"},{\"date\":\"11日 星期四\",\"temphigh\":\"26\",\"windforce\":\"<![CDATA[3-4级]]>\",\"templow\":\"20\",\"wind\":\"东北风\",\"weather\":\"小雨\"},{\"date\":\"12日 星期五\",\"temphigh\":\"27\",\"windforce\":\"<![CDATA[<3级]]>\",\"templow\":\"21\",\"wind\":\"无持续风向\",\"weather\":\"多云\"},{\"date\":\"13日 星期六\",\"temphigh\":\"29\",\"windforce\":\"<![CDATA[<3级]]>\",\"templow\":\"23\",\"wind\":\"无持续风向\",\"weather\":\"多云\"},{\"date\":\"14日 星期天\",\"temphigh\":\"28\",\"windforce\":\"<![CDATA[<3级]]>\",\"templow\":\"23\",\"wind\":\"无持续风向\",\"weather\":\"多云\"}],\"life\":\"各项气象条件适宜，无明显降温过程，发生感冒机率较低。\",\"temp\":\"23\"},\"status\":0,\"msg\":\"实时+4day+昨天+AQI\"}";
        System.out.println(result);
        Gson gson = new Gson();
        JsonObject object =  new JsonParser().parse(result).getAsJsonObject();
        JsonObject data = object.get("data").getAsJsonObject();
        System.out.println(data);
        TodayWeather weather = gson.fromJson(data,TodayWeather.class);
        System.out.println(weather.toString());
    }

}