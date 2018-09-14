package com.example.baldwinn20.lecture9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class CircleView extends SurfaceView {

    protected int size;

    public CircleView(Context context, AttributeSet attrs) {

      super(context, attrs);
      setWillNotDraw(false);
      size =50;
    }

    public void onDraw(Canvas canvas) {

        Paint green = new Paint();
        green.setColor(Color.GREEN);

        canvas.	drawCircle(500,400,size, green);
    }

    public void setSize(int sz) {
        size = sz;
        this.invalidate();
    }
}
