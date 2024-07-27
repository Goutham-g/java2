package demo1;

public class Pig extends  Animals{

    public String name;
    public void sound(){
        System.out.println("pig makes sound");


    }


    public Pig(String value){
        this.name= value;
    }
    void displayName(){
        System.out.println("pig name"+name);
    }

}
