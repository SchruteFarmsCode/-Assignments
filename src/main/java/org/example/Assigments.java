package org.example;

import java.util.Arrays;
    public class Assigments {
        public static int divideByTwo(int num) {
            return num / 2;
        }

        public static int divide(int x, int y) {
            return x / y;
        }

        public static int checkLenght(String text) {
            return text.length();
        }

        public static void validateLenght(String text) throws TextTooLongException, TextTooShortException {
            int textLenght = checkLenght(text);
            if (textLenght > 10) {
                throw new TextTooLongException("Text is too long");
            } else if (textLenght < 4) {
                throw new TextTooShortException("Text is too short");
            }
        }

        public static String reverse(String example) {
            StringBuilder reversed = new StringBuilder(example);
            return reversed.reverse().toString();
        }

        public static boolean checkAnagram(String text1, String text2) {
            text1 = text1.replaceAll("\\s", "").toLowerCase();
            text2 = text2.replaceAll("\\s", "").toLowerCase();
            if (text1.length() != text2.length()) {
                return false;
            }
            char[] charArray1 = text1.toCharArray();
            char[] charArray2 = text2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }

        public static boolean checkPalindrome(String text1, String text2) {
            String combined = text1 + text2;
            int lenght = combined.length();
            for (int i = 0; i < lenght / 2; i++) {
                if (combined.charAt(i) != combined.charAt(lenght - 1 - i)) {
                    return false;
                }
            }
            return true;

        }

        public static int factiorial(int n) {
            int obj = 1;
            for (int i = 1; i <= n; i++) {
                obj *= i;
            }
            return obj;

        }

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            int x1 = 0;
            int x2 = 1;
            for (int i = 2; i <= n; i++) {
                int temp = x1 + x2;
                x1 = x2;
                x2 = temp;
            }
            return x2;

        }


    }

