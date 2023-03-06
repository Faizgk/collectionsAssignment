
import java.util.Scanner;
import java.util.TreeMap;

public class Phone {
    Scanner scanner = new Scanner(System.in);

    TreeMap<String, Long> treeMap = new TreeMap<String, Long>();
    public void newPhoneBookEntry(){


        System.out.println("Enter the Name of the contact");
        String name  = scanner.nextLine();
        System.out.println("Enter the Phone Number of the contact");
        long phoneNumber = (long)scanner.nextInt();
        treeMap.put(name, phoneNumber);
        scanner.nextLine();
    }

    public void searchPhoneNumber(){
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        if(!treeMap.containsKey(name)){
            System.err.println("Key Not Found");
        }else{
            System.out.println("Phone Number Found : "+treeMap.get(name));
        }

    }

    public void quit(){
        System.out.println("Quitting..");
        System.exit(0);
    }
}
