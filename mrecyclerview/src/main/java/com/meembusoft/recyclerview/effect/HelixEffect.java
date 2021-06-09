package com.meembusoft.recyclerview.effect;

import android.view.View;
import android.view.ViewPropertyAnimator;

public class HelixEffect implements Effect {

    private static final int INITIAL_ROTATION_ANGLE = 180;

    @Override
    public void initView(View item, int position, int scrollDirection) {
        item.setRotationY(INITIAL_ROTATION_ANGLE);
    }

    @Override
    public void setupAnimation(View item, int position, int scrollDirection, ViewPropertyAnimator animator) {
        animator.rotationYBy(INITIAL_ROTATION_ANGLE * scrollDirection);
    }
}
