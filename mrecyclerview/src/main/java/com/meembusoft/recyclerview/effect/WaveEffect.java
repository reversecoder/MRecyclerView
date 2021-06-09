package com.meembusoft.recyclerview.effect;

import android.view.View;
import android.view.ViewPropertyAnimator;

public class WaveEffect implements Effect {

    @Override
    public void initView(View item, int position, int scrollDirection) {
        item.setTranslationX(-item.getWidth());
    }

    @Override
    public void setupAnimation(View item, int position, int scrollDirection, ViewPropertyAnimator animator) {
        animator.translationX(0);
    }
}
