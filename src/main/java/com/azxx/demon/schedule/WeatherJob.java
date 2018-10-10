package com.azxx.demon.schedule;

import com.azxx.demon.modal.TodayWeather;
import com.azxx.demon.utils.HttpUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherJob {

    private static Logger logger = LoggerFactory.getLogger(WeatherJob.class);

    @Value("${weather.query.url}")
    private String url;

    @Scheduled(cron = "0/5 * * * * *")
    public void queryWeather(){
        String result = HttpUtils.httpGet(url,null);
        logger.info(result);
        Gson gson = new Gson();
        JsonObject object =  new JsonParser().parse(result).getAsJsonObject();
        JsonObject data = object.get("data").getAsJsonObject();
        logger.info(data.toString());
        TodayWeather weather = gson.fromJson(data,TodayWeather.class);
        logger.info(weather.toString());
    }
}
