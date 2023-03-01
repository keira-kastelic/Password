import java.util.Random;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password";
        System.out.println("Enter a username");
        Scanner usernameIntake = new Scanner(System.in);
        String userUsername = usernameIntake.nextLine();
        System.out.println("Enter a password");
        Scanner passwordIntake = new Scanner(System.in);
        String userPassword = passwordIntake.nextLine();
        boolean userEquals = username.equals(userUsername);
        boolean passEquals = password.equals(userPassword);
        boolean bothEqual = userEquals && passEquals;
        System.out.println(bothEqual);
        Dictionary d = new Dictionary();
        String word = d.randomWord();
        String Word2 = d.randomWord();
        Random r = new Random();
        int num = r.nextInt(9)+1;
        System.out.println("Here's a better password!  "+word+num+Word2);

        
    }
}
