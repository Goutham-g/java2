public class methods {

    public void myMethod(){
         System.out.println("This is a method");
    }

    //pass parameters
    static void passPara(String fname){
        System.out.println("name is\t"+ fname);
    }
    //multple parameter
    static void mulPara(String name,int age){
        System.out.println("The name is "+name +"\tand\t"+ "Age is "+age);
    }
    //method with if-else
    static void checkAccess(int age){
        if (age>18){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access denied");
        }
    }
//method with return
     public int sum2(int x,int y){
        return x+y;
    }
    //function with recursion
    public static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }else{
            return 0;
        }
    }



    public static void main(String[] args) {
      methods my1= new methods();
      my1.myMethod();
//        methods.myMethod();
//        myMethod();
//        myMethod();
        passPara("Goutham");
        passPara("Adithyan");
        mulPara("Goutham",26);
        checkAccess(19);

//        System.out.println(sum2(22,3));
        methods met =new methods();

        int z= met.sum2(1,2);
        System.out.println(z);

    }

}
