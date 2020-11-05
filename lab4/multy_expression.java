package com.company;

import java.io.*;
import java.util.Stack;
import java.util.ArrayList;


public class multy_expression {
    ArrayList<String> List_Of_Expressions = new ArrayList<>();

    public void get_and_check_expressions() {
        try {
            File file = new File("D:\\three_expressions.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            for (int i = 0; i < 3; i++) {
            List_Of_Expressions.add(reader.readLine());
            System.out.println(List_Of_Expressions.get(i) + " is " + isExpressionBalanced(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isExpressionBalanced(int j) {
        Stack<Character> stack = new Stack<Character>(); 

        char[] c = List_Of_Expressions.get(j).toCharArray();

        for (int i = 0; i < List_Of_Expressions.get(j).length() ; i++)
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

