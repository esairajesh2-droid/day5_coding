import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        number1=sc.nextInt();
        System.out.println("Enter number2:");
        number2=sc.nextInt();
            for(int i=number1;i<=number2;i++){
                boolean isPrime=true;
                if(i<2){
                    continue;
                }
                for(int j=2;j<=i-1;j++){
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(i);
                }
            }

        }
    }