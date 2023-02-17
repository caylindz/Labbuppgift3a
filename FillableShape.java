package se.kth.sandva.lab3a.shapes;
import javafx.scene.paint.Color;



abstract public class FillableShape extends Shape{

    private boolean Filled = true;

    public FillableShape(double x, double y, Color color){
        super(x, y, color);

    }

    public boolean isFilled() {

        return Filled;
    }

    public void setFilled(boolean Filled){

        

    }

}


