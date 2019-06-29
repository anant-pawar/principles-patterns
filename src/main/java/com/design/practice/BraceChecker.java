package com.design.practice;

import java.util.Stack;

public class BraceChecker {
    private Stack<String> braces = new Stack<>();

    public boolean check(String expression){
        for(String token : expression.split("")){
            switch (token){
                case "(":
                case "{":
                case "[":
                    braces.push(token);
                    break;
                case "}":{

                    if(braces.empty() || !braces.pop().equals("{"))
                        return false;
                    break;
                }
                case ")":{
                    if(braces.empty() || !braces.pop().equals("("))
                        return false;
                    break;
                }
                case "]":{
                    if(braces.empty() || !braces.pop().equals("["))
                        return false;
                    break;
                }
            }
        }
        return braces.empty();
    }
}
