package pro.sky;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Число " + i);
        }
        //Задание 2
        System.out.println("Задание 2");
        for (int a = 10; a >= 0; a--) {
            System.out.println("Число " + a);
        }
        //Задание 3
        System.out.println("Задание 3");
        for (int b = 0; b < 17; b += 2) {
            System.out.println("Четное число " + b);
        }
        //Задание 4
        System.out.println("Задание 4");
        for (int с = 10; с > -11; с--) {
            System.out.println("Число " + с);
        }
        //Задание 6.1
        System.out.println("Задание 6.1");
        for (int y = 1904; y < 2097; y = y + 4) {
            System.out.println(y + " год является високосным ");
        }
        //Задание 6.2
        System.out.println("Задание 6.2");
        for (int p = 7; p < 99; p = p + 7) {
            System.out.println(" Число " + p);
        }
        //Задание 6.3
        System.out.println("Задание 6.3");
        for (int d = 1; d < 513; d = d * 2) {
            System.out.println(" Число " + d);
        }
        //Задание 8.1
        System.out.println("Задание 8.1");
        int salary = 29000;
        int total = 0;
        for (int s = 1; s < 13; s++) {
            total = total + salary;
            System.out.println("Месяц " + s + " сумма накоплений равна " + total + " рублей");
        }
        //Задание 8.2
        System.out.println("Задание 8.2");
        int salary1 = 29000;
        int total1 = 0;
        for (int t = 1; t < 13; t++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + t + " сумма накоплений равна " + total1 + " рублей");

        }
    }
    }
