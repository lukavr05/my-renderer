import java.awt.*;

class Square {
    Triangle t1;
    Triangle t2;

    public Square (Vertex bl, Vertex br, Vertex tl, Vertex tr, Color color) {
        this.t1 = new Triangle(bl, br, tl, color);
        this.t2 = new Triangle(tl, tr, br, color);
    }
}