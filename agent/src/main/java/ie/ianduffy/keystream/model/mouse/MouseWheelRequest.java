package ie.ianduffy.keystream.model.mouse;

import lombok.Data;

import java.awt.*;

@Data
public class MouseWheelRequest implements MouseRequest {
    private int wheelAmount;

    public void visit(Robot robot) {
        robot.mouseWheel(-wheelAmount);
    }
}
