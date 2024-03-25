package Task2;//Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
// В результате сравнения в консоль должно быть выведено одно из сообщений:
// "Строки неидентичны" или "Строки идентичны"


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку a = ");
        String a = in.nextLine();
        System.out.println("Введите строку b = ");
        String b = in.nextLine();
        int count = 0;
        char[] new_a = a.toCharArray();
        System.out.println("new_a = " + new_a);
        char[] new_b = b.toCharArray();
        System.out.println("new_b = " + new_b);
        if (new_a.length == new_b.length) {
            for (int i = 0; i < new_a.length; i++) {
                if (new_a[i] == new_b[i]) {
                    count += 1;
                } else {
                    count = count + 0;
                }
            }
        }
        if (count == (new_a.length)) {
            System.out.println("Строки идентичны");
        } else{
            System.out.println("Строки неидентичны");
            System.out.println("count = "+count);
    }
    }
}

