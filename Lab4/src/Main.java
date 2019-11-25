import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        // Files.lines(Paths.get("Expression.txt"), StandardCharsets.UTF_8).forEach(System.out::println);
        String content = new String(Files.readAllBytes(Paths.get("Expression.txt")));
        String[] arrayOfStrings = content.split("\r\n");


        for (int i = 0; i < arrayOfStrings.length; i++) {

            BracketsChecker bracketsCheck = new BracketsChecker(arrayOfStrings[i]);
            String expression1 = bracketsCheck.isBalanced();
            System.out.println(expression1);
        }


    }

}


       // bracketsCheck.checkIfBalanced();
        /*String fileString = new String(Files.readAllBytes(Paths.get("Expression.txt")), StandardCharsets.UTF_8);
        System.out.println(fileString);
        String expression1 = checkIfBalanced(fileString);
        System.out.println(expression1);*/








