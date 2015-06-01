package ie.ianduffy.keystream.model.mouse;

import lombok.Data;

import java.awt.*;
import java.awt.event.InputEvent;

@Data
public class MouseClickRequest implements MouseRequest {
    private MouseButtons button;

    public void visit(Robot robot) {
        System.out.println(button.getCode());
        System.out.println(InputEvent.BUTTON1_MASK);
        robot.mousePress(button.getCode());
        robot.mouseRelease(button.getCode());
    }
}
