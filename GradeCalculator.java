import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number between(0 to 100)");
        int score = sc.nextInt();
         int gradedivison = score / 10;

         switch(gradedivison){
            case 10 :
            case 9 :
                System.out.println("Grade is A");
                break; 
                case 8 :
                System.out.println("Grade is B");
                break; 
                case 7 :
                System.out.println("Grade is C");
                break; 
                case 6 :
                System.out.println("Grade is D");
                break;
                case 5 :
                System.out.println("Grade is E");
                break;
                case 4 :
                System.out.println("Grade is F");
                break;
                default:System.out.println("Invalid grade");



         }
    }
}
