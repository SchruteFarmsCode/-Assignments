package org.example;

import java.io.IOException;

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
            System.out.println(textToCheck + "--> Text is ok");
        } catch (TextTooLongException e) {
            System.out.println(textToCheck + " --> text is too long");
            e.getMessage();
//            e.printStackTrace();
        } catch (TextTooShortException e) {
            System.out.println(textToCheck + "  --> Text is too short");
            e.getMessage();
//            e.printStackTrace();
        }
        //    5.-metodę "reverse", która przyjmie tekst i zwróci tekst odwrócony (abc -> cba)
        String myFiveExample = "abc";
        String result5 = reverse(myFiveExample);
        System.out.println("5.Orignal text: " + myFiveExample + ", Reversed text: " + result5);


        //    6.FactorialLoop:
        int factoriall = 4;
        int result6 = factiorial(factoriall);
        System.out.println("Factorial of number: " + factoriall + " == " + result6);
//7.
//        String word1 = "baton";
//        String word2 = "noob";
//        if(checkPalindrome(word1, word2)) {
//            System.out.println("Both are Palindrome");
//        }else {
            System.out.println("One of them is a Palindrome");
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
    private  static String reverse(String example) {
        StringBuilder reversed = new StringBuilder(example);
        return reversed.reverse().toString();
        }
        private static boolean checkAnagram(boolean a) {
        return a;
        }
//        private static boolean checkPalindrome(String text1, String text2) {
//        if (text1)
//        return
//        }
//    private static boolean checkPalindrome(String text1, String text2) {
//        String myText1 = text1.replaceAll("\\s", "").toLowerCase();
//        String myText2 = text2.replaceAll("\\s", "").toLowerCase();
//        String reversedText2 = new StringBuilder(myText2).reverse().toString();
//        return myText1.equals(reversedText2);
//    }

    private static int factiorial(int n) {
        int obj = 1;
        for (int i = 1; i <= n; i++) {
            obj  *= i;
            }
        return obj;

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

