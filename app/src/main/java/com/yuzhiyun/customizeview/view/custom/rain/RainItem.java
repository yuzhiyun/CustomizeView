package com.yuzhiyun.customizeview.view.custom.rain;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.Random;

public class RainItem {

    private int width;
    private int height;

    private float startX;
    private float startY;
    private float stopX;
    private float stopY;
    private float sizeX;
    private float sizeY;
    private float opt;
    private Paint paint;
    private Random random;

    private int size = 20;
    private int color;
//	private boolean randColor = false;

    public RainItem(int width, int height) {
        this.width = width;
        this.height = height;
        init();
    }

    public RainItem(int width, int height, int size) {
        this.size = size;
        this.width = width;
        this.height = height;
        init();
    }

    public RainItem(int width, int height, int size, int color) {
        this.color = color;
        this.size = size;
        this.width = width;
        this.height = height;
        init();
    }

    public RainItem(int width, int height, int size, int color, boolean randColor) {
//		this.randColor = randColor;
        this.color = color;
        this.size = size;
        this.width = width;
        this.height = height;
        init();
    }

    private void init() {
        random = new Random();
//		sizeX = 1 + random.nextInt(size / 2);
        sizeX = 10;
//		sizeY = 10 + random.nextInt(size);
        sizeY = 30;
        startX = random.nextInt(width);
        startY = random.nextInt(height);
        stopX = startX + sizeX;
        stopY = startY + sizeY;
        opt = 0.2f + random.nextFloat();
        paint = new Paint();

        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);

        paint.setARGB(255, r, g, b);

    }

    public void draw(Canvas canvas) {
        canvas.drawLine(startX, startY, stopX, stopY, paint);
    }

    public void move() {

        startX += sizeX * opt;
        stopX += sizeX * opt;

        startY += sizeY * opt;
        stopY += sizeY * opt;


        if (startY > height) {
            init();
        }
    }

}
