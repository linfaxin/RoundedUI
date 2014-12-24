package com.linfaxin.roundedui;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;

public class RoundedFrameLayout extends FrameLayout implements RoundedUI.RoundedView {

	public RoundedFrameLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
        init(attrs);
	}

	public RoundedFrameLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
        init(attrs);
	}

	public RoundedFrameLayout(Context context) {
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
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        invalidate();
        return super.invalidateChildInParent(location, dirty);
    }
    @Override
    public void childDrawableStateChanged(View child) {
        invalidate();
        super.childDrawableStateChanged(child);
    }
    @Override
    public void refreshDrawableState() {
        super.refreshDrawableState();
        invalidate();
    }
}
