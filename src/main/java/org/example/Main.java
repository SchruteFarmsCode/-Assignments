package org.example;

//import java.io.IOException

public class Main {

    public static void main(String[] args) {
        Assigments assigments = new Assigments();
//        *1.metodę "divideByTwo", która przyjmie liczbę i zwróci ją podzieloną przez dwa
        try {
            int num = 0;
            double result = assigments.divideByTwo(num);
            System.out.println("1.The result of the number " + num + " devide by two: " + result);
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }

//        2.metodę "divide", która przyjmie dwie liczby i zwróci wynik ich dzielenia
        try {
            int a = 234;
            int b = 2;
            double resul2 = assigments.divide(a, b);
            System.out.println("2.The result of the number " + a + " devide by " + b + " : " + resul2);
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }

//        3.metodę "checkLenght", która przyjmie tekst i zwróci jego długość
        try {
            String words = "Is the autum?";
            int result3 = assigments.checkLength(words);
            System.out.println("3.The lenght of String: " + words + " : " + result3);
        }catch (IllegalAccessError e) {
            System.out.println("Occurred error: " + e.getMessage());
        }

//        4.używając powyżej metody napisz metodę "validateLenght", która przyjmie tekst i rzuci własnym wyjątkiem "TextTooLongException",
//        dla tekstu dłuższego niż 10 znaków, lub wyjątkiem "TextTooShortException" dla tekstu krótszego od 4 znaków.
        String textToCheck = "Monticolo";
        try {
            assigments.validateLength(textToCheck);
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
        try {
            String myFiveExample = "abc";
            String result5 = assigments.reverse(myFiveExample);
            System.out.println("5.Orignal text: " + myFiveExample + ", Reversed text: " + result5);
        }catch (IllegalArgumentException e){
            System.out.println("Error argument: " + e.getMessage());
        }
//        6.
        try {
            String text1 = "arbuz";
            String text2 = "burza";
            if (assigments.checkAnagram(text1, text2)) {
                System.out.println("6.Texts: " + text1 + " and " + text2 + " are Anagrams");
            } else {
                System.out.println("6.Texts: " + text1 + " and " + text2 + " aren't  Anagrams");
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Error argument: " + e.getMessage());
        }


//7.-metodę "checkPalindrome", która przyjmie dwa teksty i zwróci prawda lub fałsz w zależności czy oba wyrazy są swoimi palindromami
        String word1 = "ara";
        String word2 = "noob";
        if (assigments.checkPalindrome(word1, word2)) {
            System.out.println("7.Both are Palindrome");
        } else {
            System.out.println("7.One of them is a Palindrome || None of them are Palindromes");

        }
        //    8.metodę "factorial", która przyjmie liczbę i zwróci jej silnię:
        try {
            int factoriall = 4;
            int result6 = assigments.factorial(factoriall);
            System.out.println("8.Factorial(" + factoriall + ") = " + result6);
        }catch (IllegalArgumentException e) {
            System.out.println("Error argument: " + e.getMessage());
        }

//        9.metodę "fibonacci", która przyjmie liczbę n i zwróci n-tą liczbę ciągu liczb Fibonacciego
        try {
            int n = 4;
            System.out.println("9.F(" + n + ") = " + assigments.fibonacci(n));
        }catch (IllegalArgumentException e) {
            System.out.println("Error argument: " + e.getMessage());
        }

        }
    }






