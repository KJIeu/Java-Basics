package com.company;

import java.io.*;
import java.util.Stack;

public class one_expression {

    String expression;

    public one_expression(String input){
        this.expression = input;
        System.out.print(expression + " is ");
    }

    public one_expression(){
        try {
            File file = new File("D:\\one_expression.txt"); //check path

            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            this.expression = reader.readLine();
            System.out.print(expression + " is ");

        }
        catch (FileNotFoundException e)
                {e.printStackTrace(); }
        catch (IOException e)
                {e.printStackTrace(); }
    }

    public boolean isExpressionBalanced() {
        Stack<Character> stack = new Stack<Character>();

        char[] c = expression.toCharArray();

        for (int i = 0; i < expression.length() ; i++)
        {
            if(c[i] == '(' || c[i] == '[' || c[i] == '{') {
                stack.push(c[i]);
            } else if((c[i] == ')' && (stack.isEmpty() || stack.pop() != '(')) ||
                    (c[i] == ']' && (stack.isEmpty() || stack.pop() != '[')) ||
                    (c[i] == '}' && (stack.isEmpty() || stack.pop() != '{'))) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
