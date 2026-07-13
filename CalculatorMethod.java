
import java.util.Scanner;

class CalculatorMethod {

    static int number1;
    static int number2;
    static int result;

    public static void add() {
       result= number1 + number2;
       System.out.println("result"+" "+result);
    }

    public static void subtract() {
        result=number1 - number2;
        System.out.println("result"+" "+result);
    }

    public static void multiply() {
        result=number1 * number2;
        System.out.println("result"+" "+result);
    }

    public static void divide(){
        try{
        if(number2==0){
            throw new ArithmeticException("Divison by zero error");
        }
        }
        catch( ArithmeticException e){
            System.out.println(e.getMessage());
            return;
        }
        result=number1 / number2;
        System.out.println("result:"+" "+result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1:");
        number1 = sc.nextInt();
        System.out.println("Enter number2:");
        number2 = sc.nextInt();
        int choice;
        System.out.println("enter youar choice:");
        System.out.println("1.add");
        System.out.println("2.subtract");
        System.out.println("3. multiply");
        System.out.println("4. divide");
        System.out.println("5.Exit");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
                case 5:
                    System.out.println("Thank you");
                    break;
            default:
                System.out.println("Inappropriate operator");
                break;
        }
    }
}
