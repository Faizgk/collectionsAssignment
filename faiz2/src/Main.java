
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Database db = new Database();

        while(true){
            System.out.println();
            System.out.println("Enter Product ID");
            String productId = scanner.nextLine();
            System.out.println("Enter Product Name");
            String productName = scanner.nextLine();

            Product product = new Product(productId, productName);

            db.store(product);

            System.out.println();
            System.out.println("> Enter X to View and exit");
            System.out.println("> Enter Any Other Letter to View and Add");
            char x = scanner.next().toLowerCase().charAt(0);
            scanner.nextLine();

            if(x == 'x'){

                db.Display();
                System.exit(0);
            }else{
                db.Display();

            }
        }



    }



}

