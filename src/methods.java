public class methods {

    static void myMethod(){
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
    static int sum2(int x,int y){
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
//        myMethod();
//        myMethod();
//        myMethod();
//        passPara("Goutham");
//        passPara("Adithyan");
//        mulPara("Goutham",26);
//        checkAccess(19);

//        System.out.println(sum2(22,3));
        int z= sum2(2,4);
        System.out.println(z);

    }

}
