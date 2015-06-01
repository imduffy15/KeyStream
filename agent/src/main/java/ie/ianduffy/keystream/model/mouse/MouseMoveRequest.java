package ie.ianduffy.keystream.model.mouse;

import lombok.Data;

import java.awt.*;

@Data
public class MouseMoveRequest implements MouseRequest {

    private int x;
    private int y;

    public void visit(Robot robot) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int minX = 1;
        int minY = 1;
        int maxX = screenSize.width - 1;
        int maxY = screenSize.height - 1;

        Point point = MouseInfo.getPointerInfo().getLocation();
        int currentX = point.x;
        int currentY = point.y;

        int nextX = currentX + x;
        int nextY = currentY + y;

        if (nextX <= minX) {
            nextX = minX;
        }
        if (nextY <= minY) {
            nextY = minY;
        }
        if (nextX >= maxX) {
            nextX = maxX;
        }
        if (nextY >= maxY) {
            nextY = maxY;
        }

        robot.mouseMove(nextX, nextY);
    }
}
