package com.meembusoft.recyclerview.effect;

import android.view.View;
import android.view.ViewPropertyAnimator;

public class TwirlEffect implements Effect {

    private static final int INITIAL_ROTATION_X = 80;
    private static final int INITIAL_ROTATION_Y = 70;
    private static final int INITIAL_ROTATION_Z = 10;

    @Override
    public void initView(View item, int position, int scrollDirection) {
        item.setPivotX(item.getWidth() / 2);
        item.setPivotY(item.getWidth() / 2);
        item.setRotationX(INITIAL_ROTATION_X);
        item.setRotationY(INITIAL_ROTATION_Y * scrollDirection);
        item.setRotation(INITIAL_ROTATION_Z);
    }

    @Override
    public void setupAnimation(View item, int position, int scrollDirection, ViewPropertyAnimator animator) {
        animator.rotationXBy(-INITIAL_ROTATION_X)
                .rotationYBy(-INITIAL_ROTATION_Y * scrollDirection)
                .rotationBy(-INITIAL_ROTATION_Z);
    }
}
