package com.umaplay.folio;

import android.view.View;
import android.view.ViewTreeObserver;

abstract class FirstLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {

    private View view;
    private boolean first = true;

    FirstLayoutListener(View view) {
        this.view = view;
    }

    @Override
    public void onGlobalLayout() {
        if (view.getWidth() > 0 && view.getHeight() > 0 && first) {
            onFirstLayout(view);

            view = null;
            first = false;
        }
    }

    abstract void onFirstLayout(View view);
}
