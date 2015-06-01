package ie.ianduffy.keystream.model.mouse;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.awt.*;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = MouseClickRequest.class, name = "MouseClick"),
        @JsonSubTypes.Type(value = MouseMoveRequest.class, name = "MouseMove"),
        @JsonSubTypes.Type(value = MouseWheelRequest.class, name = "MouseWheel"),
})
public interface MouseRequest {
    void visit(Robot robot);
}
