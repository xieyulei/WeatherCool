package com.xyl.weathercool;

/**
 * -------------------------
 * Author：doraemon
 * Created by xyl on 2018/1/9.
 * ---------------------------
 * This class is used for:
 */

public class Note {

    /**
     *
     * 第一部分：引入外部依赖库
     *
     * 依赖库在：app/build.gradle 中进行编辑，在denpendencies闭包中添加四个依赖库，分别为：数据库依赖、网络请求依赖、GSON依赖、Glide依赖；
     * 数据库依赖： compile 'org.litepal.android:core:1.3.2'
     * 网络请求依赖：compile 'com.squareup.okhttp3:okhttp:3.4.1'
     * GSON : 'com.google.code.gson:gson:2.7'
     * Glide: 'com.github.bumptech.glide:glide:3.7.0'
     *
     *
     * 第二部分：设计数据库的表结构
     *
     * 分别设置省、市、县，分别对应实体类：Province、City、County ;
     *
     *
     * 第三部分：遍历全国省市县数据
     *
     * 在util包新增HttpUtil类，用户获取服务端的省市县数据，负责与服务端的交互
     * 在util包新增Utility类，用于解析和处理Json数据：分别提供handleProvincesResponse()、handleCitiesResponse()、handleCountiesResponse()用于解析省市县的Json数据
     * 处理方式都比较类似，先使用JSONArray和JSONObject将数据解析出来，然后组装成实体类对象，再调用save方法将数据存储到数据库当中
     * 书写布局，加载页面，遍历查询，优先从数据库中查找，如查询不到就从网络获取并解析，同时添加网络权限
     *
     *
     * 第四部分：显示天气信息
     *
     * 定义GSON实体类,分别为：basic、aqi、now、suggestion、daily_forecast
     * 在Utility类中添加一个用于解析JSON数据的方法--handleWeatherResponse
     * 编写WeatherActivity，显示天气信息
     *
     *
     * 第五部分：部分功能优化
     *
     *  获取每日必应一图，同时为系统状态栏留出空间
     *  手动更新天气和切换城市，加入下滑刷新以及抽屉栏目
     *  后台自动更新天气信息
     *  修改图标和名称
     *
     *
     * 第六部分：应用发布
     *
     *  生成正式签名的APK文件,(studio可视化工具或gradle生成）
     *  可根据应用发布不同的平台，多渠道生成APK
     *  if 传入360应用商店，则申请360开发者账号，上传之后使用360加固保，加固之后生成的新文件未签名，需要手动进行签名
     *  填写发布相关信息，如：应用简介、版本介绍、应用截图、
     *
     *
     *  第七部分：应用链接广告模块
     *  注册腾讯广告联盟账号，新建媒体和广告位
     *  接入广告SDK，升级版本
     *  修改app:build.gradle中的 versionCode 与 versionName 参数，之前为 1 、1.0,升级版本可写为：versionCode 2 、versionName "1.1"
     *  重新发布应用，需要注意：每个版本的versionCode与versionName都不能喝其他版本相同，且新版应用的版本号必须大于老版应用的版本号。
     *  上传后仍然会提示：应用的安全系数较低，我们只需要像之前同样的方式进行加固就可以了
     *
     *
     */


}
