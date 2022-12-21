import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number > 0){
            System.out.println("You entered a positive number.");
        } else if (number < 0) {
            System.out.println("You entered a negative number.");
        }
        System.out.println("You entered "+number+"!");
        sc.close();
    }
}