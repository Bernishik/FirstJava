package com.epam.student.bernish;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.println("Вкажіть Завдання");
        int num1 = menu.nextInt();
        switch (num1) {
            case 1:
                Calculator();
                break;
            case 2:
                Task2();
                break;
            case 3:
                Task3();
                break;
            case 4:
                Task4();
                break;
            case 5:
                Task5();
                break;
            case 6:
                Task6();
                break;
            case 7:
                Task7();
                break;
            case 8:
                Task8();
                break;
            case 9:
                Task9();
                break;
            case 10:
                Task10();
                break;
            case 11:
                Task11();
                break;
            case 12:
                Task12();
                break;
            case 13:
                Task13();
                break;
            case 14:
                Task14();
                break;
            case 15:
                Task15();
                break;
            default:
                System.out.println("Сорян, немає такого завдання");

        }


    }

    public static void Calculator() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number");
        int value = inp.nextInt();
        for (int i = 0; i <= 10; i++)
            System.out.println(value + " * " + i + " = " + value * i);
    }

    public static void Task2() {
        System.out.println("заглушка");
    }

    public static void Task3() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number");
        int value = inp.nextInt();
        int result = 0;
        if (value > 0) {
            for (int i = 1; i <= value; i++) {
                result = result + i;
            }
            System.out.println(result);
        } else {
            System.out.println("Bad request");
        }


    }

    public static void Task4() {

        Scanner inp1 = new Scanner(System.in);
        System.out.println("Enter number x");
        int x = inp1.nextInt();
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Enter number y");
        int y = inp2.nextInt();
        for (int k = 0; k < y; k++) {
            for (int i = 0; i < x; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }

    public static void Task5() {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        for (int i = 0; i <= 11; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;

        }


    }

    public static void Task6() {
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Вкажіть цифру");
        int num1 = inp1.nextInt();
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Вкажіть число для видалення");
        int del = inp2.nextInt();
        int lenght = LenghtNum(num1);

        int[] Nums;// масив
        Nums = new int[lenght];
        String result = "";
        for (int i = 0; i < lenght; i++) {
            if (num1 > 0) {
                int newNum = num1 % 10;
                num1 /= 10;
                if (newNum != del) {
                    Nums[i] = newNum;
                } else {
                    Nums[i] = -10;
                }
            }
        }
        for (int i = 1; i <= lenght; i++) {
            if (Nums[lenght - i] != -10) {
                result += Nums[Array.getLength(Nums) - i];
            }
        }
        System.out.println(result);

    }

    public static int LenghtNum(int number) {
        int result = 0;
        number = Math.abs(number);
        while (number > 0) {
            number /= 10;
            result++;
        }
        return result;
    }

    public static void Task7() {
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Вкажіть цифру");
        int num1 = inp1.nextInt();
        if (num1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }

        System.out.println(LenghtNum(num1));
    }

    public static void Task8() {
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Вкажіть цифру");
        int num1 = inp1.nextInt();
        int lenght = LenghtNum(num1);
        int result = 0;
        int Nums[];// масив
        Nums = new int[lenght];
        for (int i = 0; i < lenght; i++) {

            int newNum = num1 % 10;
            num1 /= 10;
            Nums[i] = newNum;


        }
        for (int i = 0; i < lenght; i++) {
            result += Nums[i];

        }
        System.out.println(result);

    }
    public static void Task9() {
        int[] nums;
        nums = new int[10];
        int summ = 0;
        for (int i = 0; i < 10; i++) {
            Scanner inp1 = new Scanner(System.in);
            System.out.println("Вкажіть число " + (i + 1));
            int num = inp1.nextInt();
            nums[i] = num;
            summ += nums[i];
        }
        /// found min
        int min = nums[0];
        for (int i = 0; i < 10; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        /// end
        /// found max
        int max = nums[0];
        for (int i = 0; i < 10; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        double Aref = summ;
        /// end
        System.out.println("Сумма чисел :" + summ);
        System.out.println("Середнє арифметичне:" + Aref / 10);
        System.out.println("Мінімальне: " + min);
        System.out.println("Максимальне: " + max);


    }
    public static void Task10() {
        while (true) {
            Scanner inp1 = new Scanner(System.in);
            System.out.println("Enter number x");
            double x = inp1.nextDouble();
            Scanner inp2 = new Scanner(System.in);
            System.out.println("Enter number y");
            double y = inp2.nextDouble();
            double z = -1;
            System.out.println("Chose actions:");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("0. Exit");
            Scanner inp3 = new Scanner(System.in);
            String A = inp3.next();
            switch (A) {
                case "0":
                    return;
                case "1":
                case "+":
                    z = x + y;
                    break;
                case "2":
                case "-":
                    z = x - y;
                    break;
                case "3":
                case "*":
                    z = x * y;
                    break;
                case "4":
                case "/":
                    if (y != 0) {
                        z = x / y;
                    } else {
                        System.out.println("Error. Divining by ZERO");
                    }
                    break;
                default:
                    System.out.println("Error. Wrong sign");
            }
            System.out.println(z);
        }

    }
    public static void Task11() {
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Enter number m");
        int m = inp1.nextInt();
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Enter number n");
        int n = inp2.nextInt();
        int i = 2;
        int k = m;
        int z;
        while (m <= n){
            System.out.println("Всі дільники на число " + m + " : ");
            while (i < m){
                z = m % i;

                if(z == 0){
                    System.out.print(i + ", ");
                }

                i++;
            }
            System.out.println();
            i = 2;
            m++;
        }

    }
    public static void Task12() {
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Вкажіть цифру");
        int num1 = inp1.nextInt();
        int lenght = LenghtNum(num1);
        int Nums[];// масив
        Nums = new int[lenght];
        String result = "";
        for (int i = 0; i < lenght; i++) {

            int newNum = num1 % 10;
            num1 /= 10;

            if (num1 < 0){
                if (i == 0){
                    result +=  "-";
                }
                Nums[i] = Math.abs(newNum) ;
            }
            Nums[i] = Math.abs(newNum) ;
            result += Nums[i];

        }
        System.out.println(result);
    }
    public static void Task13() {
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Вкажіть число");
        int num1 = inp1.nextInt();
        String result = "";
        switch (num1){
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "VI";
                break;
            case 7:
                result = "VII";
                break;
            case 8:
                result = "VIII";
                break;
            case 9:
                result = "IX";
                break;
            default:
                result = "ERROR WRONG NUMBER";
        }
        System.out.println(result);
    }
    public static void Task14() {
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Enter number m");
        int m = inp1.nextInt();
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Enter number n");
        int n = inp2.nextInt();
        int i =  m;
        if ( m % 2 == 0){
            i =  m + 1;
            }
        int result = 0;
        while ( i < n){
            result += i;
            i += 2;
        }
        System.out.println(result);

    }

    public static void Task15() {
        char sum = '^';
        Scanner inp1 = new Scanner(System.in);
        System.out.println("Введіть висоту");
        int h = inp1.nextInt();
        int lenght = (h * 2) - 1;

        for (int i = 0; i < h; i++) {
            int sumvols = 1 + (i * 2);
            int half = (lenght - sumvols) / 2;
            // пропуск
            for (int k = 0; k < half; k++) {
                System.out.print(" ");
            }
            // символи
            for (int k = 0; k < sumvols; k++) {
                System.out.print(sum);
            }
            /// пропуск
            for (int k = 0; k < half; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void Unicorn() {
        while (true) {
            Scanner inp1 = new Scanner(System.in);
            System.out.println("Do you want to create a Unicorn");
            String answer = inp1.next();
            switch (answer.toLowerCase()) {
                case "yes, i do":
                case "yes":
                    System.out.println("Of course you want to create a Unicorn!");
                    System.out.println("*Fuck the shoulder*");
                    break;
                case "no, i do not":
                case "no, i don't":
                case "no":
                    System.out.println("Oh no. YOU WANT TO CREATE A UNICORN!!!");
                    System.out.println("*Stronger fuck the shoulder*");
                    break;
                default:
                    System.out.println("*Fuck the shoulder*");
            }
        }
    }
}
