package ie.ianduffy.keystream.service;

import ie.ianduffy.keystream.model.mouse.MouseRequest;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class RobotService {

    private Robot robot;

    public RobotService() throws AWTException {
        robot = new Robot();
    }

    public void execute(MouseRequest mouseRequest) {
        mouseRequest.visit(robot);
    }
}
