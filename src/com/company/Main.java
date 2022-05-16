package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String MyBestFriend;
        final int NUM = 20;
        String word = "Rustam";
        MyBestFriend = (NUM + " " + word);
        System.out.println(MyBestFriend + " " + NUM + " " + word);
        if (NUM > 0){
			System.out.println("Вы сохранили положительное число");
		} else if (NUM < 0){
			System.out.println("Вы сохранили отрицательное число");
		} else {
			System.out.println("Вы сохранили нуль");
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ваше имя ");
		String name = scanner.nextLine();
		System.out.println("Привет " + name);
    }
}
