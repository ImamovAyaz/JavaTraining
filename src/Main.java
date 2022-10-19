import com.sun.prism.shader.Solid_ImagePattern_AlphaTest_Loader;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int length = 50;
        length = 225;
        int high = 20;

        double a = 10.3;
        double b = 9.8;
        int c = (int)a + (int)b;
        int d = (int)(a + b);
        System.out.println(c);
        System.out.println(d);

        for (int i = 0; i < 10; i++)
        {
            double localVariable = 10.5;
            System.out.println(localVariable);
            // double length = 10.5;
            // System.out.println(length);
        }

        int square = length * high;

        System.out.println(length + "*" + high + "=" + square);

        //Date creationDate = new Date(600000000);

        LocalDate creationDate = LocalDate.of(1999,01,26);
        LocalDate lastMofificationDate = LocalDate.now();

        System.out.println(lastMofificationDate);
        System.out.println(creationDate);
        System.out.println("Hello, World!!!");
        System.out.println("New line");
    }
}
