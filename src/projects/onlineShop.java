package projects;

public class onlineShop {
    public static void main(String[] args) {

        Product product1 =  new Product("Laptop",45000,"new model,best performance");
        Product product2 =  new Product("Smartphone",21000,"Latest model ");

        //add to an array
        Product[] products =new Product[2];
        products[0]=product1;
        products[1]=product2;

        //new user
        User user = new User("testUser");
        user.loggedUser();
        user.Search(products);
    }
}
