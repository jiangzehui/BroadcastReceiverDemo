package com.example.jiangzehui.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by jiangzehui on 17/11/27.
 */

public class MyReceiver extends BroadcastReceiver {
    ReceiverCallBack callBack;

    public MyReceiver(ReceiverCallBack callBack) {
        this.callBack = callBack;
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        String content = intent.getStringExtra("content");
        callBack.updateUi(content);
    }


    public interface ReceiverCallBack {
        public void updateUi(String content);
    }
}
