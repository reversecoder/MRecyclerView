package com.meembusoft.recyclerview.effect;

import android.view.View;
import android.view.ViewPropertyAnimator;

public class StandardEffect implements Effect {

    @Override
    public void initView(View item, int position, int scrollDirection) {
        // no op
    }

    @Override
    public void setupAnimation(View item, int position, int scrollDirection, ViewPropertyAnimator animator) {
        // no op
    }
}
