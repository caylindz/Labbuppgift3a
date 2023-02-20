package se.kth.sandva.lab3a.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends FillableShape{
    private double height, width;

    public Rectangle(double x, double y, double height, double width, Color color, boolean filled) {
        super(x, y, color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void paint(GraphicsContext gc) {

        if (isFilled()){
            gc.setFill(getColor());
            gc.fillRect(getX(), getY(), width, height);
        } else {
            gc.setStroke(getColor());
            gc.strokeRect(getX(), getY(), width, height);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "x2=" + getX() +
                ", y2=" + getY();
    }

    @Override
    public void constrain(double boxX, double boxY, double boxWidth, double boxHeight) {
        double dx, dy;
        // If outside the box - calculate new dx and dy
        if (getX() < boxX) {
            dx = Math.abs(getDx());
            setVelocity(dx , getDy());
        } else if (getX() > boxWidth - width) {
            dx = -Math.abs(getDx());
            setVelocity(dx , getDy());
        }
        if (getY() < boxY) {
            dy = Math.abs(getDy());
            setVelocity(getDx() , dy);
        } else if (getY() > boxHeight - height) {
            dy = -Math.abs(getDy());
            setVelocity(getDx() , dy);
        }

    }
}

