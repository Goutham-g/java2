package mypackage;

public class Err {


    public static void main(String[] args) {
        try{
            int[] myNum ={1,2,3};
            System.out.println(myNum[8]);
        }
        catch (Exception e){
            System.out.println("error in block 1");
        }
    }
}
