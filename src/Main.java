import LabTask7Two.Calculations;
import LabTask7Two.Vector2D;

public class Main {
    public static void main(String[] args) {
        Vector2D v1=new Vector2D(3, 4);
        Vector2D v2=new Vector2D(2,2);
        Calculations calc=new Calculations();
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v1 + v2 = " + calc.add(v1, v2));
        System.out.println("v1 - v2 = " + calc.sub(v1,v2));
        System.out.println("v1 ⋅ Scalar = " + calc.multiply(v1, 2));
        System.out.println("v2 ⋅ Scalar = " + calc.multiply(v2, 2));
        System.out.println("v1 magnitude = " + calc.magnitude(v1));
        System.out.println("v2 magnitude = " + calc.magnitude(v2));


    }
}