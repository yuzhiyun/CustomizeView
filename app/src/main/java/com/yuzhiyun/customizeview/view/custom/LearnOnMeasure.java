package com.yuzhiyun.customizeview.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yuzhiyun on 2016-08-01.
 */
public class LearnOnMeasure extends View {
    public LearnOnMeasure(Context context) {
        super(context);
    }

    public LearnOnMeasure(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
