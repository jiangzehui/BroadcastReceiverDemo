package com.example.jiangzehui.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by jiangzehui on 17/11/27.
 * 静态注册方式
 */

public class MyReceiver2 extends BroadcastReceiver {

    MyReceiver2.ReceiverCallBack callBack;

    public MyReceiver2(MyReceiver2.ReceiverCallBack callBack) {
        this.callBack = callBack;
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        String content = intent.getStringExtra("content");
        Toast.makeText(context,content,Toast.LENGTH_SHORT).show();
       // callBack.updateUi(content);
    }


    public interface ReceiverCallBack {
        public void updateUi(String content);
    }
}
