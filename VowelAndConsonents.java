import java.util.Scanner;
public class VowelAndConsonents{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String str = sc.nextLine();
        int vowels = 0;
        int  consonants = 0;

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);

            if(Character.isLetter(ch)){

                ch = Character.toLowerCase(ch);
                if(ch == 'a' ||
                   ch == 'e' ||
                   ch == 'i' ||
                   ch == 'o' ||
                   ch == 'u')
                   {
                    vowels++;
                } 
                else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }
}