import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class maven {
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Something: ");
        String userInput = scanner.nextLine();
        System.out.printf("You entered: %s%n", userInput);
        if(StringUtils.isNumeric(userInput)){
            System.out.printf("%s is a number%n",userInput);
        } else if(!StringUtils.isNumeric(userInput)){
            System.out.printf("%s is not a number%n", userInput);
            System.out.printf("Flipped Case: %s%n",StringUtils.swapCase(userInput));
        }
        System.out.println(StringUtils.reverse(userInput));

    }
}
