import javax.swing.*;
import java.awt.*;

class Triangle {
    public Vertex v1;
    public Vertex v2;
    public Vertex v3;
    Color color;
    Triangle(Vertex v1, Vertex v2, Vertex v3, Color color) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.color = color;
    }

    public Vertex get_v1() { return this.v1; }
    public Vertex get_v2() { return this.v2; }
    public Vertex get_v3() { return this.v3; }
}