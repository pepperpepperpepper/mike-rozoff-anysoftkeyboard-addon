package com.mikerozoff.keyboard;

import android.content.Context;
import android.inputmethodservice.Keyboard;

import com.anysoftkeyboard.addons.KeyboardAddOn;
import com.anysoftkeyboard.addons.KeyboardAddon;

public class MikeRozoffKeyboardAddon extends KeyboardAddon {

    public MikeRozoffKeyboardAddon(Context context) {
        super(context);
    }

    @Override
    public String getKeyboardName() {
        return "Mike Rozoff Layout";
    }

    @Override
    public int getKeyboardXmlResId() {
        return R.xml.mike_rozoff_layout;
    }

    @Override
    public int getIconResId() {
        return R.drawable.ic_keyboard;
    }

    @Override
    public String getAuthor() {
        return "Mike Rozoff";
    }

    @Override
    public String getDescription() {
        return "A SwiftKey-inspired keyboard layout with 6 rows including arrow keys and extended symbols";
    }
}