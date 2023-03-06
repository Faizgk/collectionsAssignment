

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Database db = new Database();

            while(true){
                System.out.println();
                System.out.println("> Enter 1 to View");
                System.out.println("> Enter 2 to search");
                System.out.println("> Enter 3 to delete element");
                System.out.println("> Enter 4 to add element");
                System.out.println("> Enter 5 to exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch(choice){

                    case 1 : db.Display();
                        break;
                    case 2:

                        System.out.println("Search by Key --1");
                        System.out.println("Search by Element --2");
                        int choice2 = scanner.nextInt();
                        scanner.nextLine();
                        if(choice2==2){
                            System.out.println("Enter the element");
                            if(db.hashtable.contains(scanner.nextLine())){
                                System.out.println("Element Found") ;
                            }
                            else{
                                System.out.println("Element Not Found");
                            }
                        }else {
                            System.out.println("Enter the key");
                              String key = scanner.nextLine();
                            if(db.hashtable.containsKey(key)){
                                System.out.println("Key Found having value :  "+db.hashtable.get(key));
                            }else{
                                System.out.println("Key not Found");
                            }
                        }

                        break;
                    case 3:
                        System.out.println("Enter the id to delete");
                        db.hashtable.remove(scanner.nextLine());
                        System.out.println("Id and it's Element deleted");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    case 4:

                        System.out.println();
                        System.out.println("Enter Product ID");
                        String productId = scanner.nextLine();
                        System.out.println("Enter Product Name");
                        String productName = scanner.nextLine();

                        Product product = new Product(productId, productName);
                        db.store(product);


                }

            }




    }


}

