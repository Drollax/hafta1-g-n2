package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(504));
        System.out.println(isPerfectNumber(35));
        System.out.println(numberToWords(1010));
    }

    public static boolean isPalindrome(int num){

        String str = Integer.toString(num);
        if (str.contains("-")){
            str = str.replace("-", "");
        }

        String[] arr = str.split("");

        String[] reversed = new String[arr.length];

        for (int i = 0; i < arr.length; i++){
            reversed[i] = arr[arr.length-1-i];
        }

        if(Arrays.equals(arr,reversed)){
            return true;
        }

        return false;
    }

    public static boolean isPerfectNumber(int num){
   int temp = 0;

    if (num <= 0) {
        return false;
    } else {
        for (int i = 1; i < num; i++){
            if (num % i == 0)
            {
                temp = temp + i;
            }
        }

        if(temp == num){
            return true;
        }
    }


        return false;
    }
    public static String numberToWords(int num){
        if (num < 0){
            return "Invalid Value";
        }

        String str = Integer.toString(num);
        String wordedNumbers = "";

        for (int i = 0; i < str.length() ; i++ ){
            char digit = str.charAt(i);

            switch (digit){
                case '0':
                    wordedNumbers += " Zero";
                    break;
                case '1':
                    wordedNumbers += " One";
                    break;
                case '2':
                    wordedNumbers += " Two";
                    break;
                case '3':
                    wordedNumbers += " Three";
                    break;
                case '4':
                    wordedNumbers += " Four";
                    break;
                case '5':
                    wordedNumbers += " Five";
                    break;
                case '6':
                    wordedNumbers += " Six";
                    break;
                case '7':
                    wordedNumbers += " Seven";
                    break;
                case '8':
                    wordedNumbers += " Eight";
                    break;
                case '9':
                    wordedNumbers += " Nine";
                    break;
            }
        }


        return wordedNumbers.trim();
    }
}
