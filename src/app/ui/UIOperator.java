package app.ui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UIOperator {

    public String getSearchValue() {
        Scanner scanner = new Scanner(System.in);
        String inputPattern = "\\d\\.\\d{2}";
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher;

        String input = "";
        boolean isValid = false;

        System.out.print("Input price to search in format x.xx: ");
        while (!isValid) {
            input = scanner.nextLine();
            matcher = pattern.matcher(input);
            isValid = matcher.matches();

            if (!isValid) {
                System.out.print("Invalid input format. Please input a price in the format x.xx: ");
            }
        }
        return input;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
