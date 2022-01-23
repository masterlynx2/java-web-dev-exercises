package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        String wonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        String placeHolder = wonderland.toLowerCase();
        System.out.println("what characters are you looking for? ");
            String search = input.nextLine().toLowerCase();
            wonderland.contains(search.toLowerCase()) ;

            boolean yesno = placeHolder.contains(search);
        System.out.println("the result of yoru search is " + yesno);
                Integer index =  placeHolder.indexOf(search);
                System.out.println("your index is " + index + ". your term is " + search +" ." );
                Integer length = search.length();
                System.out.println(length + " is the length of your search");
                String remove  = placeHolder.replace(search,"");
        System.out.println(remove);


//                String str = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
//                        "having nothing to do: " +
//                        "once or twice she had peeped into the book her sister was reading, " +
//                        "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
//                        "thought Alice 'without pictures or conversation?'";
//                char [] ch = new char[str.length()];
//
//                for (int i = 0 ; i <str.length(); i++){
//                    ch[i] = str.charAt(i);
//                }
//
//                    for (char c: ch)  {
//
//                        System.out.print(c);
//                    }



    }
}
