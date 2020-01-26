package lab2_1;
import java.util.Random;
import java.awt.Rectangle;

public class IntersectionPrinter {

    public static void main(String[] args) {
        Random generator = new java.util.Random();
        int x = generator.nextInt(49)+1;
        int y = generator.nextInt(49)+1;
        int w = generator.nextInt(49)+1;
        int h = generator.nextInt(49)+1;
        Rectangle r1 = new Rectangle(x, y, w, h);
        System.out.println(r1);
       // System.out.println(r1.y);
       // System.out.println(r1.width);
       // System.out.println(r1.height);
       int x2 = generator.nextInt(49)+1;
       int y2 = generator.nextInt(49)+1;
       int w2 = generator.nextInt(49)+1;
       int h2 = generator.nextInt(49)+1;
       Rectangle r2 = new Rectangle(x2, y2, w2, h2);
       System.out.println(r2);
       
       Rectangle r3 = r1.intersection(r2);
       //r3.isEmpty();
       System.out.println("Is the intersected rectangle empty?:"+r3.isEmpty());
       
    }
    
}

