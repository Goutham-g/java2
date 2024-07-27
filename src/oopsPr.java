
//Encapsulation example
class person{
    private String name; // private restricted access

    //getter
    public String getName(){
        return name;
    }
    //setter
    public String setname(String newName){
        return this.name=newName;
    }


}

// encapsulation example
 class Vehicle{
    protected String brand = "Ford";

    public void honk(){

    }

}
// inheritence
class vehicle{
    protected String brandName="Volkswagon";
    public  void honk(){
        System.out.println("Horn worked");
    }


        }
        class Car extends Vehicle{
    public String brand="Ford";


        }

//polymorphism


class Animal{
     void animalSound(){
        System.out.println();
    }
}
class Pig extends Animal{
     void animalSound(){
        System.out.println("Pig make sound");
    }
}
class Dog extends Animal{


    void animalSound(){
        System.out.println("Dog make sound");
    }
}

//Abstraction

abstract  class Animal1{
   abstract void animalSoundd();  // it cannot have body
    void sleep(){
        System.out.println("zzzzz");
    }
}
class Piggg extends Animal1{
public void animalSoundd(){
    System.out.println("this is abstract class");
}
}

//  interface
interface Animals{
    void animalSound();  //interface method does not have body
    void run();

}
interface  Birds{
    void drink();
}
interface crow extends Birds{
    @Override
    void drink();
}
class smallCrow implements crow{
    public void drink(){

    }
}


 class Cat implements Animals{

public void animalSound(){
    System.out.println("the cat says\"meowww\"");
}
public void run(){
    System.out.println("");
}


 }
 // interface eg - implement interface using abstract class
interface  A {
    void a();
    void b();
     void c();
     void d();



 }
 abstract class K implements A{
public void a(){
    System.out.println();
};
 class D extends K{
  public void b(){

     }
   public  void c(){

     }
    public void d(){

     }
 }








}






public   class oopsPr extends Vehicle{
    public String brandName="ford";


    public static void main(String[] args) {
        //encapsulation

        person newPerson = new person();

        //   newPerson.name="john" //error
        // use set and get method to access te variable
        newPerson.setname("Anuuu");
        String name=newPerson.getName();
        System.out.println(name );

        //inheritence example

        vehicle veh = new vehicle();
        System.out.println(veh.brandName);
        oopsPr myCar = new oopsPr();
        myCar.honk();
        System.out.println(myCar.brand);

        //polymorphism
        Animal animal=new Animal();
        Pig pig = new Pig();
        Dog dog = new Dog();

        animal.animalSound();
        pig.animalSound();
        dog.animalSound();


        // abstraction
        Piggg animall=new Piggg();
        animall.animalSoundd();

//interface
         Cat myCat = new Cat();
         myCat.animalSound();
         myCat.run();

    }



}
