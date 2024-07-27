//super keyword
 class vehicle6 {
    public String brand="ford";
    public void speed (){

    }

        }

        class car6 extends vehicle6{
    public String brand="volvo";
     public  void printCar(){

        System.out.println(brand);
        System.out.println(super.brand);
    }
        }

public class demo {
    public static void main(String[] args) {
        String message1 = "Gouthaam Ganesh";
        System.out.println(message1);

        // Escape sequences
        System.out.println("Hel\tlo \n \"Goutham\""); //use back slash for use special charecter

        //c:\Windows\....
        System.out.println("c:\\Windows\\");
       car6 c1 =new car6();
       c1.printCar();

    }
}
