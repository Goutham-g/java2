package projects;

public class User {
    private String userName;
    private Cart cart;

    public User (String name){
        this.userName=name;
        this.cart=new Cart();
    }

     void loggedUser(){
        System.out.println(userName+",is logged in");

    }
    //search product
     void Search(Product[] product){
         System.out.println(userName+", is Searcing Product...");
         for(Product pro: product){
             System.out.println(pro);
         }

//         public String toString(){
//             return userName;
//         }

     }




}




