package mypackage;
import samplePackage.testClass;
import java.io.*;
import java.awt.Button;
//abstraction
abstract class Person1{

    abstract void Walk();

}
class man extends Person1{
     void Walk(){
         System.out.println("person is walking");
    }
    void cry(){
        System.out.println("person crying");
    }

}



//encapsulation //private
class books{
    private String bookName;
    private String Author;

   // set book
    public  books(String name,String author){

        this.bookName=name;
        this.Author=author;


    }
    public String getBookName(){
        return bookName;

    }
    public String getAuthor(){
        return Author;
    }



}

// polymorphism
class birds{
    void fly(){
        System.out.println("can fly");
    };

}
class Crow extends birds{
    public String place;
}

class Pigeon extends birds{
    public String place;
}
//inheritence
class Product{
    protected String model;
    protected void setName(String name){
        System.out.println("product name is "+name);
    }
}
class mobile extends Product{}




public class Main {

    public static void main(String[] args) {
testClass test = new testClass();
        System.out.println(test.a);

        books newBook1 = new books("the achemist","paulo coehlo");


       String book2= newBook1.getAuthor();

        String Author2=newBook1.getBookName();


        System.out.println(book2);
        System.out.println(Author2);
        //abstraction
        man man = new man() ;
                man.cry();
        man.Walk();

        //inheritence
        Crow crow = new Crow();
        crow.fly();

        Pigeon pigeon = new Pigeon();
        pigeon.fly();
    }

}
