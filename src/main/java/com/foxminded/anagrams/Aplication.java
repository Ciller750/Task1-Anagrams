package com.foxminded.anagrams;

import java.util.Scanner;

/*
Runs the program, reads a line, prints the answer to the console, prompts you to repeat the input.
 */
public class Aplication {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Reverse reverse = new Reverse();

    public static void main(String[] args) {
        do {
            System.out.print("Введите строку и мы её развернём, все введённые символы останутся на месте: ");
            String inputLine = scanner.nextLine();
            System.out.println(reverse.reverseLine(inputLine));
        } while (repeatReverseLine());
        scanner.close();
    }

    private static boolean repeatReverseLine() {
        System.out.println("Хотите ввести ещё одну строку?\n Введите Y - YES или N - NO и нажмите Enter");
        String repeat = scanner.nextLine();
        if (repeat.equalsIgnoreCase("Y")) {
            return true;
        } else if (repeat.equalsIgnoreCase("N")) {
            return false;
        } else {
            System.out.print("Некоректный ввод, попробуйте ещё раз: ");
            return repeatReverseLine();
        }
    }
}