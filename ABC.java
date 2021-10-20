package com.company;

public class ABC {
    public static void main(String[] args) {

        //Задача 1.5. Из исходного слова путём "вырезок" и "склеек" его подстрок получить другие слова:
        //рекурсия: серия, кисея.

        String str = "рекурсия";
        String l_1, l_2, l_3, l_4, l_5, l_6;
        l_1 = str.substring(0, 1);//р
        l_2 = str.substring(1, 2);//е
        l_3 = str.substring(2, 3);//к
        l_4 = str.substring(5, 6);//с
        l_5 = str.substring(6, 7);//и
        l_6 = str.substring(7);//я

        String str_1 = l_4 + l_2 + l_1 + l_5 + l_6;//серия
        System.out.println(str_1);

        String str_2 = l_3 + l_5 + l_4 + l_2 + l_6;//кисея
        System.out.println(str_2);

    }
}
