class constructor{
    int modelYear;
    String modelName;


    public  constructor(int Year, String name){
        modelYear=Year;
        modelName=name;
    }
}

public class oops2 {



    public static void main(String[] args) {
        constructor con = new constructor(2015,"Mustang");
        System.out.println(con.modelName);
    }



}
