import java.awt.*;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int age=40;
       // primitive types
            byte myAge = 30;
            long viewCount = 3_123_456_234L;
            float price =10.99F;
       // reference type
        Date now = new Date()     ;
       // System.out.println(now);

//       byte x = 5;
//       byte y = x;
//       x = 2;
//        System.out.println(y);

        //reference tips

        Point point1 = new Point(1,1);
        Point point2 = point1;

        point1.x=4;
        System.out.println(point2);

         // strings

       String message = "Hello world"+ "!!";

        System.out.println(message);
        System.out.println(message.endsWith("M"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("H"));
        System.out.println(message.length());
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!","**"));







    }
}