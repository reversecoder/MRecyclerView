package com.meembusoft.recyclerview.effect;

import android.view.View;
import android.view.ViewPropertyAnimator;

public class SlideInEffect implements Effect {

    @Override
    public void initView(View item, int position, int scrollDirection) {
        item.setTranslationY(item.getHeight() / 2 * scrollDirection);
    }

    @Override
    public void setupAnimation(View item, int position, int scrollDirection, ViewPropertyAnimator animator) {
        animator.translationYBy(-item.getHeight() / 2 * scrollDirection);
    }
}
