package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    private String[] operators = {"+", "-", "*", "/"};

    public double add (double left, double right){
        double result;
        return result = left + right;

    }
    public double minus (double left, double right){
        double result;
        return result = left - right;

    }
    public double multiply (double left, double right){
        double result;
        return result = left * right;

    }
    public double divide (double left, double right){
        double r;
        return r = left / right;
    }



    public void parseIt(){
        Scanner scanner = new Scanner(System.in);
        String string = "2+1+8/4*3";//scanner.nextLine(); //  2+1+8/4*3

        List<Character> Exercise = new ArrayList<>();
        for (char element: string.toCharArray()) {
            Exercise.add(element);
        }
        System.out.println(Exercise);

        int x = string.indexOf("/");
        int s = Integer.parseInt(String.valueOf(Exercise.get(string.indexOf("/")-1)));
        double result;

        for (char element: Exercise) {
            switch (String.valueOf(element)){
                case "/":
                        result = divide(Integer.parseInt(String.valueOf(Exercise.get(string.indexOf(element)-1))), Integer.parseInt(String.valueOf(Exercise.get(string.indexOf(element)+1))));
                        Exercise.remove(Exercise.indexOf(element));
                        System.out.println(Exercise);
                        System.out.println(result);
                      //  System.out.println(Exercise.size());

            }
        }


    }
}

