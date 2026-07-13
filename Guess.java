
import java.util.Scanner;

class Guess {

    public static void main(String[] args) {
        int secretNumber;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the secretNumber:");
            secretNumber = sc.nextInt();
            sc.nextLine();
            if (secretNumber == 27) {
                System.out.println("Guess :" + secretNumber);
                System.out.println("Correct");
                break;
            } else if (secretNumber <= 15) {
                System.out.println("Guess :" + secretNumber);
                System.out.println("Too low");
            } else {
                System.out.println("Guess :" + secretNumber);
                System.out.println("Too high");
            }
        }
        sc.close();
    }
}
