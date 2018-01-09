package com.xyl.weathercool;

/**
 * -------------------------
 * Author：doraemon
 * Created by xyl on 2018/1/9.
 * ---------------------------
 * This class is used for:
 *
 */

public class Note {

    /**
     * 第一阶段
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
     */


    /**
     * 第二阶段
     *
     * 第一部分：遍历全国省市县数据
     *
     * 在util包新增HttpUtil类，用户获取服务端的省市县数据，负责与服务端的交互
     *
     *
     */


}
