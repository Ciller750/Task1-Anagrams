package com.foxminded.anagrams;

/*
String reversal logic, the first method unrolls the string completely,
 the second method leaves the characters in place, the third method is technical.
 */
public class ReverseLine {

    public String reverseStringLine(String inputLine) {
        StringBuilder str;
        StringBuilder result = new StringBuilder();

        String[] array = inputLine.split(" ");
        for (int i = 0; i < array.length; i++) {
            str = new StringBuilder(array[i]);
            result.append(str.reverse()).append(" ");
        }
        return result.toString();
    }

    public String reverseTheLatinLetters(String inputLine) {
        StringBuilder result = new StringBuilder();
        String[] stringArray = inputLine.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            result.append(logicOfReverseTheLatinLettersMethod(stringArray[i]));
            result.append(" ");
        }
        return result.toString();
    }

    private static String logicOfReverseTheLatinLettersMethod(String inputLine) {
        char[] charArray = inputLine.toCharArray();
        char temp;
        int count = 0;
        int n = 0;

        for (int i = 0; i <= charArray.length / 2 - n; i++) {
            if (Character.isLetter(charArray[i])) {
                for (int j = charArray.length - 1; j > charArray.length / 2; j--) {
                    if (Character.isLetter(charArray[charArray.length - 1 - count])) {
                        temp = charArray[i];
                        charArray[i] = charArray[charArray.length - 1 - count];
                        charArray[charArray.length - 1 - count] = temp;
                        count++;
                        break;
                    }
                    n++;
                    count++;
                }
            }
        }
        return new String(charArray);
    }
}