package com.umaplay.foliodemo.animation;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;

import com.umaplay.folio.animator.PageAnimatorFactory;

public class CircularReveal implements PageAnimatorFactory {

    @Override
    public Animator createAnimator(View view) {
        // get the center for the clipping circle
        int cx = view.getWidth() / 2;
        int cy = view.getHeight() / 2;

        // get the final radius for the clipping circle
        int finalRadius = Math.max(view.getWidth(), view.getHeight());

        // create the animator for this view (the start radius is zero)
        return ViewAnimationUtils.createCircularReveal(view, cx, cy, 0, finalRadius)
                .setDuration(400);
    }
}
