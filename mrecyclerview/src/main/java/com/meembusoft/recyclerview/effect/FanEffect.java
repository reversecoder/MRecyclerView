package com.meembusoft.recyclerview.effect;

import android.view.View;
import android.view.ViewPropertyAnimator;

public class FanEffect implements Effect {

    private static final int INITIAL_ROTATION_ANGLE = 70;

    @Override
    public void initView(View item, int position, int scrollDirection) {
        item.setPivotX(0);
        item.setPivotY(0);
        item.setRotation(INITIAL_ROTATION_ANGLE * scrollDirection);
    }

    @Override
    public void setupAnimation(View item, int position, int scrollDirection, ViewPropertyAnimator animator) {
        animator.rotationBy(-INITIAL_ROTATION_ANGLE * scrollDirection);
    }
}
