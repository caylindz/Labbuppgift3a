package se.kth.sandva.lab3a.shapes;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.lang.Math;


public class Circle extends FillableShape{


    private double diameter;

    public Circle(double newDiameter) {
        setDiameter(newDiameter);
    }

    public double getDiameter(){
        return diameter; //Ska man returna nån slags kopia eller räcker detta?
    }

    public void setDiameter(double newDiameter){
        diameter = newDiameter;
    }

    @Override
    public void paint(GraphicsContext gc) {
        gc.setStroke(getColor());
        gc.strokeOval(getX(), getY(), getDiameter()/2, getDiameter()/2);
    }
}
