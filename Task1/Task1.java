package Task1;
// 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними
// следующие действия:
// - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного
// из вариантов: "a > b", "a < b" или "a = b";
// - совершает с этими числами операции сложения, вычитания, деления и умножения и результат
// выводит в консоль.

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введиче число a: ");
        float a = in.nextFloat();

        System.out.print("Введите число b: ");
        float b = in.nextFloat();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        if (b==0) {
            System.out.println("a - b = Ошибка деления на ноль");
        } else {System.out.println("a / b = " + (a / b));
        }
        System.out.println("a * b = " + (a * b));
    }
}


