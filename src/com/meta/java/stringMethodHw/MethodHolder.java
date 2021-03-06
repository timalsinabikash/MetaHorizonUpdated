package com.meta.java.stringMethodHw;

import java.util.Locale;
import java.util.Scanner;

public class  MethodHolder {
    public static void main(String[] args) {

    }


    //Write a program to convert the Uppercase to lowercase using the inbuilt function.
    public static void upperCaseToLowerCase() {
        System.out.println("  ");
        System.out.println("Please enter a string with UpperCase in it:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String changed = input.toUpperCase(Locale.ROOT);

        System.out.println("The string is: " + changed);
        System.out.println("  ");
    }


    //Write a program to convert Lowercase to Uppercase using the inbuilt function.

    public static void lowerCaseToUpperCase() {
        System.out.println(" ");
        System.out.println("Please enter a string with lowerCase in it:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String changed = input.toLowerCase(Locale.ROOT);

        System.out.println("The string is: " + changed);
        System.out.println(" ");
    }


    /*
       Write a program to convert the Uppercase to lowercase
       without using the inbuilt function.*/
    public static void upperCaseToLowerCaseNoFunction() {
        System.out.println(" ");
        System.out.println("Please enter a string with Uppercase in it:");
        Scanner sc = new Scanner(System.in);
        String changed = "";
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            int charAscii = input.charAt(i);
            charAscii = charAscii + 32;
            changed = changed + (char) charAscii;
        }

        System.out.println(changed);
        System.out.println(" ");

    }



    /*Write a program to convert the Lowercase to Uppercase without
    using the inbuilt function.
     */

    public static void lowerCaseToUpperCaseNoFunction() {
        System.out.println(" ");

        System.out.println("Please enter a string with lowercase in it:");
        Scanner sc = new Scanner(System.in);
        String changed = "";
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            int charAscii = input.charAt(i);
            charAscii = charAscii - 32;
            changed = changed + (char) charAscii;
        }

        System.out.println(changed);
        System.out.println(" ");

    }


    /*Write a program to convert alternative letters in uppercase*/


    public static void alternativeLetterstoUpperCase() {

        System.out.println(" ");
        System.out.println("Please enter a string with alternative in it:");
        Scanner sc = new Scanner(System.in);
        String changed = "";
        String input = sc.nextLine();
        String[] array = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            array[i] = input.substring(i, i + 1);
            changed = changed + array[i].toUpperCase(Locale.ROOT);
        }

        System.out.println(changed);
        System.out.println(" ");

    }


    /*Write a program to capitalize the first letter of every word in a string.*/


    public static void capitalizeFirstLetterString() {
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string :");


        String input = sc.nextLine();
        String firstLetter = "";
        String remainingLetters = "";
        String changed = "";

        firstLetter = input.substring(0, 1);
        remainingLetters = input.substring(1, input.length());
        changed = firstLetter.toUpperCase(Locale.ROOT);
        changed = changed + remainingLetters;

        System.out.println(changed);
        System.out.println(" ");


    }
    /*Write a program to capitalize on the first and last letter of every word in a string.*/


    public static void capitalizeFirstAndLastLetterString() {
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string :");


        String input = sc.nextLine();
        String firstLetter = "";
        String remainingLetters = "";
        String lastLetter = "";
        String changed = "";
        String lastLetterChanged = "";

        firstLetter = input.substring(0, 1);
        remainingLetters = input.substring(1, input.length() - 1);
        lastLetter = input.substring(input.length() - 1);
        changed = firstLetter.toUpperCase(Locale.ROOT);
        lastLetterChanged = lastLetter.toUpperCase(Locale.ROOT);
        changed = changed + remainingLetters + lastLetterChanged;


        System.out.println(changed);
        System.out.println(" ");


    }


    /*Write a program to check whether two strings are equal or not. */

    public static void twoStringEqualsOrNot() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 1st string :");


        String input = sc.nextLine();
        System.out.println("Please enter a 2nd string :");
        String secondInput = sc.nextLine();
        if (input.equals(secondInput)) {
            System.out.println("They are equal.");
        } else {
            System.out.println("They are not equal.");
        }
        System.out.println(" ");
    }

    /*Write a program to list vowels in a string*/
    public static void containsVowels() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to get vowels:");
        String input = sc.nextLine();
        String[] vowels = new String[5];
        String vowel = "aeiou";
        String defaultValue = "";
        String[] userInput = new String[input.length()];
        for (int i = 0; i < vowels.length; i++) {
            vowels[i] = vowel.substring(i, i + 1);

        }
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);

        }
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (userInput[i].equals(vowels[j])) {

                    defaultValue = defaultValue + userInput[i];

                }
            }

        }
        System.out.println("The vowels in entered strings are:" + defaultValue);


        System.out.println(" ");

    }

    /*Write a program to count how many vowels present in a string. */
    public static void vowelsCounter() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to get vowel count:");
        String input = sc.nextLine();
        String vowel = "aeiou";
        String[] vowels = new String[vowel.length()];

        int counter = 0;
        String[] userInput = new String[input.length()];
        for (int i = 0; i < vowels.length; i++) {
            vowels[i] = vowel.substring(i, i + 1);

        }
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);

        }
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (userInput[i].equals(vowels[j])) {

                    counter++;

                }
            }

        }
        System.out.println("The total number of vowels present are:" + counter);


        System.out.println(" ");

    }


    /*Write a program to reverse a string */

    public static void reverseString() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to reverse:");
        String input = sc.nextLine();
        String[] userInput = new String[input.length()];

        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);

        }
        for (int i = userInput.length - 1; i >= 0; i--) {
            reversed = reversed + userInput[i];

        }
        System.out.println(reversed);
        System.out.println(" ");


    }

    /*Write a program to list consonants in a string*/
    public static void listConsonantsOnString() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to get the list of consonants in it:");
        String input = sc.nextLine();
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String[] consonantsArray = new String[consonants.length()];
        String defaultValue = " ";

        String[] userInput = new String[input.length()];
        for (int i = 0; i < consonantsArray.length; i++) {
            consonantsArray[i] = consonants.substring(i, i + 1);

        }
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < consonantsArray.length; j++) {
                if (userInput[i].equals(consonantsArray[j])) {

                    defaultValue = defaultValue + userInput[i];

                }
            }

        }
        if (defaultValue.equals(" ")) {
            System.out.println("There aren't any consonants in the entered string");
        } else
            System.out.println("The list of consonants present in the entered string are:" + defaultValue);

        System.out.println("  ");

    }
    /*Write a program to count how many consonants present in a string. */


    public static void countConsonantsOnString() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to get the list of consonants in it:");
        String input = sc.nextLine();
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String[] consonantsArray = new String[consonants.length()];
        int counter = 0;

        String[] userInput = new String[input.length()];
        for (int i = 0; i < consonantsArray.length; i++) {
            consonantsArray[i] = consonants.substring(i, i + 1);

        }
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < consonantsArray.length; j++) {
                if (userInput[i].equals(consonantsArray[j])) {

                    counter++;

                }
            }

        }

        System.out.println("The number of consonants in the entered string is:" + counter);

        System.out.println("  ");
    }


    /*Write a program to count the numbers of the word in a string*/


    public static void countWordsOnString() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence to count the number of words in it:");
        String input = sc.nextLine();
        int counter = 1;
        String[] splittedArray = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            splittedArray[i] = input.substring(i, i + 1);
            if(splittedArray[i].equals(" ")){
                counter++;
            }
        }
        System.out.println("The numbers of word present in the entered sentence is:"+counter);
        System.out.println("  ");



    }
    /*Write a program to count the number of white spaces in a sentence.*/
    public static void countWhiteSpacesOnString() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence to count the number of white spaces in it:");
        String input = sc.nextLine();
        int counter = 0;
        String[] splittedArray = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            splittedArray[i] = input.substring(i, i + 1);
            if(splittedArray[i].equals(" ")){
                counter++;
            }
        }
        System.out.println("The numbers of white spaces present in the entered sentence is:"+counter);
        System.out.println("  ");



    }

    /*Write a program to count the number of white spaces in a sentence.*/

    public static void palindromeChecker() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to reverse:");
        String input = sc.nextLine();
        String[] userInput = new String[input.length()];

        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);

        }
        for (int i = userInput.length - 1; i >= 0; i--) {
            reversed = reversed + userInput[i];

        }
        if (input.equalsIgnoreCase(reversed)){
            System.out.println("The entered word is palindrome.");
        }else {
            System.out.println("The entered word is not palindrome.");
        }

        System.out.println(" ");

    }

    /*Write a program to count the number of vowels, consonants, numbers, and special characters present in a string.
     */

    public static void VowelsConsNumSpecChecker() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to check vowels,consonants, numbers, and special characters:");
        String input = sc.nextLine();
        String[] userInput = new String[input.length()];
        String vowels="aeiou";
        int vowelsCounter = 0;
        String[] vowelsArray = new String[vowels.length()];
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int consonantsCounter = 0;
        String[] consonantsArray = new String[consonants.length()];
        String numbers= "0123456789";
        int numbersCounter = 0;
        String[] numbersArray= new String[10];
        String specialCharacters= "`~!@#$%^&*()_+-'.,/?><:;|";
        int specialCharactersCounter = 0;
        String[] specialCharactersArray = new String[specialCharacters.length()];

        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
        }
        for (int i = 0; i < vowels.length(); i++) {
            vowelsArray[i] = vowels.substring(i, i + 1);
        }
        for (int i = 0; i < consonants.length(); i++) {
            consonantsArray[i] = consonants.substring(i, i + 1);
        }
        for (int i = 0; i < numbers.length(); i++) {
            numbersArray[i] = numbers.substring(i, i + 1);
        }
        for (int i = 0; i < specialCharacters.length(); i++) {
            specialCharactersArray[i] = specialCharacters.substring(i, i + 1);
        }
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < consonantsArray.length; j++) {
                if (userInput[i].equals(consonantsArray[j])) {
                    consonantsCounter++;

                }
            }
            for (int j = 0; j < vowelsArray.length; j++) {
                if (userInput[i].equals(vowelsArray[j])) {
                    vowelsCounter++;

                }
            }
            for (int j = 0; j < numbersArray.length; j++) {
                if (userInput[i].equals(numbersArray[j])) {
                    numbersCounter++;

                }
            }
            for (int j = 0; j < specialCharactersArray.length; j++) {
                if (userInput[i].equals(specialCharactersArray[j])) {
                    specialCharactersCounter++;

                }
            }

        }
        System.out.println("The numbers of vowels present in the entered sentence is:"+vowelsCounter);
        System.out.println(" ");
        System.out.println("The numbers of consonants present in the entered sentence is:"+consonantsCounter);
        System.out.println(" ");
        System.out.println("The numbers of numbers  present in the entered sentence is:"+numbersCounter);
        System.out.println(" ");
        System.out.println("The numbers of special characters  present in the entered sentence is:"+specialCharactersCounter);


    }

    /*Write a program to count repeated characters in a string.*/
    public static void repeatedCharacters() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to check repeatition:");
        String input = sc.nextLine();
        String[] userInput = new String[input.length()];

        int counter = 0;
        int insideCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
        }

        for (int i =0; i<userInput.length;i++){
            for (int j =0; j<userInput.length;j++){
                if (userInput[i].equals(userInput[j])){
                    insideCounter++;
                    if (insideCounter>1){
                        counter++;
                        break;
                    }
                }


            }
            insideCounter=0;

        }
        System.out.println(counter/2);
    }
    /*Write a program to find the frequency of characters in a string.
     */

    public static void frequencyOfCharacters() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to check frequency:");
        String input = sc.nextLine();
        System.out.println("Please type a letter to check the frequency:");
        String frequency = sc.nextLine();
        String[] userInput = new String[input.length()];

        int counter = 0;
        int insideCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
        }

        for (int i =0; i<userInput.length;i++){
            if(userInput[i].equals(frequency)){
                counter++;
            }


        }
        System.out.println(counter);
        System.out.println(" ");
    }
    /*Write a program to concatenate two strings.
     */

    public static void concatenateStrings() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 1st string :");
        String input = sc.nextLine();
        System.out.println("Please enter a 2nd string: ");
        String input2 = sc.nextLine();
        String concatenated= input+input2;

        System.out.println(concatenated);
        System.out.println(" ");
    }


    /*Write a program to find the first capital letter in a given string.*/

    public static void firstCapitaLetterString() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string with capital letter:");
        String input = sc.nextLine();
        String[] userInput = new String[input.length()];
        String [] lowerCaseArray= new String[userInput.length];
        String lowerCase= input.toLowerCase(Locale.ROOT);

            for (int i = 0; i < input.length(); i++) {
                userInput[i] = input.substring(i, i + 1);
                lowerCaseArray[i]=lowerCase.substring(i, i+1);
            }
        for (int i = 0; i < input.length(); i++) {
            if(!userInput[i].equals(lowerCaseArray[i])){
                System.out.println("The first capital letter is:"+userInput[i]);
                break;
            }
        }

        System.out.println("  ");


    }


/*Write a program to find the first small letter in a given string.
 */

    public static void firstSmallLetterString() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string with capital letter:");
        String input = sc.nextLine();
        String[] userInput = new String[input.length()];
        String [] lowerCaseArray= new String[userInput.length];
        String lowerCase= input.toUpperCase(Locale.ROOT);

        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
            lowerCaseArray[i]=lowerCase.substring(i, i+1);
        }
        for (int i = 0; i < input.length(); i++) {
            if(!userInput[i].equals(lowerCaseArray[i])){
                System.out.println("The first small letter is:"+userInput[i]);
                break;
            }
        }
        System.out.println("  ");




    }


    /*Write a program to sort names in alphabetical order.*/


    public static void alphabeticalOrders() {




    }


    /*Write a program to print the Ascii value of character in a String.
     */

    public static void asciiValueString() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = sc.nextLine();
        char [] charArray= input.toCharArray();
        System.out.println("The Char value of the string are:");

        for (int i = 0; i < input.length(); i++) {



            System.out.println(charArray[i]+" = "+(int) input.charAt(i));

        }

        System.out.println(" ");

    }
    /*Write a program to check String Anagrams or Not.
    */

    public static void anagramsChecker() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 1st  string:");
        String input = sc.nextLine();
        String[] userInput= new String[input.length()];
        System.out.println("Please enter a Anagrams string:");
        String checkInput  = sc.nextLine();
        String[] checkInputArray= new String[input.length()];
        int checker= 0;

        if (input.length()==checkInput.length()) {

            for (int i = 0; i < input.length(); i++) {
                userInput[i] = input.substring(i, i + 1);
                checkInputArray[i] = checkInput.substring(i, i + 1);


            }
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < input.length(); j++)
                if (userInput[i].contains(checkInputArray[j])) {
                    checker++;
                }
            }




        }
        if (checker==input.length()){
            System.out.println("They are Anagrams");
        } else {
            System.out.println("They are not Anagrams.");
        }

        System.out.println(" ");

    }

    /*Write a program to check whether string 1 match string 2.
     */


    public static void stringMatchChecker() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 1st  string:");
        String input = sc.nextLine();
        System.out.println("Please enter 2nd string:");
        String checkInput  = sc.nextLine();


        if (input.equalsIgnoreCase(checkInput)){
            System.out.println("They match");
        } else {
            System.out.println("They do not match.");
        }

        System.out.println(" ");

    }

    /*Write a program to remove all uppercase characters in the string.
    */




    public static void removeUpperCase() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to remove uppercase character:");
        String input = sc.nextLine();
        String[] userInput = new String[input.length()];
        String[] lowerCaseArray = new String[userInput.length];
        String lowerCase = input.toLowerCase(Locale.ROOT);
        String trimmed = "";

        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
            lowerCaseArray[i] = lowerCase.substring(i, i + 1);
        }
        for (int i = 0; i < input.length(); i++) {
            if (userInput[i].equals(lowerCaseArray[i])) {
                trimmed = trimmed + userInput[i];
            }
        }

        System.out.println(trimmed);
        System.out.println("  ");
    }


    /*Write a program to remove all lowercase characters in the string.
     */


    public static void removeLowerCase() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to remove lowercase character:");
        String input = sc.nextLine();
        String[] userInput = new String[input.length()];
        String[] uppperCaseArray = new String[userInput.length];
        String upperCase = input.toUpperCase(Locale.ROOT);
        String trimmed = "";

        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
            uppperCaseArray[i] = upperCase.substring(i, i + 1);
        }
        for (int i = 0; i < input.length(); i++) {
            if (userInput[i].equals(uppperCaseArray[i])) {
                trimmed = trimmed + userInput[i];
            }
        }

        System.out.println(trimmed);
        System.out.println("  ");


    }


    /* Write a program to remove all special characters in the string.*/


    public static void removeSpecialCharacters() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string with special characters:");
        String input = sc.nextLine();
        String[] userInput = new String[input.length()];
        String specialCharacters = "`~!@#$%^&*()_+-'.,/?><:;|";
        String trimmed = "";

        boolean passed = false;
        String[] specialCharactersArray = new String[specialCharacters.length()];


        for (int i = 0; i < specialCharacters.length(); i++) {
            specialCharactersArray[i] = specialCharacters.substring(i, i + 1);
        }
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
        }


        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < specialCharacters.length(); j++) {
                if (userInput[i].contains(specialCharactersArray[j])) {
                    passed = true;

                    break;

                }
            }
            if (!passed) {
                trimmed = trimmed + userInput[i];
            } else
                passed = false;

        }

        System.out.println(trimmed);
    }

        /*Write a program to remove all numbers in the string.*/
    public static void removeNumbers() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string with Numbers:");
        String input = sc.nextLine();
        String[] userInput = new String[input.length()];
        String numbers = "0123456789";
        String trimmed = "";
        boolean passed = false;
        String[] numbersArray = new String[numbers.length()];


        for (int i = 0; i < numbers.length(); i++) {
            numbersArray[i] = numbers.substring(i, i + 1);
        }
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
        }


        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < numbers.length(); j++) {
                if (userInput[i].contains(numbersArray[j])) {
                   passed = true;
                   break;

                }
            }
            if (!passed) {
                trimmed = trimmed + userInput[i];
            } else
                passed = false;
        }

        System.out.println(trimmed);

    }




/*Write a Program to check if a string contains a given substring.
* */

    public static void checkSubstring() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string :");
        String input = sc.nextLine();
        System.out.println("Please enter a substring:");
        String subString = sc.nextLine();

        if(input.contains(subString)){
            System.out.println("The string contains the substring.");
        } else
            System.out.println("The string doesn't contains the substring.");

        System.out.println("   ");
    }
//    Write a Program to Find the Shortest palindromic substring in a string.

    public static void shortPalindromeChecker() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a palindromes separated by spaces:");
        String input = sc.nextLine();
        String[] userInput = input.split("\\s");//new String[input.length()];
        String finalString = "";

        int counter = 0;


        for (int i = 0; i < userInput.length; i++) {
            String reversed = "";
            String temp = "";
            temp = userInput[i];
            String firstString = userInput[0];


            String[] tempArray = new String[temp.length()];
            for (int j = 0; j < tempArray.length; j++) {
                tempArray[j] = temp.substring(j, j + 1);
            }
            for (int k = tempArray.length - 1; k >= 0; k--) {
                reversed = reversed + tempArray[k];

            }
            if (temp.equalsIgnoreCase(reversed)) {
                if (counter == 0) {
                    finalString = firstString;
                    counter++;
                } else if (temp.length() < finalString.length()) {
                    finalString = temp;
                }


            } else {
                finalString = "No palindromes entered";
            }


        }
        if (finalString.contains(" ")) {
            System.out.println(finalString);
        } else{
            System.out.println("The shortest palindrome is: " + finalString);
    }
        System.out.println(" ");

    }
/*Write a Program to Find the Longest palindromic substring in a string.*/

    public static void longestPalindromeChecker() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a palindromes separated by spaces:");
        String input = sc.nextLine();
        String[] userInput = input.split("\\s");//new String[input.length()];
        String finalString = "";

        int counter = 0;


        for (int i = 0; i < userInput.length; i++) {
            String reversed = "";
            String temp = "";
            temp = userInput[i];
            String firstString = userInput[0];


            String[] tempArray = new String[temp.length()];
            for (int j = 0; j < tempArray.length; j++) {
                tempArray[j] = temp.substring(j, j + 1);
            }
            for (int k = tempArray.length - 1; k >= 0; k--) {
                reversed = reversed + tempArray[k];

            }
            if (temp.equalsIgnoreCase(reversed)) {
                if (counter == 0) {
                    finalString = firstString;
                    counter++;
                } else if (temp.length() > finalString.length()) {
                    finalString = temp;
                }


            } else {
                finalString = "No palindromes entered";
            }


        }
        if (finalString.contains(" ")) {
            System.out.println(finalString);
        } else{
            System.out.println("The longest palindrome is: " + finalString);
        }
        System.out.println(" ");

    }
/*Write a program to Find the shortest word in a string.*/

    public static void shortestWordChecker() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String input = sc.nextLine();
        String[] userInput = input.split("\\s");//new String[input.length()];
        String finalString = "";

        int counter = 0;


        for (int i = 0; i < userInput.length; i++) {
            String reversed = "";
            String temp = "";
            temp = userInput[i];
            String firstString = userInput[0];



                if (counter == 0) {
                    finalString = firstString;
                    counter++;
                } else if (temp.length() < finalString.length()) {
                    finalString = temp;
                }



        }

            System.out.println("The shortest word is: " + finalString);

        System.out.println(" ");

    }

    /*Write a program to Find the Longest word in a string.
     */



    public static void longestWordChecker() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String input = sc.nextLine();
        String[] userInput = input.split("\\s");//new String[input.length()];
        String finalString = "";

        int counter = 0;


        for (int i = 0; i < userInput.length; i++) {

            String temp = "";
            temp = userInput[i];
            String firstString = userInput[0];



            if (counter == 0) {
                finalString = firstString;
                counter++;
            } else if (temp.length() > finalString.length()) {
                finalString = temp;
            }



        }

            System.out.println("The longest word is: " + finalString);

        System.out.println(" ");

    }

/*Write a Program to Find words ending with given characters(suffix).*/
    public static void suffixChecker() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = sc.nextLine();
        System.out.println("Please enter a suffix to check:");
        String suffix = sc.nextLine();
        String[] userInput = input.split("\\s");//new String[input.length()];

        int counter =0;


        System.out.println("The words that ends with "+ suffix+" are: ");


        for (int i = 0; i < userInput.length; i++) {

            String temp = "";
            temp = userInput[i];



            if (temp.endsWith(suffix)){
                    System.out.print(temp);
                    System.out.print(" ");
                    counter++;

            }

        }if (counter==0) {
            System.out.print("none");
        }



        System.out.println(" ");

    }


    /*Write a Program to Find words starting with given characters(prefix).*/
    public static void prefixChecker() {
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = sc.nextLine();
        System.out.println("Please enter a prefix to check:");
        String prefix = sc.nextLine();
        String[] userInput = input.split("\\s");//new String[input.length()];

        int counter =0;


        System.out.println("The words that starts with "+ prefix+" are: ");


        for (int i = 0; i < userInput.length; i++) {

            String temp = "";
            temp = userInput[i];



            if (temp.startsWith(prefix)){
                System.out.print(temp);
                System.out.print(" ");
                counter++;

            }

        }if (counter==0) {
            System.out.print("none");
        }



        System.out.println(" ");

    }

/* Write a Program to Check if a string contains only digits or not.*/
    public static  void digitChecker() {
        Scanner sc = new Scanner(System.in);
        String numbers = "0123456789";

        String[] numbersArray = new String[10];
        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] userInputArray = new String[userInput.length()];
        boolean result = false;


        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = numbers.substring(i, i + 1);
        }
        for (int i = 0; i < userInputArray.length; i++) {
            userInputArray[i] = userInput.substring(i, i + 1);
        }

        for (int i = 0; i < userInput.length(); i++) {
            result= false;
            for (int j = 0; j < numbers.length(); j++) {
                if (numbersArray[j].contains(userInputArray[i])) {
                    result=true;
                }

            }
            if(!result){
                break;
            }
        }

        if (result){
            System.out.println("They only contains digits.");
        } else {
            System.out.println("They donot contain only digits.");
        }

        System.out.println(" ");
    }


    /*Write a Program to Check if a string contains at least one Number or Not.
     */

    public static  void atleastOneNumberChecker() {
        Scanner sc = new Scanner(System.in);
        String numbers = "0123456789";
        int numbersCounter = 0;
        String[] numbersArray = new String[10];
        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] userInputArray = new String[userInput.length()];
        boolean result = false;


        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = numbers.substring(i, i + 1);
        }
        for (int i = 0; i < userInputArray.length; i++) {
            userInputArray[i] = userInput.substring(i, i + 1);
        }

        for (int i = 0; i < userInput.length(); i++) {

            for (int j = 0; j < numbers.length(); j++) {
                if (numbersArray[j].contains(userInputArray[i])) {
                    result=true;
                }

            }
            if(result){
                break;
            }
        }

        if (result){
            System.out.println("The string at least contains one number.");
        } else {
            System.out.println("The string doesn't contain any numbers.");
        }
        System.out.println(" ");
    }

    /*write a program to print every character of a string twice.*/
    public static  void twiceCharacterPrinter() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] userInputArray = new String[userInput.length()];

        for (int i = 0; i < userInputArray.length; i++) {
            userInputArray[i] = userInput.substring(i, i + 1);
        }

        for (int i = 0; i < userInput.length(); i++) {
            for (int j=2; j>=1; j--){
                System.out.print(userInputArray[i]);
            }

        }


    }

/*Write a Program to Find the lexicographic rank of a given string.*/

    public static  void lexicographicRank() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] lexicographicArray = new String[userInput.length()];
        int result =0;
        for (int i =0; i<lexicographicArray.length; i++){

            lexicographicArray[i]=userInput.substring(i,i+1);
            String s = lexicographicArray[i];
            char temp= userInput.charAt(i);
            int temp2 = (temp);
            System.out.println("The lexicographic rank of "+lexicographicArray[i]+" is: "+temp2);
        }

        }

    /*Write a Program to Find the maximum occurring character in a given string.
.*/

    public static  void maximumOccuringCharacter() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] userInputArray = new String[userInput.length()];
        int counter=0;
        String maximum = "";
        int breaker= 0;
        for (int i =0; i<userInputArray.length; i++){

           userInputArray[i]=userInput.substring(i,i+1);

        }
        for (int i =0; i<userInputArray.length; i++){
            String temp= userInputArray[i];
            for (int j =0; j<userInputArray.length;j++) {
                if (temp.equals(userInputArray[j])) {
                    counter++;
                }
            }
            if (counter==1){
                counter=0;
            }else if(breaker==0){
                maximum=userInputArray[i];
                breaker= counter;
                counter=0;
            }else if(breaker<counter){
                maximum=userInputArray[i];
                breaker= counter;
                counter=0;
            }
        }
        System.out.println("The maximum repeated character is "+maximum);
        System.out.println(" ");

    }
     /*Write a Program to Find the minimum occurring character in a given string.
.*/

    public static  void minimumOccuringCharacter() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] userInputArray = new String[userInput.length()];
        int counter=0;
        String minimum = "";
        int breaker= 0;
        for (int i =0; i<userInputArray.length; i++){

            userInputArray[i]=userInput.substring(i,i+1);

        }
        for (int i =0; i<userInputArray.length; i++){
            String temp= userInputArray[i];
            for (int j =0; j<userInputArray.length;j++) {
                if (temp.equals(userInputArray[j])) {
                    counter++;
                }
            }
            if (counter==1||breaker==0) {
                breaker=counter;
                counter = 0;
                minimum="";
                minimum = minimum + userInputArray[i];

            } else if(counter<breaker){
                breaker=counter;
                minimum="";
                minimum=minimum+userInputArray[i];
            }else if(counter==breaker){
                counter=0;
                if(minimum.contains(userInputArray[i])){
                    minimum="";
                    minimum=minimum+userInputArray[i];
                } else
                    minimum=minimum+userInputArray[i];


            }
            else

                counter=0;
        }
        System.out.println("The minimum repeated character is "+minimum);
        System.out.println(" ");

    }
    /*Write a Program to Remove duplicate characters from a given string.
     */
    public static  void duplicateCharacterRemover() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] userInputArray = new String[userInput.length()];
        int counter = 0;
        String characters = "";
        int breaker = 0;
        for (int i = 0; i < userInputArray.length; i++) {

            userInputArray[i] = userInput.substring(i, i + 1);

        }
        for (int i = 0; i < userInputArray.length; i++) {
            String temp = userInputArray[i];
            if(!characters.contains(temp)) {
                characters = characters + temp;
            }


        }
        System.out.println("Duplicate characters removed: " + characters);
        System.out.println(" ");
    }
    /*Write a Program to Reverse words in a given string.
     */


    public static void reverseWordsInAString() {
        System.out.println(" ");
        String reversed = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to reverse:");
        String input = sc.nextLine();
        if(input.contains("\\s")){
        String[] userInputWithSpace = input.split("\\s");
         for (int i = 0; i< userInputWithSpace.length;i++)
         {
             String temp = userInputWithSpace[i];
             String[] tempArray= new String[temp.length()];
            for (int j =0;j< tempArray.length;j++){
                tempArray[i]=temp.substring(j,j+1);
             }
             for (int j = tempArray.length - 1; j >= 0; j--) {
                 reversed = reversed + tempArray[i];

             }


         }


        }else {
            String[] userInputWithoutSpace = new String[input.length()];
            for (int i = 0; i < input.length(); i++) {
                userInputWithoutSpace[i] = input.substring(i, i + 1);

            }
            for (int i = userInputWithoutSpace.length - 1; i >= 0; i--) {
                reversed = reversed + userInputWithoutSpace[i];

            }
        }




        System.out.println(reversed);
        System.out.println(" ");


    }
    /*Write a Program to Remove duplicate words from a given string.
     */
    public static  void duplicateWordsRemover() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String duplicate = " ";

        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] userInputArray = userInput.split("\\s");

        String revised = "";
        System.out.print("Duplicate words removed: ");
        System.out.println(" ");
        int insideCounter = 0;


        for (int i = 0; i < userInputArray.length; i++) {
            String temp = userInputArray[i];
            String loweredTemp = temp.toLowerCase(Locale.ROOT);
            if (!revised.contains(loweredTemp)) {
                revised = revised + userInputArray[i] + " ";
            }


        }


        System.out.println(revised);
        System.out.println(" ");
  }




/*Write a Program to Find the first non-repeating character in a string.*/

    public static  void firstNonRepeatingCharacter() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String nonRepeating = " ";

        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] userInputArray = new String[userInput.length()];

        for (int i= 0; i<userInputArray.length;i++){
            userInputArray[i]=userInput.substring(i,i+1);
        }
        for (int i =0; i< userInputArray.length;i++){
            String temp = userInputArray[i];
            for (int j = 0; j< userInputArray.length; j++){
                if (temp.equals(userInputArray[j])){
                    counter++;
                }
            }
            if(counter==1){
               nonRepeating=userInputArray[i];
               break;
            } else if(counter>1){
                counter=0;

            }
        }






        System.out.println("the least used character is:"+nonRepeating);
        System.out.println(" ");
    }

    /*Write a Program to Find all non-repeated characters in a string..*/

    public static  void allnonRepeatingCharacter() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String nonRepeating = " ";

        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] userInputArray = new String[userInput.length()];

        for (int i= 0; i<userInputArray.length;i++){
            userInputArray[i]=userInput.substring(i,i+1);
        }
        for (int i =0; i< userInputArray.length;i++){
            String temp = userInputArray[i];
            for (int j = 0; j< userInputArray.length; j++){
                if (temp.equals(userInputArray[j])){
                    counter++;
                }
            }
            if(counter==1){
                counter=0;
                nonRepeating=nonRepeating+" "+userInputArray[i];
            } else if(counter>1){
                counter=0;

            }
        }






        System.out.println("the non repeating character/s is/are:"+nonRepeating);
        System.out.println(" ");
    }
//    Write a Program to Find the second most frequent character in a given string.


    public static  void secondMostRepeatingCharacter() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String result = " ";
        int breaker=0;
        int firstMost=0;
        int secondMost=0;
        int[] number = new int[100];

        System.out.println("Please enter a string:");
        String userInput = sc.nextLine();
        String[] userInputArray = new String[userInput.length()];
        String[] indexer= new String[userInputArray.length];


        for (int i= 0; i<userInputArray.length;i++){
            userInputArray[i]=userInput.substring(i,i+1);
        }
        for (int i =0; i< userInputArray.length;i++){
            String temp = userInputArray[i];
            for (int j = 0; j< userInputArray.length; j++){
                if (temp.equals(userInputArray[j])){
                    counter++;
                }
            }
            if (counter==1){
                counter=0;
            }else if(breaker==0){
               result =userInputArray[i];
                breaker= counter;
                firstMost=breaker;
                counter=0;
            }else if(breaker<counter){
                result=userInputArray[i];
                breaker= counter;
                firstMost=breaker;
                counter=0;
            }
        }
        System.out.println(breaker);






        System.out.println("the non repeating character/s is/are:"+result);
        System.out.println(" ");
    }

}






















































