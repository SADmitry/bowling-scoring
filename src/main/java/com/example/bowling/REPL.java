package com.example.bowling;

import java.util.Arrays;
import java.util.Scanner;

public class REPL {
    public static void main(String[] args) {
        var flag = true;
        var scanner = new Scanner(System.in);
        var engine = new BowlingEngine();
        while (flag) {
            System.out.println("Enter your rolls using comma as a separator or 'q' to exit: ");
            var result = scanner.nextLine();
            if ("q".equals(result)) {
                flag = false;
            } else {
                int[] arr = Arrays.stream(result.split(","))
                        .map(String::trim).mapToInt(Integer::parseInt).toArray();
                System.out.println(engine.score(arr));
            }
        }
    }
}
