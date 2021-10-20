package com.meta.java.classtask.collectionframework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class DataAnalysisClass {
    public static List<PaymentDetails> paymentDetailsList = new ArrayList<>();


    public static void main(String[] args) throws IOException {


      /*  Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the file name you want to read");

        String fileName = userInput.nextLine();*/


        File inputFile = new File(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "app.txt");


        DataAnalysisClass dataAnalysisClass = new DataAnalysisClass();


        if (inputFile.exists()) {


            System.out.println("We can proceed further"); // FileReader FileInputStream Scanner BufferedReader

            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            String line = "";

            while ((line = bufferedReader.readLine()) != null) {
                String[] splittedData = line.split(",");


                for (String d : splittedData) {
                    String[] subData = d.split(":");


                    String amountRelatedData = subData[0];

                    String dateRelatedData = subData[1];
                    String[] amtDataArray = amountRelatedData.split("/");
                    String checker = amtDataArray[0];
                    if (checker.equals("XXX")) {
                        continue;
                    }
                    String[] dateDataArray = dateRelatedData.split("/");
                    paymentDetailsList.add(new PaymentDetails(Double.parseDouble(amtDataArray[0]),
                            Integer.parseInt(amtDataArray[1]), dateDataArray[0], dateDataArray[1]));


                }

            }
            displayInfo();


        } else {

            System.out.println("File doesn't exist");

        }


    }

    public List<PaymentDetails> delayDateGreaterThanTen() {
        List<PaymentDetails> delayDateGreater = new ArrayList<>();


        for (PaymentDetails paymentDetails : paymentDetailsList) {


            //gets delaydate greater than 10
            if (paymentDetails.getDelayDate() > 10) {
                delayDateGreater.add(paymentDetails);
            }
        }//returns objectList
        return delayDateGreater;


    }

    public List<PaymentDetails> delayDateBetweenFiveAndTen() {
        List<PaymentDetails> delayDateMid = new ArrayList<>();

        for (PaymentDetails paymentDetails : paymentDetailsList) {

            //gets delaydate greater than 10


            //gets delaydate greater than 5 and smaller than 10
            if (paymentDetails.getDelayDate() >= 5 && paymentDetails.getDelayDate() <= 10) {
                delayDateMid.add(paymentDetails);
            }
        }
        return delayDateMid;
    }

    public List<PaymentDetails> dataOfYearTwentyTwenty() {

        List<PaymentDetails> dateYearTwentTwenty = new ArrayList<>();
        for (PaymentDetails paymentDetails : paymentDetailsList) {

            //gets data with year 2020
            if (paymentDetails.getYear().equals("2020")) {
                dateYearTwentTwenty.add(paymentDetails);
            }


        }
        return dateYearTwentTwenty;

    }


    public List<PaymentDetails> amountGreaterThanFiftyThousand() {
        List<PaymentDetails> amountGreaterThan = new ArrayList<>();

        for (int i = 0; i < paymentDetailsList.size(); i++) {


            //gets data for amount greater than 50000
            if (paymentDetailsList.get(i).getAmount() > 50000) {
                amountGreaterThan.add(paymentDetailsList.get(i));
            }

        }
        return amountGreaterThan;
    }

    public List<PaymentDetails> amountBetweenTwentyThousandAndSixtyThousand() {
        List<PaymentDetails> amountMidRange = new ArrayList<>();
        for (int i = 0; i < paymentDetailsList.size(); i++) {


//                    Find the data whose amount is in between 20000 and 60000
            if (paymentDetailsList.get(i).getAmount() > 20000 && paymentDetailsList.get(i).getAmount() < 60000) {
                amountMidRange.add(paymentDetailsList.get(i));
            }

        }
        return amountMidRange;
    }


    public double sumOfDelayDate0() {

        double sumOf0DelayDate = 0;
        for (PaymentDetails paymentDetails : paymentDetailsList) {


            //Find the sum of amount whose delay date is 0
            if (paymentDetails.getDelayDate() == 0) {
                sumOf0DelayDate = sumOf0DelayDate + paymentDetails.getAmount();
            }
        }
        return sumOf0DelayDate;
    }


    public List<Double> sumOfAmountByMonth() {
        double sumJan = 0;
        double sumFeb = 0;
        double sumMar = 0;
        double sumApr = 0;
        double sumMay = 0;
        double sumJun = 0;

        for (PaymentDetails paymentDetails : paymentDetailsList) {


            //Find the sum of amount grouping by the month (eg : JAN ko sum , FEB ko sum)

            if (paymentDetails.getMonth().equals("JAN")) {
                sumJan = sumJan + paymentDetails.getAmount();

            }
            if (paymentDetails.getMonth().equals("FEB")) {
                sumFeb = sumFeb + paymentDetails.getAmount();
            }
            if (paymentDetails.getMonth().equals("MAR")) {
                sumMar = sumMar + paymentDetails.getAmount();
            }
            if (paymentDetails.getMonth().equals("APR")) {
                sumApr = sumApr + paymentDetails.getAmount();
            }
            if (paymentDetails.getMonth().equals("MAY")) {
                sumMay = sumMay + paymentDetails.getAmount();
            }
            if (paymentDetails.getMonth().equals("JUN")) {
                sumJun = sumJun + paymentDetails.getAmount();
            }


        }
        List<Double> monthAmount = new ArrayList<>();
        monthAmount.add(sumJan);
        monthAmount.add(sumFeb);
        monthAmount.add(sumMar);
        monthAmount.add(sumApr);
        monthAmount.add(sumMay);
        monthAmount.add(sumJun);

        return monthAmount;
    }

    public List<Double> sumOfAmountByYear() {

        double sumOfYearNineteen = 0;
        double sumOfYearTwenty = 0;
        double sumOfYearTwentyOne = 0;
        double sumOfYearTwentyTwo = 0;
        double sumOfYearTwentyThree = 0;

        for (int i = 0; i < paymentDetailsList.size(); i++) {


            //Find the total amount on yearly basis and on overall


            if (paymentDetailsList.get(i).getYear().equals("2019")) {
                sumOfYearNineteen = sumOfYearNineteen + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getYear().equals("2020")) {
                sumOfYearTwenty = sumOfYearTwenty + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getYear().equals("2021")) {
                sumOfYearTwentyOne = sumOfYearTwentyOne + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getYear().equals("2022")) {
                sumOfYearTwentyTwo = sumOfYearTwentyTwo + paymentDetailsList.get(i).getAmount();
            }
            if (paymentDetailsList.get(i).getYear().equals("2023")) {
                sumOfYearTwentyThree = sumOfYearTwentyThree + paymentDetailsList.get(i).getAmount();
            }


        }

        List<Double> yearlySum = new ArrayList<>();
        yearlySum.add(sumOfYearNineteen);
        yearlySum.add(sumOfYearTwenty);
        yearlySum.add(sumOfYearTwentyOne);
        yearlySum.add(sumOfYearTwentyTwo);
        yearlySum.add(sumOfYearTwentyThree);

        return yearlySum;
    }

    public double sumOverallAmount() {
        double sumOverall = 0;
        for (PaymentDetails paymentDetails : paymentDetailsList) {
            //sum of overall amount
            sumOverall = sumOverall + paymentDetails.getAmount();
        }
        return sumOverall;
    }


    public double totalDelayDate() {
        int totalDelayDate = 0;
        for (PaymentDetails paymentDetails : paymentDetailsList) {


            //Find the total delay date
            totalDelayDate = totalDelayDate + paymentDetails.getDelayDate();
        }
        return totalDelayDate;
    }

    public List<Double> sumOfMaximumDelayDateByYear() {

        double amountYearTnineteen = 0;
        double amountYearTTwenty = 0;
        double amountYearTTwo = 0;
        double amountYearTThree = 0;
        double amountYearTOne = 0;
        double sumMaxALl = 0;


        List<Integer> yearDelayDateTwentyNineteen = new ArrayList<>();
        List<Integer> yearDelayDateTwentyTwenty = new ArrayList<>();
        List<Integer> yearDelayDateTwentyOne = new ArrayList<>();
        List<Integer> yearDelayDateTwentyTwo = new ArrayList<>();
        List<Integer> yearDelayDateTwentyThree = new ArrayList<>();

        for (PaymentDetails details : paymentDetailsList) {


            //Find the sum whose delay date is maximum on every year.
            if (details.getYear().equals("2019")) {
                yearDelayDateTwentyNineteen.add(details.getDelayDate());
                amountYearTnineteen = Collections.max(yearDelayDateTwentyNineteen);

            }
            if (details.getYear().equals("2020")) {

                yearDelayDateTwentyTwenty.add(details.getDelayDate());
                amountYearTTwenty = Collections.max(yearDelayDateTwentyTwenty);

            }
            if (details.getYear().equals("2021")) {

                yearDelayDateTwentyOne.add(details.getDelayDate());
                amountYearTOne = Collections.max(yearDelayDateTwentyOne);

            }
            if (details.getYear().equals("2022")) {

                yearDelayDateTwentyTwo.add(details.getDelayDate());
                amountYearTTwo = Collections.max(yearDelayDateTwentyTwo);

            }
            if (details.getYear().equals("2023")) {
                yearDelayDateTwentyThree.add(details.getDelayDate());
                amountYearTThree = Collections.max(yearDelayDateTwentyThree);

            }

        }
        double sum2019 = 0;
        double sum2020 = 0;
        double sum2021 = 0;
        double sum2022 = 0;
        double sum2023 = 0;


        for (PaymentDetails paymentDetails : paymentDetailsList) {
            if (paymentDetails.getYear().equals("2019")) {
                if (paymentDetails.getDelayDate() == amountYearTnineteen) {
                    sumMaxALl = sumMaxALl + paymentDetails.getAmount();
                    sum2019 = sum2019 + paymentDetails.getAmount();
                }
            }
            if (paymentDetails.getYear().equals("2020")) {
                if (paymentDetails.getDelayDate() == amountYearTTwenty) {
                    sumMaxALl = sumMaxALl + paymentDetails.getAmount();
                    sum2020 = sum2020 + paymentDetails.getAmount();
                }
            }
            if (paymentDetails.getYear().equals("2021")) {
                if (paymentDetails.getDelayDate() == amountYearTOne) {
                    sumMaxALl = sumMaxALl + paymentDetails.getAmount();
                    sum2021 = sum2021 + paymentDetails.getAmount();
                }
            }
            if (paymentDetails.getYear().equals("2022")) {
                if (paymentDetails.getDelayDate() == amountYearTTwo) {

                    sumMaxALl = sumMaxALl + paymentDetails.getAmount();
                    sum2022 = sum2022 + paymentDetails.getAmount();
                }
            }
            if (paymentDetails.getYear().equals("2023")) {
                if (paymentDetails.getDelayDate() == amountYearTThree) {
                    sumMaxALl = sumMaxALl + paymentDetails.getAmount();
                    sum2023 = sum2023 + paymentDetails.getAmount();

                }
            }
        }
        List<Double> sumMaximumDelayYear = new ArrayList<>();
        sumMaximumDelayYear.add(sum2019);
        sumMaximumDelayYear.add(sum2020);
        sumMaximumDelayYear.add(sum2021);
        sumMaximumDelayYear.add(sum2022);
        sumMaximumDelayYear.add(sum2023);
        sumMaximumDelayYear.add(sumMaxALl);

        return sumMaximumDelayYear;
    }

    public static void displayInfo() {

        DataAnalysisClass dataAnalysisClass = new DataAnalysisClass();
        String[] yearArray = new String[5];
        yearArray[0] = "2019";
        yearArray[1] = "2020";
        yearArray[2] = "2021";
        yearArray[3] = "2022";
        yearArray[4] = "2023";

        Scanner scanner = new Scanner(System.in);

        boolean something = true;
        while (something) {
            System.out.println("Please enter the following numbers for action to be performed: ");
            System.out.println(
                    "1. Find the data whose delayDate is greater than 10 \n" +
                            "2. Find the data whose delayDate is between 5 and 10 \n" +
                            "3. Find the data whose year is 2020 \n" +
                            "4. Find the data whose amount is greater than 50000 \n" +
                            "5. Find the data whose amount is in between 20000 and 60000 \n" +
                            "6. Find the sum of amount whose delay date is 0 \n" +
                            "7. Find the sum of amount grouping by the month (eg : JAN ko sum , FEB ko sum)\n" +
                            "8. Find the total amount on yearly basis \n" +
                            "9. Find the total amount  on overall\n" +
                            "10. Find the total delay date\n" +
                            "11. Find the sum whose delay date is maximum on every year.\n" +
                            "Please ENTER 0 to exit.");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 0:
                    something = false;
                    break;

                case 1:
                    System.out.println("The data whose delayDate is greater than 10 are: ");
                    System.out.println();

                    for (int i = 0; i < dataAnalysisClass.delayDateGreaterThanTen().size(); i++) {
                        System.out.println(dataAnalysisClass.delayDateGreaterThanTen().get(i));
                    }
                    System.out.println("**************************");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("The data whose delayDate is between 5 and 10 are: ");
                    System.out.println();

                    for (int i = 0; i < dataAnalysisClass.delayDateBetweenFiveAndTen().size(); i++) {
                        System.out.println(dataAnalysisClass.delayDateBetweenFiveAndTen().get(i));
                    }
                    System.out.println("**************************");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("The data whose year is 2020 are: ");
                    System.out.println();

                    for (int i = 0; i < dataAnalysisClass.dataOfYearTwentyTwenty().size(); i++) {
                        System.out.println(dataAnalysisClass.dataOfYearTwentyTwenty().get(i));
                    }
                    System.out.println("**************************");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("The data whose amount is greater than 50000  are: ");
                    System.out.println();

                    for (int i = 0; i < dataAnalysisClass.amountGreaterThanFiftyThousand().size(); i++) {
                        System.out.println(dataAnalysisClass.amountGreaterThanFiftyThousand().get(i));
                    }
                    System.out.println("**************************");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("The data whose amount is in between 20000 and 60000 are: ");
                    System.out.println();

                    for (int i = 0; i < dataAnalysisClass.amountBetweenTwentyThousandAndSixtyThousand().size(); i++) {
                        System.out.println(dataAnalysisClass.amountBetweenTwentyThousandAndSixtyThousand().get(i));
                    }
                    System.out.println("**************************");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("The sum of amount whose delay date '0'  is: " + dataAnalysisClass.sumOfDelayDate0());

                    System.out.println("**************************");
                    System.out.println();
                    break;
                case 7:
                    String[] monthsArray = new String[6];
                    monthsArray[0] = "JAN";
                    monthsArray[1] = "FEB";
                    monthsArray[2] = "MAR";
                    monthsArray[3] = "APR";
                    monthsArray[4] = "MAY";
                    monthsArray[5] = "JUN";
                    System.out.println("The sum of amount grouping by the month are: ");

                    System.out.println();
                    System.out.println("Month  " + " Amount");
                    for (int i = 0; i < dataAnalysisClass.sumOfAmountByMonth().size(); i++) {
                        System.out.println(monthsArray[i] + "  :  " + dataAnalysisClass.sumOfAmountByMonth().get(i));
                    }
                    System.out.println("**************************");
                    System.out.println();
                    break;
                case 8:

                    System.out.println("The total amount on yearly basis are: ");
                    System.out.println();
                    System.out.println("Year   Total Amount");

                    for (int i = 0; i < dataAnalysisClass.sumOfAmountByYear().size(); i++) {
                        System.out.println(yearArray[i] + " :  " + dataAnalysisClass.sumOfAmountByYear().get(i));
                    }
                    System.out.println("**************************");
                    System.out.println();
                    break;
                case 9:
                    System.out.println("The total amount  on overall is: " + dataAnalysisClass.sumOverallAmount());
                    System.out.println("**************************");
                    System.out.println();
                    break;
                case 10:
                    System.out.println("The total delay date count is: " + dataAnalysisClass.totalDelayDate());
                    System.out.println("**************************");
                    System.out.println();
                    break;
                case 11:
                    System.out.println("The sum of whose delay date is maximum on every year are: ");
                    System.out.println();
                    System.out.println("Year |||   Max Delay Amount");
                    for (int i = 0; i < dataAnalysisClass.sumOfMaximumDelayDateByYear().size() - 1; i++) {
                        System.out.println(yearArray[i] + "   :   " + dataAnalysisClass.sumOfMaximumDelayDateByYear().get(i));
                    }
                    System.out.println("Overall Total amount is " + dataAnalysisClass.sumOfMaximumDelayDateByYear().get(5));

                    System.out.println("**************************");
                    System.out.println();
                    break;

                default:
                    System.out.println("Please enter a valid input");
            }
        }

    }


}
