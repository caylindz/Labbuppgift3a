package se.kth.sandva.lab3a.shapes;



abstract public class FillableShape extends Shape{

    private boolean Filled;

    public FillableShape(){
        super();

    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean Filled){

    }
}


