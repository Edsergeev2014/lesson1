package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        randomGame();
    }

/*  1. Написать программу, которая загадывает случайное число от 0 до 9,
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
    или меньше. После победы или проигрыша выводится запрос –
    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
*/


    public static void randomGame() {


        System.out.println("Давай поиграем в игру Random Game ?");
        System.out.println("Я загадал число от 0 до 9 угадай какое ? У тебя есть три попытки ");
        Random rand = new Random();
        int x = rand.nextInt(9);

        System.out.println("Программа загадала число - " + x);
        System.out.println("   ");

        System.out.println("Введите свое число ");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cointer = 0;
        do {
            cointer ++;
            if (a == x) {
                System.out.println(" Ура ты угадал программа загадала " + x + " " + "Твой результат такой же -  " + a);
            } else if (a < x) {
                System.out.println("Неправильно число кторое вы указали МЕНЬШЕ , чем то которое загадала программа " + x);
            } else if (a > x) {
                System.out.println("Неправильно число кторое вы указали БОЛЬШЕ  , чем то, которое загадала программа " + x);

            }
            break;
        } while (cointer<3) ;

    }


}




