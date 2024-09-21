package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ex1_p(500));
        ____();
        System.out.println(ex2("make install"));
        ____();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(ex3(num1, num2, num3));
        ____();
        System.out.println(ex4());
        ____();
        System.out.println(ex5("bet"));

    }
    public static void ____() {System.out.println("------------------");}

    public static void ex1(int seq) {
        for (int i=1; i<=seq; ++i) {
            if ( (i % 5 == 0) || (i % 7 == 0) ) {
                if (i % 5 != 0) {
                    System.out.println("buzz");
                } else if (i % 7 != 0) {
                    System.out.println("fizz");
                } else System.out.println("fizzbuzz");
            } else System.out.println(i);
        }
    }
    public static List<String> ex1_p(int bound) {
        List<String> result = new ArrayList<>();

        for (int i=1; i<=bound; ++i) {
            if ( (i % 5 == 0) || (i % 7 == 0) ) {
                if (i % 5 != 0) {
                    result.add("buzz");
                } else if (i % 7 != 0) {
                    result.add("fizz");
                } else result.add("fizzbuzz");
            } else result.add(String.valueOf(i));
        }
        return result;
    }

    public static StringBuilder ex2(String text) {
        StringBuilder text_ = new StringBuilder();
        for (int i = text.length()-1; i>=0; --i) {
            //System.out.print(text.charAt(i) );
            text_.append(text.charAt(i));
        }
        return text_;
    }

    public static String ex3(double a, double b, double c) {
        //ax^2 + bx + c = 0
        double dis = b*b - 4 * a * c;
        if (dis >= 0) {
            String x1 = Double.toString( (-b + Math.sqrt( dis )) / (2*a) );
            if (dis > 0) {
                String x2 = Double.toString( (-b - Math.sqrt( dis )) / (2*a) );
                return (x1 + " " + x2);
            } else { return x1; }
        } else { return "no roots"; }
    }

    public static double ex4 () {
        double n = 2;
        while (n > 1.0000000000000004E-6) {
            n = 1/( n*n + n - 2 );
        }
        return n;
    }

    public static boolean ex5 (String text) {
        String text_ = new StringBuilder(text).reverse().toString();
        if (text.equals(text_)) {
            return true;
        }
        return false;
    }
}