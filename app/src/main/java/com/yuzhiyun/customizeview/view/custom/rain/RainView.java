package com.yuzhiyun.customizeview.view.custom.rain;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import java.util.ArrayList;

public class RainView extends BaseView {

    private ArrayList<RainItem> list = new ArrayList<RainItem>();
    private int rainNum = 80;
    private int size = 30;
    private int rainColor;
    private boolean randColor;

    public RainView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RainView(Context context) {
        super(context);
    }

    @Override
    protected void drawSub(Canvas canvas) {
        for (RainItem item : list) {
            item.draw(canvas);
        }
    }

    /**
     *
     */
    @Override
    protected void logic() {
        for (RainItem item : list) {
            item.move();
        }
    }

    @Override
    protected void init() {
        for (int i = 0; i < rainNum; i++) {
//			RainItem item = new RainItem(getWidth(), getHeight(), size, rainColor, randColor);
            RainItem item = new RainItem(getWidth(), getHeight(), size, rainColor);
            list.add(item);
        }
    }

}
