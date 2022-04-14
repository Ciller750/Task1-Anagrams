package com.foxminded.anagrams;

/*
Rverses the string, leaving everything but the letters in place.
 */
public class Reverse {

    public String reverseLine(String input) {
        StringBuilder result = new StringBuilder();
        char temp;
        String[] springArray = input.split(" ");
        for (String line : springArray) {
            char[] charArray = line.toCharArray();
            for (int head = 0, tail = charArray.length - 1; head < tail; ) {
                if (!Character.isLetter(charArray[head])) {
                    head++;
                    continue;
                } else if (!Character.isLetter(charArray[tail])) {
                    tail--;
                    continue;
                } else {
                    temp = charArray[head];
                    charArray[head] = charArray[tail];
                    charArray[tail] = temp;
                }
                head++;
                tail--;
            }
            result.append(charArray);
            result.append(" ");
        }
        return result.substring(0, result.length() - 1);
    }
}