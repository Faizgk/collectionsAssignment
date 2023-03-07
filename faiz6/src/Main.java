import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner  =  new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        while(true){
            System.out.println("1 ---> add Front");
            System.out.println("2 ---> add Rear");
            System.out.println("3 ---> Delete Front");
            System.out.println("4 ---> Delete Rear");
            System.out.println("5 ---> Add at index");
            System.out.println("6 ---> Display");
            System.out.println("Press any other number to Exit");


            int choice = scanner.nextInt();
            switch (choice){

                case 1 : linkedList.addFront();
                break;
                case 2: linkedList.addRear();
                break;
                case 3 : linkedList.deleteFront();
                break;
                case 4: linkedList.deleteRear();
                break;
                case 5: linkedList.addAtIndex();
                break;
                case 6: linkedList.display();
                break;
                default:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}