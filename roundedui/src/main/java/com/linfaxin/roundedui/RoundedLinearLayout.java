package com.linfaxin.roundedui;


import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;

public class RoundedLinearLayout extends LinearLayout implements RoundedUI.RoundedView {

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public RoundedLinearLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
        init(attrs);
	}

	public RoundedLinearLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
        init(attrs);
	}

	public RoundedLinearLayout(Context context) {
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
