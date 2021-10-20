package com.company;

public class Str {
    public static void main(String[] args) {
        System.out.println("Дано предложение. Все его символы, стоящие на третьем, шестом," +
                " девятом и т.д. местах замените буквой а.");
        System.out.println(abracadabra("Дано предложение. Все его символы, стоящие на третьем, шестом," +
                " девятом и т.д. местах замените буквой а."));
    }
        static String abracadabra(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 2; i <= sb.length(); i += 3)
            sb.setCharAt(i, 'a');
        return sb.toString();
    }
}
