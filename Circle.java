package se.kth.sandva.lab3a.shapes;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Circle extends FillableShape{


    private double diameter;

    public Circle(double x, double y, double newDiameter, Color color) {
        super(x,y,color);
        setDiameter(newDiameter);
    }

    public double getDiameter(){
        return diameter; //Ska man returna nån slags kopia eller räcker detta?
    }

    public void setDiameter(double newDiameter){
        diameter = newDiameter;
    }

    @Override
    public void constrain(double boxX, double boxY, double boxWidth, double boxHeight) {
        double dx, dy;
        // If outside the box - calculate new dx and dy
        if (getX() < boxX) {
            dx = Math.abs(getDx());
            setVelocity(dx , getDy());
        } else if (getX() > boxWidth - diameter/2) {
            dx = -Math.abs(getDx());
            setVelocity(dx , getDy());
        }
        if (getY() < boxY) {
            dy = Math.abs(getDy());
            setVelocity(getDx() , dy);
        } else if (getY() > boxHeight - diameter/2) {
            dy = -Math.abs(getDy());
            setVelocity(getDx() , dy);
        }
    }


    @Override
    public void paint(GraphicsContext gc) {

        if (isFilled()){
            gc.setFill(getColor());
            gc.fillOval(getX(), getY(), getDiameter()/2, getDiameter()/2);
        } else {
            gc.setStroke(getColor());
            gc.strokeOval(getX(), getY(), getDiameter()/2, getDiameter()/2);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "x2=" + getX() +
                ", y2=" + getY();
    }
}
