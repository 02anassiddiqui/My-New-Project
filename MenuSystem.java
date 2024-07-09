import java.util.*;
public class MenuSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double balance = 10000.00;

        while (true) { 
            System.out.println("menu");
            System.out.println("1. View balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Choose an option");
            int choice = sc.nextInt();

            switch(choice){
                case 1 : System.out.println("current balance: $"+balance);
                break;
                case 2: System.out.println("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("deposited :"+deposit);
                break;
                
            }
        }
    }
}
