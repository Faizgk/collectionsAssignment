import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Phone phone = new Phone();

        while(true){
            System.out.println("1 ---->Add New PhoneBook Entry");
            System.out.println("2 ----> Search PhoneBook Entry");
            System.out.println("3 ----> Quit");

            int choice = new Scanner(System.in).nextInt();

            do{
                switch(choice){

                    case 1 : phone.newPhoneBookEntry();
                        break;
                    case 2 : phone.searchPhoneNumber();
                        break;
                    case 3 : phone.quit();
                        break;
                    default:
                        System.out.println("invalid Choice");
                }

            }while( choice>3 || choice<1);

        }

    }
}