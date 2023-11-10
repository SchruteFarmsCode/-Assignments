package org.example;

//import java.io.IOException

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        *1.metodę "divideByTwo", która przyjmie liczbę i zwróci ją podzieloną przez dwa
        int num = 10;
        int result = divideByTwo(num);
        System.out.println("1.The result of the number " + num + " devide by two: " + result);

//        2.metodę "divide", która przyjmie dwie liczby i zwróci wynik ich dzielenia
        int a = 240;
        int b = 12;
        int resul2 = divide(a, b);
        System.out.println("2.The result of the number " + a + " devide by " + b + " : " + resul2);

//        3.metodę "checkLenght", która przyjmie tekst i zwróci jego długość
        String words = "Is the autum?";
        int result3 = checkLenght(words);
        System.out.println("3.The lenght of String: " + words + " : " + result3);

//        4.używając powyżej metody napisz metodę "validateLenght", która przyjmie tekst i rzuci własnym wyjątkiem "TextTooLongException",
//        dla tekstu dłuższego niż 10 znaków, lub wyjątkiem "TextTooShortException" dla tekstu krótszego od 4 znaków.
        String textToCheck = "Monticolo";
        try {
            validateLenght(textToCheck);
            System.out.println("4. " + textToCheck + "--> Text is ok");
        } catch (TextTooLongException e) {
            System.out.println("4. " + textToCheck + " --> text is too long");
            e.getMessage();
//            e.printStackTrace();
        } catch (TextTooShortException e) {
            System.out.println("4. " + textToCheck + "  --> Text is too short");
            e.getMessage();
//            e.printStackTrace();
        }
        //    5.-metodę "reverse", która przyjmie tekst i zwróci tekst odwrócony (abc -> cba)
        String myFiveExample = "abc";
        String result5 = reverse(myFiveExample);
        System.out.println("5.Orignal text: " + myFiveExample + ", Reversed text: " + result5);
//        6.
        String text1 = "arbuz";
        String text2 = "burza";
        if (checkAnagram(text1, text2)) {
            System.out.println("6.Texts: " + text1 + " and " + text2 + " are Anagrams");
        } else {
            System.out.println("6.Texts: " + text1 + " and " + text2 + " aren't  Anagrams");
        }


//7.-metodę "checkPalindrome", która przyjmie dwa teksty i zwróci prawda lub fałsz w zależności czy oba wyrazy są swoimi palindromami
        String word1 = "ara";
        String word2 = "noob";
        if (checkPalindrome(word1, word2)) {
            System.out.println("7.Both are Palindrome");
        } else {
            System.out.println("7.One of them is a Palindrome || None of them are Palindromes");

        }
        //    8.metodę "factorial", która przyjmie liczbę i zwróci jej silnię:
        int factoriall = 4;
        int result6 = factiorial(factoriall);
        System.out.println("8.Factorial(" + factoriall + ") = " + result6);

//        9.metodę "fibonacci", która przyjmie liczbę n i zwróci n-tą liczbę ciągu liczb Fibonacciego
        int n = 4;
        System.out.println("9.F(" + n + ") = " + fibonacci(n));
    }


    private static int divideByTwo(int num) {
        return num / 2;
    }

    private static int divide(int x, int y) {
        return x / y;
    }

    private static int checkLenght(String text) {
        return text.length();
    }

    private static void validateLenght(String text) throws TextTooLongException, TextTooShortException {
        int textLenght = checkLenght(text);
        if (textLenght > 10) {
            throw new TextTooLongException("Text is too long");
        } else if (textLenght < 4) {
            throw new TextTooShortException("Text is too short");
        }
    }

    private static String reverse(String example) {
        StringBuilder reversed = new StringBuilder(example);
        return reversed.reverse().toString();
    }

    private static boolean checkAnagram(String text1, String text2) {
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

    //        private static boolean checkPalindrome(String text1, String text2) {
//        if (text1)
//        return
//        }
    private static boolean checkPalindrome(String text1, String text2) {
        String combined = text1 + text2;
        int lenght = combined.length();
        for (int i = 0; i < lenght / 2; i++) {
            if (combined.charAt(i) != combined.charAt(lenght - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    private static int factiorial(int n) {
        int obj = 1;
        for (int i = 1; i <= n; i++) {
            obj *= i;
        }
        return obj;

    }

    private static int fibonacci(int n) {
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

class TextTooLongException extends Exception {
    public TextTooLongException(String text) {
        super(text);

    }
}

class TextTooShortException extends Exception {
    public TextTooShortException(String text) {
        super(text);
    }
}

