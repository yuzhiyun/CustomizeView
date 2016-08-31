package com.yuzhiyun.customizeview.model.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by yuzhiyun on 2016-07-30.
 */
public class toast {
    private static Toast toast;

    public static void showToast(Context context,String content){
        if(null==toast)
            toast=Toast.makeText(context,content,Toast.LENGTH_LONG);
        else
            toast.setText(content);
        toast.show();
    }

}


