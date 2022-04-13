import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something:  ");
        String input = sc.nextLine();
        System.out.println("You Entered:  ");
        System.out.println(input);

        if (StringUtils.isNumeric(input)){
            System.out.println((input + " is a number!"));
        } else {
            System.out.println(input + " is not a number!");
        }


        System.out.println("Flipped case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));



    }
}
