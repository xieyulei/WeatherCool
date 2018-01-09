package com.xyl.weathercool.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xyl.weathercool.R;

/**
 * db包用于存放数据库模型相关的代码
 * gson包用于GSON模型相关的代码
 * service包用于存放服务相关的代码
 * util包用于存放工具相关的代码
 *
 *
 * 和风天气登录网址：https://console.heweather.com/my/service
 * String weatherUrl = "http://guolin.tech/api/weather?cityid=" + weatherId + "&key=92b41385da0648fd977aad16da93a4f9";//和风天气api--key
 *
 * 必应每日一图的接口：http://guolin.tech/api/bing_pic
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        if (prefs.getString("weather", null) != null) {
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
