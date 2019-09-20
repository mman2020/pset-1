/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */
import java.text.NumberFormat;
public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

        final double LENGTH = 8.5;
        final double WIDTH = 11;
        final double INCH_TO_MILLIMETERS = 25.4;
        double lengthMM = LENGTH * INCH_TO_MILLIMETERS;
        double widthMM = WIDTH * INCH_TO_MILLIMETERS;
        double area = lengthMM * widthMM;
        double areaRound = Math.round(area * 100.0)/100.0;
        System.out.printf("\n%,.2f %s", areaRound, "square millimeters.\n");

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
         final double INCH_TO_CENTIMETERS = 2.54;
         double lengthCM = LENGTH * INCH_TO_CENTIMETERS;
         double widthCM = WIDTH * INCH_TO_CENTIMETERS;
         double perimeter = (lengthCM * 2) + (widthCM * 2);
         double perimeterRound = Math.round(perimeter * 100.0)/100.0;
         System.out.println("\n" + perimeter + " centimeters." + "\n");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
         double widthDouble = WIDTH * WIDTH;
         double lengthDouble = LENGTH * LENGTH;
         double diagonal = Math.round(java.lang.Math.sqrt(lengthDouble + widthDouble)*100.0)/100.0;
         System.out.println(diagonal + " inches. \n");


        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        final int HOMEWORK1 = 88;
        final int HOMEWORK2 = 91;
        final int HOMEWORK3 = 0;
        final int QUIZ1 = 84;
        final int QUIZ2 = 89;
        final int QUIZ3 = 93;
        final int TEST1 = 74;
        final int TEST2 = 87;
        final int TEST3 = 82;

        double averageHomework = (HOMEWORK1 + HOMEWORK2 + HOMEWORK3);
        double averageHomework2 = averageHomework/3;
        final double HOMEWORK_WEIGHT = 0.15;
        double finalHomework = averageHomework2 * HOMEWORK_WEIGHT;
        double averageQuiz = (QUIZ1 + QUIZ2 + QUIZ3);
        double averageQuiz2 = averageQuiz/3;
        final double QUIZ_WEIGHT = 0.35;
        double finalQuiz = averageQuiz2 * QUIZ_WEIGHT;
        double averageTest = (TEST1 + TEST2 + TEST3);
        double averageTest2 = averageTest/3;
        final double TEST_WEIGHT = 0.5;
        double finalTest = TEST_WEIGHT * averageTest2;
        double finalGrade = Math.round((finalHomework + finalTest + finalQuiz)*100.0)/100.0;
        System.out.println(finalGrade + "%\n");


        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         final double HOURLY_WAGE = 12.50;
         final double MONDAY_HOUR = 7.5;
         final double TUESDAY_HOUR = 8;
         final double WEDNESDAY_HOUR = 10.5;
         final double THURSDAY_HOUR = 9.5;
         final double FRIDAY_HOUR = 6;
         final double SATURDAY_HOUR = 11.5;
         final double SUNDAY_HOUR = 0;
         double totalWage = Math.round(HOURLY_WAGE*(MONDAY_HOUR+TUESDAY_HOUR+WEDNESDAY_HOUR+THURSDAY_HOUR+FRIDAY_HOUR+SATURDAY_HOUR+SUNDAY_HOUR)*100.0)/100.0;
         NumberFormat currencyformat = NumberFormat.getCurrencyInstance();
         System.out.printf(currencyformat.format(totalWage) + ".\n");

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */
         final double SALARY = 117000;
         double biweekly = 117000/24;
         final double FEDERAL_TAX = 0.24;
         final double STATE_TAX = 0.0637;
         final double CONTRIBUTION = 0.07;
         double salaryContribution = (1-CONTRIBUTION) * biweekly;
         double finalSalary = (1-STATE_TAX) * (1-FEDERAL_TAX) * salaryContribution;
         System.out.printf("\n" + currencyformat.format(finalSalary) + ".\n");


        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
         final int STUDENT_COUNT = 273;
         final int TEACHER_COUNT = 28;
         final int BUS_CAPACITY = 54;
         int PEOPLE_COUNT = STUDENT_COUNT + TEACHER_COUNT;
         int BUS_COUNT = (PEOPLE_COUNT/BUS_CAPACITY)+1;
         int finalBusCount = PEOPLE_COUNT % BUS_CAPACITY;
         System.out.println("\n" + BUS_COUNT + " buses are needed, with " + finalBusCount + " passengers on the last bus. \n");

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */




        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}
