package ie.ianduffy.keystream.controller;

import ie.ianduffy.keystream.model.mouse.MouseRequest;
import ie.ianduffy.keystream.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Main {

    @Autowired
    RobotService robotService;

    @RequestMapping(
            value = "mouse",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void MouseHandler(@RequestBody MouseRequest mouseRequest) {
        robotService.execute(mouseRequest);
    }

}
