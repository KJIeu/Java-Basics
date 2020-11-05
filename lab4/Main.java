package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Single expression: ");
        one_expression one_string1 = new one_expression("(2 * 4 + (3 +6 * 9 -    12 * (2*9 - 15))  + 2 +(-4)*((2 - 15))");
        //in this case must output false
        System.out.println(one_string1.isExpressionBalanced());

        //!!!Ahtung!!! before test check txt path
        one_expression one_string2 = new one_expression();
        //if u use one_string.txt without any changes, must be true
        System.out.println(one_string2.isExpressionBalanced());
        System.out.println("\n---------------------------------");

        System.out.println("\n Three expressions in one file: ");

        //Actually problem with can be solved in this way
        /*try {
            //!!!Ahtung!!! before test check txt path
            File file = new File("D:\\three_expressions.txt");
            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);
            for (int i = 0; i < 3; i++) {
                String expression = reader.readLine();
                one_expression three_strings = new one_expression(expression);
                System.out.println(three_strings.isExpressionBalanced());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace(); }
        catch (IOException e) {
            e.printStackTrace();
        }*/

        //but I think u want new class for three expressions, so
        multy_expression three_strings = new multy_expression();
        //!!!Ahtung!!! before test check txt path
        three_strings.get_and_check_expressions();


    }
}
