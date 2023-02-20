package se.kth.sandva.lab3a.shapes;
import javafx.scene.paint.Color;



abstract public class FillableShape extends Shape{

    private boolean Filled = true;

    public FillableShape(double x, double y, Color color, boolean Filled){
        super(x, y, color);
        this.Filled = Filled;

    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean filled) {
        Filled = filled;
    }
}


