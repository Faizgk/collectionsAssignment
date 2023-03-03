
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add("david");
        arrayList.add("kate");
        arrayList.add("edwin");
        arrayList.add("idris");
        arrayList.add("rahul");
        arrayList.add(1);
        arrayList.add(-5);
        arrayList.add(10);
        arrayList.add(true);
        arrayList.add(false);
        arrayList.add("hello");



        System.out.println("Enter the element to search");

        Serializable key = scanner.nextLine();

        if(Is.isNumeric( key)){
            System.out.println(arrayList.contains(Integer.parseInt((String) key)));
        }
        else if (Is.isBoolean( key)){
            System.out.println(arrayList.contains(Boolean.parseBoolean((String) key)));
        }
        else{
            System.out.println(arrayList.contains(key));

        }


    }
}