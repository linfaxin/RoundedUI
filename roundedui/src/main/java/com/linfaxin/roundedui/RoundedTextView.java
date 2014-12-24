package com.linfaxin.roundedui;


import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

public class RoundedTextView extends TextView implements RoundedUI.RoundedView {

	public RoundedTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
        init(attrs);
	}

	public RoundedTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
        init(attrs);
	}

	public RoundedTextView(Context context) {
		super(context);
        init(null);
	}
    RoundedUI roundedUI;
    private void init(AttributeSet attrs){
        roundedUI = new RoundedUI(this, attrs);
    }

    @Override
    public void draw(Canvas canvas) {
        roundedUI.draw(canvas);
    }

    @Override
    public void setRoundSize(int size) {
        roundedUI.setRoundSize(size);
    }

    @Override
    public void drawSuper(Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    public RoundedUI getRoundedUI() {
        return roundedUI;
    }
    @Override
    public void refreshDrawableState() {
        super.refreshDrawableState();
        invalidate();
    }
}
