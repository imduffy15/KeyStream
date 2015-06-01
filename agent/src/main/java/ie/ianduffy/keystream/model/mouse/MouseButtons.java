package ie.ianduffy.keystream.model.mouse;

import java.awt.event.InputEvent;

public enum MouseButtons {
    LEFT(InputEvent.BUTTON1_MASK), MIDDLE(InputEvent.BUTTON2_MASK), RIGHT(InputEvent.BUTTON3_MASK);

    private int code;

    private MouseButtons(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
