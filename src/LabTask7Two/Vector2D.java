package LabTask7Two;

public class Vector2D {
    public double x;
    public double y;

    public Vector2D(double x, double y){
        this.x=x;
        this.y=y;
    }
    //Getters
    public double GetX(){
        return x;
    }

    public double GetY() {
        return y;
    }
    //Setters

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    @Override
    public String  toString(){
        return "x=" + x + ", y=" + y;
    }
}
