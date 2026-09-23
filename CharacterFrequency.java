import java.util.*;

class CharacterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ')
                continue;

            int count = 0;

            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ch)
                        count++;
                }

                System.out.println(ch + " = " + count);
            }
        }
    }
}