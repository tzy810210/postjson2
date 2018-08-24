package com.example.lenovo.myapplication.Bean;

/**
 * Created by lenovo on 2018/8/9.
 */

public class Info {
//    {"userId":"aadc2d9fe76f4b89bf37ca738e23eafe","channelId":"b9240eee3b0211e8b64c00163e30445d","cursor": 0}

    String userId;
    String channelId;
    String cursor;

    public Info(String userId, String channelId, String cursor) {
        this.userId = userId;
        this.channelId = channelId;
        this.cursor = cursor;
    }
}
