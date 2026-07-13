import java.util.Scanner;
class CharacterCount{
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        s = sc.nextLine().toLowerCase();
        int vowelCount=0;
        int consonantsCount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }else{
                consonantsCount++;
            }
        }
        System.out.println("Length="+" "+s.length());
        System.out.println("Vowels="+" "+vowelCount);
        System.out.println("Consonants="+" "+consonantsCount);
    }
}