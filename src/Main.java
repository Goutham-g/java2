import java.awt.*;
import java.util.Date;
abstract class Animal3{
    abstract void sound();
}
class pig extends Animal{
    public void sound(){
        System.out.println("pig makes sound");
    }
}
class H{
    static int m=100;


}




public class Main {

  int x=10;


  public static void main(String[] args) {


      int m=100;
       int age=40;
      int age1 = age;
      float f =10.5F;
      int a = (int) f;
      System.out.println(a);

       // primitive types
            byte myAge = 30;
            long viewCount = 3_123_456_234L;
            float price =10.99F;
       // reference type
        Date now = new Date()     ;
       // System.out.println(now);
methods my = new methods();
my.myMethod();
//       byte x = 5;
//       byte y = x;
//       x = 2;
//        System.out.println(y);

        //reference tips
practiceQue que=new practiceQue();

        Point p3=new Point();

        Point point1 = new Point(1,1);
        Point point2 = point1;

        point1.x=4;
        System.out.println(point2);

         // strings

       String message = "Hello world"+ "!!";

        System.out.println(message.toString());
        System.out.println(message.endsWith("M"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("H"));
        System.out.println(message.length());
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!","**"));







    }
}