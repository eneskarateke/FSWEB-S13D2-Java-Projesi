
package com.workintech.main;


public class Main {

    static boolean isPalindrome(int num1){
        num1 = Math.abs(num1);

        char[] digits = String.valueOf(num1).toCharArray();

        String reversed = "";

        for(int i=digits.length-1; i >=0; i--) {
            reversed += digits[i];
        }

        return Integer.parseInt(reversed) == num1;
    };

    //İkinci çözüm:
    static boolean isPalindromeSecond(int num1){
        num1 = Math.abs(num1);
        int originalNum = num1;
        int reversedNumber = 0;

        while (num1>0) {
            int digit = num1 % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num1 = num1 / 10;

        }
        return originalNum == reversedNumber;
    };


    static boolean isPerfectNumber(int num) {
if (num <= 0) {
    return false;
}
int sum = 0;
for (int i = 1; i<= num/2; i++) {
    if (num%i == 0) {
        sum +=i;
    }
}
return num == sum;
    };



    static String numberToWords(int num) {

        if (num < 0) {
            return "Invalid Value";
        }

        String text = "";

        char[] numArray = String.valueOf(num).toCharArray();
        for (char digit:numArray) {
            switch (digit) {
                case '0':
                    text += "Zero ";
                    break;
                case '1':
                    text += "One ";
                    break;

                case '2':
                    text += "Two ";
                    break;

                case '3':
                    text += "Three ";
                    break;

                case '4':
                    text += "Four ";
                    break;

                case '5':
                    text += "Five ";
                    break;

                case '6':
                    text += "Six ";
                    break;

                case '7':
                    text += "Seven ";
                    break;

                case '8':
                    text += "Eight ";
                    break;

                case '9':
                    text += "Nine ";
                    break;


            }
        }
        return text.trim();


    };

//Etütten ekstra örnekler
    public static int getEventDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            num = num / 10;
        }
        return sum;
    }

    public static int getFirstDigitAndLastDigit(int num) {
        int lastDigit = num % 10;
        char[] numChars = String.valueOf(num).toCharArray();
//        double x = 3.5;
//        int y = 9;
//        y = x;
        Integer.parseInt(String.valueOf(num).substring(0, 1));
        return lastDigit + Integer.parseInt(String.valueOf(numChars[0]));

        //1234
    }

    // 12, 23, 32
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        int first = num1 % 10;
        int second = num2 % 10;
        int third = num3 % 10;

        return (first == second ||
                first == third ||
                second == third);
    }

    public static boolean hasSameLastDigitOptional(int ...nums){
        int[] digits = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            digits[i] = nums[i] % 10;
        }

        // Finding same elements in array
        // [1, 2, 3, 4, 1] =>
        // [1, 2, 3, 4, 1]

        for(int i = 0; i < digits.length; i++){
            for(int j = i + 1; j < digits.length; j++){
                if(digits[i] == digits[j]){
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println("isPalindrome(-1221) --> " + isPalindrome(-1221));
        System.out.println("isPalindrome(707) --> " + isPalindrome(707));
        System.out.println("isPalindrome(11212) --> " + isPalindrome(11212));

        System.out.println("isPalindromeSecond(-1221) --> " + isPalindromeSecond(-1221));
        System.out.println("isPalindromeSecond(707) --> " + isPalindromeSecond(707));
        System.out.println("isPalindromeSecond(11212) --> " + isPalindromeSecond(11212));

        System.out.println("isPerfectNumber(6) --> " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28) --> " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5) --> " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1) --> " + isPerfectNumber(-1));


        System.out.println("numberToWords(231) --> " + numberToWords(231));
        System.out.println("numberToWords(532) --> " + numberToWords(532));
        System.out.println("numberToWords(123) --> " + numberToWords(123));

//        Etüt örnek
        System.out.println("getEventDigitSum------------------------");
        System.out.println(getEventDigitSum(123456789));
        System.out.println(getEventDigitSum(123));
        System.out.println(getEventDigitSum(4));

        System.out.println("hasSameLastDigitOptional------------------------");
        System.out.println(hasSameLastDigitOptional(12, 132, 20, 45));
        System.out.println(hasSameLastDigitOptional(1, 12, 3));
        System.out.println(hasSameLastDigitOptional(10, 19, 35, 99));
    }
}