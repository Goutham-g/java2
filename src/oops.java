public class oops {

   final int x = 7;
    // constructor
    int y;
    public oops(){// for setting intial value for object attributes
        y=4;
    }

   //static method
    static void myStaticMethod(){
        System.out.println("static method use without create object");
    }
    //public method
    public void myPublicMethod(){
        System.out.println("public method use only by create an object");
    }

    //access method with an object
    public void fullThrottle(){
        System.out.println("car going as fast as it can");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is\t"+maxSpeed);
    }



    public static void main(String[] args) {
        oops demo = new oops();

        System.out.println(demo.x);
        demo.y=3;
        System.out.println(demo.y);
// call static method
        myStaticMethod();
//        myPublicMethod()

        oops demo1 = new oops(); // created object of oops
        demo1.myPublicMethod(); //

        // create an object of car
        oops myCar=new oops();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}




