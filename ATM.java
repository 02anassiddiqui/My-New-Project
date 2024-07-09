import java.util.*;

public class ATM {
    
float Balance;
int PIN = 5586;

public void checkpin(){
    System.out.println("Enter your pin");
    Scanner sc = new Scanner (System.in);
    int enteredpin = sc.nextInt();
    if(enteredpin == PIN){
        menu(sc);
    }
    else{
        System.out.println("Invalid pin");
    }
    public void menu(){
        System.out.println("Enter your choice : ");
        System.out.println("1. View A/C balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }
}
}
