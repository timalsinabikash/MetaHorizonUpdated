package com.meta.java.stringMethodHw;

import java.util.Locale;
import java.util.Scanner;

public class MethodHolder {
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
        String[] specialCharactersArray = new String[specialCharacters.length()];


        for (int i = 0; i < specialCharacters.length(); i++) {
            specialCharactersArray[i] = specialCharacters.substring(i, i + 1);
        }
        for (int i = 0; i < input.length(); i++) {
            userInput[i] = input.substring(i, i + 1);
        }


        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < specialCharacters.length(); j++) {
                if (!userInput[i].contains(specialCharactersArray[j])) {
                    trimmed = trimmed + userInput[i];

                }
            }
        }

        System.out.println(trimmed);
    }

}










































