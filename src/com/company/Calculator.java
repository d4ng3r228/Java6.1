package com.company;

import java.util.*;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    List<Double> numbers = new ArrayList<>();
    List<String> signs = new ArrayList<>();

    public double add(double left, double right) {
        double result;
        return result = left + right;

    }

    public double minus(double left, double right) {
        double result;
        return result = left - right;
    }

    public double multiply(double left, double right) {
        double result;
        return result = left * right;

    }

    public double divide(double left, double right) {
        double r;
        return r = left / right;
    }


    public void calculating(String task) {
        String p = "+";
        String m = "-";
        String mul = "*";
        String d = "/";
        task = scanner.nextLine();  //2+1+8/4*3
        List<Character> Exercise = new ArrayList<>();
        for (char element : task.toCharArray()) {
            Exercise.add(element);
        }
        for (char c : Exercise) {

            if (String.valueOf(c).equals(p) == false && String.valueOf(c).equals(m) == false && String.valueOf(c).equals(mul) == false && String.valueOf(c).equals(d) == false) {
                numbers.add(Double.parseDouble(String.valueOf(c)));
            } else if (String.valueOf(c).equals(p) == true || String.valueOf(c).equals(m) == true || String.valueOf(c).equals(mul) == true || String.valueOf(c).equals(d) == true) {
                if (signs.size() == 0) {
                    signs.add(String.valueOf(c));
                }
                else if (String.valueOf(c).equals(mul) || String.valueOf(c).equals(d)){
                    if ( signs.get(signs.size() - 1).equals(mul) || signs.get(signs.size() - 1).equals(d)){
                        if (signs.get(signs.size() - 1).equals(mul)){
                            double result = multiply(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(result);
                            signs.remove(signs.size() - 1);
                            signs.add(String.valueOf(c));
                        }
                        else if (signs.get(signs.size() - 1).equals(d)){
                            double result = divide(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(result);
                            signs.remove(signs.size() - 1);
                            signs.add(String.valueOf(c));
                        }

                    }
                    else if (signs.get(signs.size() - 1).equals(p) || signs.get(signs.size() - 1).equals(m)){
                        signs.add(String.valueOf(c));
                    }
                }

                else if (String.valueOf(c).equals(p) || String.valueOf(c).equals(m)) {

                    if (signs.get(signs.size() - 1).equals(mul) || signs.get(signs.size() - 1).equals(d)){
                        if (signs.get(signs.size() - 1).equals(mul)){
                            double result = multiply(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(result);
                            signs.remove(signs.size() - 1);
                            signs.add(String.valueOf(c));
                        }
                        else if (signs.get(signs.size() - 1).equals(d)){
                            double result = divide(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(result);
                            signs.remove(signs.size() - 1);
                            signs.add(String.valueOf(c));
                        }

                    }


                    else if (signs.get(signs.size() - 1).equals(p) || signs.get(signs.size() - 1).equals(m)) {
                        if (signs.get(signs.size() - 1).equals(p)) {
                            double result = add(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(result);
                            signs.remove(signs.size() - 1);
                            signs.add(String.valueOf(c));
                           
                        } else if (signs.get(signs.size() - 1).equals(m)) {
                            double result = minus(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(result);
                            signs.remove(signs.size() - 1);
                            signs.add(String.valueOf(c));
                        }

                    }
                }
            }
        }

        double result= 0;
        while (signs.size()!=0){

            if (signs.get(signs.size() - 1).equals(m)) {
                result = minus(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(result);
                signs.remove(signs.size() - 1);

            }
            else if (signs.get(signs.size() - 1).equals(p)){
                 result = add(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(result);
                signs.remove(signs.size() - 1);
                }
            else if (signs.get(signs.size() - 1).equals(mul)) {
                result = multiply(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(result);
                signs.remove(signs.size() - 1);
            }
            else if (signs.get(signs.size() - 1).equals(d)) {
                result = divide(numbers.get(numbers.size() - 2), numbers.get(numbers.size() - 1));
                numbers.remove(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(result);
                signs.remove(signs.size() - 1);
            }
        }
        System.out.println(result);
    }

}


