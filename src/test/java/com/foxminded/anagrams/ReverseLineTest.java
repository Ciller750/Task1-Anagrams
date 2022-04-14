package com.foxminded.anagrams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLineTest {
    private static final Reverse reverse = new Reverse();

    @Test
    void reverseLineWithEvenLetter() {
        assertEquals("java", reverse.reverseLine("avaj"));
    }

    @Test
    void reverseLineWithUnevenLetter() {
        assertEquals("hello", reverse.reverseLine("olleh"));
    }

    @Test
    void reverseLineWithLetterWithSpace() {
        assertEquals("hello java", reverse.reverseLine("olleh avaj"));
    }

    @Test
    void reverseLineWithCharacterAtTheBegining() {
        assertEquals("!hello", reverse.reverseLine("!olleh"));
    }

    @Test
    void reverseLineWithCharacterAtTheEnd() {
        assertEquals("hello!", reverse.reverseLine("olleh!"));
    }

    @Test
    void reverseLineWithCharacterInTheMiddle() {
        assertEquals("he1llo!", reverse.reverseLine("ol1leh!"));
    }

    @Test
    void reverseLineOnlyWithCharacter() {
        assertEquals("!@#$123", reverse.reverseLine("!@#$123"));
    }

    @Test
    void reverseLineWithCharacterAndOneLetter() {
        assertEquals("!@#$123a", reverse.reverseLine("!@#$123a"));
    }
}