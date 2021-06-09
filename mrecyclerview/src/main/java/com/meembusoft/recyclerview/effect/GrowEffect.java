package com.meembusoft.recyclerview.effect;

import android.view.View;
import android.view.ViewPropertyAnimator;

public class GrowEffect implements Effect {

    private static final float INITIAL_SCALE_FACTOR = 0.01f;

    @Override
    public void initView(View item, int position, int scrollDirection) {
        item.setPivotX(item.getWidth() / 2);
        item.setPivotY(item.getHeight() / 2);
        item.setScaleX(INITIAL_SCALE_FACTOR);
        item.setScaleY(INITIAL_SCALE_FACTOR);
    }

    @Override
    public void setupAnimation(View item, int position, int scrollDirection, ViewPropertyAnimator animator) {
        animator.scaleX(1).scaleY(1);
    }
}
