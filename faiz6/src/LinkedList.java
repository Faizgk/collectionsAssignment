import java.util.Scanner;

public class LinkedList {


    public class Node {
        private Node previous;
        private int data;
        private Node next;

    }
    Scanner scanner = new Scanner(System.in);
    private Node first;


    public void addFront(){

        System.out.println("Enter the element");
        int elem = scanner.nextInt();
        if(first==null){
            Node node = new Node();
            first = node;
            node.data = elem;

        }
        else{
            Node temp = first;
            Node node = new Node();
            first = node;
            first.data = elem;
            first.next = temp;

        }
        System.out.println("ELement added at the front");
        }
    public void deleteFront(){

        if(first==null){
            System.err.println("Nothing to delete ! ");
        }else{

            System.out.println("Element "+first.data +" deleted");
            first = first.next;
            first.previous = null;
        }
    }

    public void addRear(){
        System.out.println("Enter the element");
        int elem = scanner.nextInt();
        if(first ==null){
            Node node = new Node();
            first = node;
            node.data = elem;

        }else{

            Node temp = first;
            while(temp.next!=null){
                temp = temp.next;
            }
            Node node = new Node();
            temp.next = node;
            node.data = elem;
            node.previous = temp;
        }
        System.out.println("element added at the rear");
    }
     public void deleteRear(){
        if(first == null){
            System.out.println("Nothing to delete");

        }else{

            Node temp = first;

            while(temp.next !=null){
                temp = temp.next;
            }
            System.out.println("Element "+temp.data+" deleted");
            temp.previous.next = null;
            temp.previous = null;

        }

     }

     public void display(){
        if(first==null){
            System.out.println("Nothing to Display");
        }
        else{

            Node temp = first;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();


        }

     }

    }
