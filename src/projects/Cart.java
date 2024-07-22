package projects;

public class Cart {
    private Product[] products;
    private int size;

    public Cart(){
        products = new Product[10];
        size =0;

    }
    // add product to cart

    public void addProduct(Product product){

         if (product ==null){
             System.out.println("cannot add null products");
             return;
         }
         if (size== products.length){

         }

         products[size]=product; // add product object to array



    }

    private void reSizeArray(){
        Product[] newProducts = new Product[products.length*2];
        for(int i=0;i<products.length;i++){
            newProducts[i]=products[i];
        }
        products=newProducts;
    }





}
