package com.meembusoft.recyclerview.effect;

import android.view.View;
import android.view.ViewPropertyAnimator;

import com.meembusoft.recyclerview.util.AnimationHelper;

public class FadeEffect implements Effect {

    private static final int DURATION_MULTIPLIER = 5;

    @Override
    public void initView(View item, int position, int scrollDirection) {
        item.setAlpha(AnimationHelper.TRANSPARENT);
    }

    @Override
    public void setupAnimation(View item, int position, int scrollDirection, ViewPropertyAnimator animator) {
        animator.setDuration(AnimationHelper.DURATION * DURATION_MULTIPLIER)
//                .alpha(AnimationHelper.OPAQUE);
                .alpha(.05f);
    }
}
