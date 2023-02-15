package se.kth.sandva.lab3a.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.lang.Math;

public class Line extends Shape {

    private double x2, y2;

    public Line(double x, double y, double x2, double y2, Color color){
        super(x, y, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(){
        super();
        this.x2 = 100;
        this.y2 = 100;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        x2 = Math.abs(x2);
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        y2 = Math.abs(y2);
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "x2=" + x2 +
                ", y2=" + y2;
    }


    @Override
    public void move(long timePassed){
        super.move(timePassed);
        x2 += getDx() * timePassed / BILLION;
        y2 += getDy() * timePassed / BILLION;
    }

    @Override
    public void paint(GraphicsContext gc) {
        gc.setStroke(getColor());
        gc.strokeLine(getX(), getY(), x2, y2);
    }
}
