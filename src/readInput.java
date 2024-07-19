import java.util.Scanner;

public class readInput {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Name=");
       String name= scan.nextLine().toUpperCase().trim(); //method chaining
        System.out.print("your name is\n"+name);

    }
}
