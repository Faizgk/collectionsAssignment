import java.util.Hashtable;

public class Database {

    Hashtable<String, String> hashtable = new Hashtable<>();

    public  void store(Product product) {

        hashtable.put(product.productId, product.productName);
        System.out.println("Save Successful");

    }

    public void  Display(){
        System.out.println(hashtable);
    }


}
