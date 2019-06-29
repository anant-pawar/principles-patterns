package com.design.practice;

import java.util.Arrays;
import java.util.Stack;

public class ReversePolishCalculator {
    private String[] operators = new String[]{"+", "-", "*", "/"};
    private Stack<String> rp = new Stack();

    public int calculateM2(String calculationString) {
        return Integer.parseInt(Arrays.stream(calculationString.split("")).reduce((a, b) -> {
            String[] values = a.split("");
            switch (b) {
                case "+":
                    return String.valueOf(Integer.parseInt(values[0]) + Integer.parseInt(values[1]));
                case "-":
                    return String.valueOf(Integer.parseInt(values[0]) - Integer.parseInt(values[1]));
                case "*":
                    return String.valueOf(Integer.parseInt(values[0]) * Integer.parseInt(values[1]));
                case "/":
                    return String.valueOf(Integer.parseInt(values[0]) / Integer.parseInt(values[1]));
            }
            return a + b;
        }).get());

    }

    public int calculateM1(String calculationString) {

        for (String token : calculationString.split("")) {
            if (Arrays.asList(operators).contains(token)) {

                int a = Integer.parseInt(rp.pop());
                int b = Integer.parseInt(rp.pop());

                switch (token) {
                    case "+":
                        rp.push(String.valueOf(a + b));
                        break;
                    case "-":
                        rp.push(String.valueOf(b - a));
                        break;
                    case "*":
                        rp.push(String.valueOf(a * b));
                        break;
                    case "/":
                        rp.push(String.valueOf(b / a));
                        break;
                }
            } else
                rp.push(token);
        }
        return Integer.parseInt(rp.pop());
    }
}
