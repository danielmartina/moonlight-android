package com.limelight.ui;

import com.limelight.binding.input.GameInputDevice;

public interface GameGestures {
    void toggleKeyboard();

    void toggleTouch();

    boolean getTouchConfigState();

    void showGameMenu(GameInputDevice device);
}
