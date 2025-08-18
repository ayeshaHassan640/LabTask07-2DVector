package LabTask7Two;

public class Calculations {
    public  Vector2D add(Vector2D r1, Vector2D r2){
        return  new Vector2D(r1.x+r2.x, r1.y+r2.y);
    }

    public  Vector2D sub(Vector2D r1, Vector2D r2){
        return  new Vector2D(r1.x-r2.x, r1.y-r2.y);
    }
    //Scalar Multiplication
    public Vector2D multiply(Vector2D r1, int scalar) {
        return new Vector2D(r1.x * scalar, r1.y * scalar);
    }
    //Dot Product
    public  double  dotProd(Vector2D r1, Vector2D r2){
        return  r1.x*r2.x+r1.y*r2.y;
    }
    /// Magnitude of a vector
    public double magnitude(Vector2D r1) {
        return Math.sqrt(r1.x * r1.x + r1.y * r1.y);
    }
    }



