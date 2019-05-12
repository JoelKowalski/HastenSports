package com.example.hastensports.Utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by Joel Fernandez.
 */

public class Utils {

    public static void setTypefaceView(Context context, TextView view, String font) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), font);
        view.setTypeface(typeface);
    }
}
