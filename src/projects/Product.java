package projects;
//encapsulation
public class Product {
    private String name;
    private  double price;
    private  String description;

    //set method
   public Product(String productName,double proPrice,String description){
        this.name=productName;
        this.price=proPrice;
        this.description=description;
    }

    // get metod
    public String getName(){
       return name;
    }

    public double getPrice(){
       return price;
    }
    public String getDescription(){
       return description;
    }

@Override
    public String toString() {
        return "Product[Name="+name+",Price="+price+", Description="+description+"]";
    }
}
