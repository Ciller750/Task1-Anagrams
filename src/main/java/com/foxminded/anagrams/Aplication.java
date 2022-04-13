package com.foxminded.anagrams;

import java.util.Scanner;

/*
Runs the program, reads a line, prints the answer to the console, prompts you to repeat the input.
 */
public class Aplication {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Aplication().start();
    }

    public void start(){
        do {
            System.out.print("Введите строку и мы её развернём, все введённые символы останутся на месте: ");
            String inputLine = scanner.nextLine();
            String result = null;
            char[] array = inputLine.toCharArray();
            for (char check : array) {
                if (!Character.isLetter(check)) {
                    if (check != ' ') {
                        result = new ReverseLine().reverseTheLatinLetters(inputLine);
                        break;
                    }
                } else {
                    result = new ReverseLine().reverseStringLine(inputLine);
                }
            }
            System.out.println(result);
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