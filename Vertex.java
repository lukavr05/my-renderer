import javax.swing.*;
import java.awt.*;

class Vertex {
    double x;
    double y;
    double z;
    Vertex(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double get_x() { return this.x; }
    public double get_y() { return this.y; }
    public double get_z() { return this.z; }
}