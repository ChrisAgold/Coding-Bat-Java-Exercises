import java.util.Scanner;

public class CodingBatExercises {
    // Warmup 1
    // The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    //sleepIn(false, false) → true
    //sleepIn(true, false) → false
    //sleepIn(false, true) → true
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;

        // Warmup 2
//        Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//        diff21(19) → 2
//        diff21(10) → 11
//        diff21(21) → 0
        // Solution
//        public int diff21(int n) {
//            if(n > 21) {
//                return Math.abs(2*(n-21));
//            } else {
//                return Math.abs(n - 21);
//            }
//        }
    }

    //    Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
//
//    backAround("cat") → "tcatt"
//    backAround("Hello") → "oHelloo"
//    backAround("a") → "aaa"
    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    // Given a string, return true if the string starts with "hi" and false otherwise.
    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        String s = str.substring(0, 2);
        if (s.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    // We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);
    }

    // mixStart
    // Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
    public boolean mixStart(String str) {
        if(str.length() < 3) {
            return false;
        }
        String two = str.substring(1, 3);
        return(two.equals("ix"));
    }

    // close10
    // Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


}
